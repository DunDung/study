package ������;

public class Student implements Comparable<Student>{

	String �̸�;
	int �г�;
	int ��;
	int ��ȣ;
	int �ݾ�;
	int ����;
	
	
	public int get����() {
		return ����;
	}
	public void set����(int ����) {
		this.���� = ����;
	}
	public Student(int �г�, int ��, int ��ȣ, String �̸�) {
		this.�̸� = �̸�;
		this.�г� = �г�;
		this.�� = ��;
		this.��ȣ = ��ȣ;
	}
	@Override
	public int compareTo(Student o) {
		int r = this.�г� - o.�г�;
		if(r==0)
			r=this.��-o.��;
		if(r==0)
			r=this.��ȣ -o.��ȣ;
		if(r==0)
			r=this.�̸�.compareTo(o.�̸�);
		return r;
	}

	@Override
	public String toString() {
		return �г�+" "+��+" "+��ȣ+" "+�̸�+" "+�ݾ�+" "+����;
	}

	public String get�̸�() {
		return �̸�;
	}

	public void set�̸�(String �̸�) {
		this.�̸� = �̸�;
	}

	public int get�г�() {
		return �г�;
	}

	public void set�г�(int �г�) {
		this.�г� = �г�;
	}

	public int get��() {
		return ��;
	}

	public void set��(int ��) {
		this.�� = ��;
	}

	public int get��ȣ() {
		return ��ȣ;
	}

	public void set��ȣ(int ��ȣ) {
		this.��ȣ = ��ȣ;
	}

	public int get�ݾ�() {
		return �ݾ�;
	}

	public void set�ݾ�(int �ݾ�) {
		this.�ݾ�+=�ݾ�;
	}

}
