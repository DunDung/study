/*
 * ���ϸ�: Student.java
 * �ۼ���: 2018.4.10
 * �ۼ���: ȫ�ؼ�
 * ����: �л� ���α׷� �ۼ�
 */
package hw6_1;

public class Student { // 3���� private �ʵ�
	private int studentNum ;
	private String name;
	private double score;

	public void setStudentNum(int num) { //�й� setter
		studentNum = num;
	}
	
	public int getStudentNum() { //�й� getter
		return studentNum;
	}
	
	public void setName(String a) { //�̸� setter
		name = a;
	}
	
	public String getName() { //�̸� getter
		return name;
	}
	
	public void setScore(double num) { //���� setter
		score = num;
	}
	
	public double getScore() { //���� getter
		return score;
	}
	
	public boolean pass(double num) { //�հݿ��� ��ȸ - ���ؼ����� �Ű������� �޾� ������ �� �̻��̸� true, �ƴϸ� false ����
		if(score >= num)
			return true;
		else
			return false;
	}
}
