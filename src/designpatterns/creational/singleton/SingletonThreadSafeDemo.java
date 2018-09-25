package designpatterns.creational.singleton;


public class SingletonThreadSafeDemo {

	public static void main(String[] args) throws InterruptedException {
//		System.out.println(SingletonThreadSafe.getInstance());
//		System.out.println(SingletonThreadSafe.getInstance());
		
		MyThreadSingleton mts1=new MyThreadSingleton();
		Thread t1=new Thread(mts1);
		t1.setName("t1");
		
		MyThreadSingleton mts2=new MyThreadSingleton();
		Thread t2=new Thread(mts2);
		t2.setName("t2");
		
		MyThreadSingleton mts3=new MyThreadSingleton();
		Thread t3=new Thread(mts3);
		t3.setName("t3");
		
		
		t1.start();
		t1.join();
		t2.start();
		t2.join();
		t3.start();
		t3.join();

	}

}

class SingletonThreadSafe{
	private static SingletonThreadSafe _instance=null;
	
	private static Object lock=new Object();
	
	private SingletonThreadSafe(){}
	
	/*public static synchronized SingletonThreadSafe getInstance() {
		if(_instance==null) {
			_instance= new SingletonThreadSafe();
		}
		return _instance;
	}*/
	
	public static SingletonThreadSafe getInstance() {
		if(_instance==null) {
			synchronized(lock) {
				if(_instance==null) {
					_instance= new SingletonThreadSafe();
				}
			}
		}
		return _instance;
	}
}

class MyThreadSingleton implements Runnable{

	@Override
	public void run() {
		System.out.println("Thread "+Thread.currentThread().getName()+":"+SingletonThreadSafe.getInstance());
		
	}
	
}
