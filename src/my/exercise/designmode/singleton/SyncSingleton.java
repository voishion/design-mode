package my.exercise.designmode.singleton;

public class SyncSingleton {
	/* 持有私有静态实例，防止被引用，此处赋值为null，目的是实现延迟加载 */
    private static SyncSingleton instance = null;
    
    /* 私有构造方法，防止被实例化 */
    private SyncSingleton() {
    }
    
    /* 如果我们把它放入多线程的环境下，肯定就会出现问题了，如何解决？我们首先会想到对getInstance方法加synchronized关键字
    public static synchronized SyncSingleton getInstance() {
        if (instance == null) {
            instance = new SyncSingleton();
        }
        return instance;
    } */
    
    /**
     * 如果我们把它放入多线程的环境下，肯定就会出现问题了，如何解决？我们首先会想到对getInstance方法加synchronized关键字
    public static SyncSingleton getInstance() {
        if (instance == null) {
        	synchronized (instance) {
        		instance = new SyncSingleton();
			}
        }
        return instance;
    }*/
    
	/**
	 * 似乎解决了之前提到的问题，将synchronized关键字加在了内部，也就是说当调用的时候是不需要加锁的，只有在instance为null， 并创建对象的时候才需要加锁
	 * ，性能有一定的提升。但是，这样的情况，还是有可能有问题的，看下面的情况：在Java指令中创建对象和赋值操作是分开进行的，
	 * 也就是说instance = new Singleton();语句是分两步执行的。但是JVM并不保证这两个操作的先后顺序，也就是说有可能JVM会为新的Singleton实例分配空间
	 * ，然后直接赋值给instance成员，然后再去初始化这个Singleton实例。这样就可能出错了，我们以A、B两个线程为例：
	 * a>A、B线程同时进入了第一个if判断 
	 * b>A首先进入synchronized块，由于instance为null，所以它执行instance =new Singleton();
	 * c>由于JVM内部的优化机制，JVM先画出了一些分配给Singleton实例的空白内存，并赋值给instance成员 （注意此时JVM没有开始初始化这个实例），然后A离开了synchronized块。
	 * d>B进入synchronized块，由于instance此时不是null ，因此它马上离开了synchronized块并将结果返回给调用该方法的程序。
	 * e>此时B线程打算使用Singleton实例，却发现它没有被初始化，于是错误发生了。 所以程序还是有可能发生错误，其实程序在运行过程是很复杂的，从这点我们就可以看出
	 * ，尤其是在写多线程环境下的程序更有难度，有挑战性。我们对该程序做进一步优化：
	 */
    
    /* JVM内部的机制能够保证当一个类被加载的时候，这个类的加载过程是线程互斥的。这样当我们第一次调用getInstance的时候，
     * JVM能够帮我们保证instance只被创建一次，并且会保证把赋值给instance的内存初始化完毕，这样我们就不用担心上面的问题
     * 此处使用一个内部类来维护单例 */
	private static class SingletonFactory {
		private static final SyncSingleton instance = new SyncSingleton();
	}

	/* 获取实例 */
	public static SyncSingleton getInstance() {
		return SingletonFactory.instance;
	}
    
	/**
	 * 也有人这样实现：因为我们只需要在创建类的时候进行同步，所以只要将创建和getInstance()分开，单独为创建加synchronized关键字，也是可以的
	 
	private static synchronized void syncInit() {
		if (instance == null) {
			instance = new SingletonTest();
		}
	}

	public static SingletonTest getInstance() {
		if (instance == null) {
			syncInit();
		}
		return instance;
	}*/
    
    /* 如果该对象被用于序列化，可以保证对象在序列化前后保持一致 */
    public Object readResolve() {
        return instance;
    }
}
