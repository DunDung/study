package 예제문제;
class ShareObject {
	int sum;

	synchronized void add(int n) {
		sum += n;
	}

	synchronized void sub(int n) {
		sum -= n;
	}

}

class ThreadOne extends Thread {
	ShareObject s;

	public ThreadOne(ShareObject s) {
		this.s = s;
	}
	@Override 
	public void run() {
		for(int i=1; i<=100; i++)
			s.add(i);
	}
}

class ThreadTwo extends Thread {
	ShareObject s;

	public ThreadTwo(ShareObject s) {
		this.s = s;
	}
	@Override 
	public void run() {
		for(int i=1; i<=100; i++)
			s.sub(i);
	}
}

public class ThreadExample {

	public static void main(String[] args) {
		ShareObject s = new ShareObject();
		ThreadOne t1 = new ThreadOne(s);
		ThreadTwo t2 =new ThreadTwo(s);
		
		t1.start();
		t2.start();
		System.out.println(s.sum);
	}

}
