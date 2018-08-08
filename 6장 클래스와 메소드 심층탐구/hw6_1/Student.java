/*
 * 파일명: Student.java
 * 작성일: 2018.4.10
 * 작성자: 홍준성
 * 내용: 학생 프로그램 작성
 */
package hw6_1;

public class Student { // 3가지 private 필드
	private int studentNum ;
	private String name;
	private double score;

	public void setStudentNum(int num) { //학번 setter
		studentNum = num;
	}
	
	public int getStudentNum() { //학번 getter
		return studentNum;
	}
	
	public void setName(String a) { //이름 setter
		name = a;
	}
	
	public String getName() { //이름 getter
		return name;
	}
	
	public void setScore(double num) { //성적 setter
		score = num;
	}
	
	public double getScore() { //성적 getter
		return score;
	}
	
	public boolean pass(double num) { //합격여부 조회 - 기준성적을 매개변수로 받아 성적이 그 이상이면 true, 아니면 false 리턴
		if(score >= num)
			return true;
		else
			return false;
	}
}
