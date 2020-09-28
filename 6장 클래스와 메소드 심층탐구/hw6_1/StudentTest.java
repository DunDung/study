/*
 * 파일명: StudentTest.java
 * 작성일: 2018.4.11
 * 작성자: 홍준성
 * 내용: 학생 프로그램 작성
 */
package lab6_1;

public class StudentTest {

	public static void main(String[] args) {
		System.out.println("lab6_1: 홍준성");
		
		Student s = new Student();
		
		s.setStudentNum(201432041);
		System.out.println("학번 = "+s.getStudentNum());
	}

}
