package Multithreading;

public class UserThread extends Thread {
	public void run() {
		for(int i=1;i<=10;i++) {
			try {
				Thread.sleep(1000);
			} catch (InterruptedException e) {
				e.printStackTrace();
			}
			System.out.println("Thread Started : "+Thread.currentThread().getId());
		}
	}
	public static void main(String[] args) throws InterruptedException {
		UserThread ut1=new UserThread();
		ut1.setPriority(MAX_PRIORITY);
		ut1.start();//Start run method internally
		
		UserThread ut2=new UserThread();
		ut2.start();
		
		System.out.println("Main Method");
	}
}
