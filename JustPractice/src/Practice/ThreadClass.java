package Practice;

class mythread extends Thread {

	public void run() {
		for (int i = 1; i <= 6; i++) {
			System.out.println("Thread " + Thread.currentThread().getId() + " - Count " + i);
		}
	}
}

public class ThreadClass {

	public static void main(String[] args) {

		mythread thread = new mythread();
		thread.start();
//		thread.stop();

	}

}
