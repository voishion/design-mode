package my.exercise.designmode.facade;

public class Computer {
	private Cpu cpu;
	private Hard hard;
	private Memory memory;

	public Computer(){
		cpu = new Cpu();
		hard = new Hard();
		memory = new Memory();
	}
	
	public void start(){
		cpu.start();
		hard.start();
		memory.start();
	}
	
	public void stop(){
		cpu.stop();
		hard.stop();
		memory.stop();
	}
}
