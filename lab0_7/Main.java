//파일명 : Main.java
//작성자 : 201432041 홍준성
//작성일 : 2017년 9월 11일
//설명 : 정수 리스트를 관리하는 MyList 클래스를 작성하고 사용하는 프로그램
package lab0_7;

public class Main {

	public static void main(String[] args) {
		System.out.println("lab0_7 : 홍준성");
		
		MyList list = new MyList();
		
		list.print();
		
		list.add(2);
		list.print();
		
		list.add(3);
		list.print();
		
		list.add(2);
		list.print();

	}

}
