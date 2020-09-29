package hw11_1;

public class Student { 
	private int stdnum; //�ν��Ͻ� ���� stdnum�� age ���� 
	private int age;

	public Student() { //�޼ҵ� ȣ���� ����..
	}

	public Student(int stdnum, int age) { 
		this.stdnum = stdnum;
		this.age = age;
	}

	public String toString() { //����� ���� �޼ҵ�
		return "�й�: "+stdnum+"  ����: "+ age;
	}

	public void insertionSort(Student [] s) { //�������� �޼ҵ�
		int anum,snum; //������ ���� ����
		int j, i; //�ݺ����� ���� ����
		for(i=1; i<s.length; i++) {
			anum = s[i].age;
			snum = s[i].stdnum;
			for(j = i-1; (j>=0) && (anum<s[j].age); j--) {
				s[j+1].age = s[j].age;
				s[j+1].stdnum = s[j].stdnum;
			}
			s[j+1].age = anum;
			s[j+1].stdnum = snum;
		}
	}
}
