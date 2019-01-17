package 광문중;

public class Student implements Comparable<Student>{

	String 이름;
	int 학년;
	int 반;
	int 번호;
	int 금액;
	int 순위;
	
	
	public int get순위() {
		return 순위;
	}
	public void set순위(int 순위) {
		this.순위 = 순위;
	}
	public Student(int 학년, int 반, int 번호, String 이름) {
		this.이름 = 이름;
		this.학년 = 학년;
		this.반 = 반;
		this.번호 = 번호;
	}
	@Override
	public int compareTo(Student o) {
		int r = this.학년 - o.학년;
		if(r==0)
			r=this.반-o.반;
		if(r==0)
			r=this.번호 -o.번호;
		if(r==0)
			r=this.이름.compareTo(o.이름);
		return r;
	}

	@Override
	public String toString() {
		return 학년+" "+반+" "+번호+" "+이름+" "+금액+" "+순위;
	}

	public String get이름() {
		return 이름;
	}

	public void set이름(String 이름) {
		this.이름 = 이름;
	}

	public int get학년() {
		return 학년;
	}

	public void set학년(int 학년) {
		this.학년 = 학년;
	}

	public int get반() {
		return 반;
	}

	public void set반(int 반) {
		this.반 = 반;
	}

	public int get번호() {
		return 번호;
	}

	public void set번호(int 번호) {
		this.번호 = 번호;
	}

	public int get금액() {
		return 금액;
	}

	public void set금액(int 금액) {
		this.금액+=금액;
	}

}
