package my.exercise.designmode.template2;

/**
 * @author lilu
 */
public abstract class Game {

    /**
     * 初始化游戏
     */
    abstract void initialize();

    /**
     * 开始游戏
     */
    abstract void startPlay();

    /**
     * 结束游戏
     */
    abstract void endPlay();

    /**
     * 模板
     */
    public final void play() {

        initialize();

        startPlay();

        endPlay();
    }

}
