/*
 * ���ϸ�: Member.java
 * �ۼ���: 2018.4.5
 * �ۼ���: ȫ�ؼ�
 * ����: ȸ���� ��Ÿ���� Ŭ����
 */
package hw5_1;

public class Member {
	int grade;
	int point;
	
	public void setGrade(int num) { //num�� ȸ��������� ����
		grade = num;
	}
	public void addPoing() { //��޿� ���� ����Ʈ�� ������
		if(grade == 1)
			point += 100;
		else if(grade == 2)
			point += 50;
		else if(grade == 3)
			point += 40;
		else
			point += 10;
	}
	public double getDiscountRate() { //����Ʈ�� ���� ������ ��ȸ
		if(point >= 100)
			return 0.2;
		else 
			return 0.1;
	}
}
