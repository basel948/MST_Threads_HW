package Examples;
public class SimpleThread extends Thread {

	// override run and extends thread
	public SimpleThread(String str) {
		super(str);
	}

	// print: Thread.currentThread().getId()
	@Override
	public void run() {
		for (int i = 0; i < 10; i++) {
			System.out.println(i + " " + getName());
			System.out.println(Thread.currentThread().getPriority());
			try {
				sleep((long) (Math.random() * 1000));
			} catch (InterruptedException e) {
				e.getStackTrace();
			}
		}
		System.out.println("DONE! " + getName());
	}

	public static void main(String[] args) {
		new SimpleThread("thread1").start();
		new SimpleThread("thread2").start();

		System.out.println("Hi Assaf" + Thread.currentThread().getPriority());
	}
}
