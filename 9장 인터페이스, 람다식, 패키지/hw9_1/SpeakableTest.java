/*
 * ���ϸ�: SpeakableTest.java
 * �ۼ���: 2018.5.17
 * �ۼ���: ȫ�ؼ�
 * ����: Speakable �������̽��� �����ϰ�, �̸� ������ Person, Dog Ŭ������ �����ϰ� �̿��ϴ� ���α׷�
*/
package hw9_1;

public class SpeakableTest {

	public static void main(String[] args) {
		System.out.println("hw9_1: ȫ�ؼ�\n");
		Speakable [] s = new Speakable[4]; //(1) ũ�Ⱑ 4�� Speakble �迭�� ����
		
		//(2) Person ��ü 2��, Dog ��ü 2���� �����Ͽ� �迭�� ���� �̶� �ʵ� ���� ������ �ʱ�ȭ(�Ǵ� ����)�� ��
		s[0] = new Person("������"); 
		s[1] = new Person("ȫ�浿");
		s[2] = new Dog(2);
		s[3] = new Dog(5);
		
		//(3) �ݺ����� �̿��Ͽ� ������ ����: ��� �迭 ���� ��ü�� ���� speak()�� ȣ���ϰ�,
		// ���� �迭 ���Ұ� ����̸� �߰��� �̸��� ��ȸ(getName() ȣ��)�Ͽ� ����� ��
		
		for(int i = 0; i<4; i++) {
			if(s[i] instanceof Person) {
				s[i].speak();
				System.out.println(((Person)s[i]).getName()+"�Դϴ�.");
			}
			else
				s[i].speak();
			System.out.println("");
		}
		
	}
}
