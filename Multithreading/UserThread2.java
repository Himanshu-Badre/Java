package Multithreading;

public class UserThread2 {

	 public void run() {
		 for(int i=1;i<=10;i++) {
			 
						 try {
							Thread.sleep(1000);
						} catch (InterruptedException e) {
							e.printStackTrace();
						}
						 
				System.out.println("Thread started...."+Thread.currentThread().getId());
		 }
	} 
	
	public static void main(String args[]) throws InterruptedException {
		
		UserThread ut1 = new UserThread(); 
		
		Thread t1 = new Thread(ut1);
		
		t1.start();
		
		t1.setPriority(0);;
		
		t1.start();
				
		UserThread ut2 =new UserThread();
		Thread t2 = new Thread(ut2);

		t2.start(); 
				
		System.out.println("Main method ends here");

		
	}
}
