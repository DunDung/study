/*
 * 파일명: Member.java
 * 작성일: 2018.4.5
 * 작성자: 홍준성
 * 내용: 회원을 나타내는 클래스
 */
package hw5_1;

public class Member {
	int grade;
	int point;
	
	public void setGrade(int num) { //num을 회원등급으로 지정
		grade = num;
	}
	public void addPoing() { //등급에 따라 포인트를 더해줌
		if(grade == 1)
			point += 100;
		else if(grade == 2)
			point += 50;
		else if(grade == 3)
			point += 40;
		else
			point += 10;
	}
	public double getDiscountRate() { //포인트에 따라 할인율 조회
		if(point >= 100)
			return 0.2;
		else 
			return 0.1;
	}
}
