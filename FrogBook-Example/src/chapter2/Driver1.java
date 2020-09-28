package chapter2;

public class Driver1 {

	public static void main(String[] args) {
		동물[] animals = new 동물[3];
		
		animals[0] = new 동물();
		animals[1] = new 포유류();
		animals[2] = new 고래();
		
		for(int i=0; i<animals.length; i++) {
			animals[i].showMe();
		}
	}
}
