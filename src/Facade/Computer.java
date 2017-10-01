package Facade;

public class Computer {


		private CPU cpu;
		private Disk disk;
		private Memory memory;
		
		public Computer{
			cpu=new CPU();
			disk=new Disk();
			memory=new Memory();
		}
		
		public void startup(){
			
			System.out.println("start the computer");
			cpu.startup();
			disk.startup();
			memory.startup();
		}
		
		public void shutdown(){
			System.out.println("close the computer");
			cpu.shutdown();
			memory.shutdown();
			disk.shutdown();
		}
		
		

	
}
