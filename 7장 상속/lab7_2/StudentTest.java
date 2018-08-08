/*
 * 파일명: StudentTest.java
 * 작성일: 2018.5.10
 * 작성자: 홍준성
 * 내용: 다음과 같은 학사 관리를 위해 학생을 abstract class로 정의하고, 이를 상속하는 학부생, 대학원생 클래스를 정의하고 사용해보자.
 */
package lab7_2;

public class StudentTest {

	public static void main(String[] args) {
		System.out.println("lab7_2: 홍준성");
		//(1) 학번 11, 학점 1.5로 초기화한 학부생을 생성
		UnderGraduateStudent u = new UnderGraduateStudent(11, 1.5);
		//(2) 학번 222, 학점 1.5로 초기화한 대학원생을 생성
		GraduateStudent g = new GraduateStudent(222, 1.5);
		//(3) 학부생의 학번, 학점, 학사경고 여부를 조회하여 출력
		System.out.println(u.getId()+" "+u.getScore()+" "+u.warning()); 
		//(4) 대학원생의 학번, 학점, 학사경고 여부를 조회하여 출력
		System.out.println(g.getId()+" "+g.getScore()+" "+g.warning()); 
	}
}
