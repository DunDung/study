package chapter2;

public class Driver1 {

	public static void main(String[] args) {
		����[] animals = new ����[3];
		
		animals[0] = new ����();
		animals[1] = new ������();
		animals[2] = new ��();
		
		for(int i=0; i<animals.length; i++) {
			animals[i].showMe();
		}
	}
}
