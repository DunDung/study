/*
 * ���ϸ�: TelevisionTest.java
 * �ۼ���: 2018.3.29
 * �ۼ���: ȫ�ؼ�
 * ����: �ڷ������� ��Ÿ���� Television Ŭ������ �����ϰ�, Television �迭�� �̿��ϴ� ���α׷�  
 */
package lab5_2;

public class TelevisionTest {

	public static void main(String[] args) {
		System.out.println("lab5_2: ȫ�ؼ�\n");
		Television t[] = new Television[3];
		t[0] = new Television();
		t[1] = new Television();
		t[2] = new Television();
		
		t[0].channel = 7;
		t[1].channel = 9;
		t[2].channel = 11;
		
		for(int i=0; i<3; i++)
			System.out.print(t[i].channel+" ");

	}

}
