package lab0_6;

public class MyPair {
	public int x;
	public int y;
	
	public MyPair(int x, int y) {
		this.x = x;
		this.y = y;
	}
		
		public int sum() {
			return x+y;
		}
		
		public double average() {
			return ((double) x+(double)y)/2;
	    }
		public void swap() {
			int z = 0;
			z = x;
			x = y;
			y = z;
		}
		@Override
		public String toString() {
			return "MyPair [x ="+x+", y ="+y+"]";
		}
}
