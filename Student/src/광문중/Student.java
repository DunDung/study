package 광문중;

public class Student implements Comparable<Student>{

	String 이름;
	int 학년;
	int 반;
	int 번호;
	String 금액;
	String 지원여부;
	
	public String get지원여부() {
		return 지원여부;
	}
	public void set지원여부(String 지원여부) {
		this.지원여부 = 지원여부;
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
		return 학년+" "+반+" "+번호+" "+이름+" "+금액+" "+지원여부;
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




	public String get금액() {
		return 금액;
	}




	public void set금액(String 금액) {
		this.금액 = 금액;
	}




	@Override
	public int hashCode() {
		final int prime = 31;
		int result = 1;
		result = prime * result + ((금액 == null) ? 0 : 금액.hashCode());
		result = prime * result + 반;
		result = prime * result + 번호;
		result = prime * result + ((이름 == null) ? 0 : 이름.hashCode());
		result = prime * result + 학년;
		return result;
	}




	@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (obj == null)
			return false;
		if (getClass() != obj.getClass())
			return false;
		Student other = (Student) obj;
		if (금액 == null) {
			if (other.금액 != null)
				return false;
		} else if (!금액.equals(other.금액))
			return false;
		if (반 != other.반)
			return false;
		if (번호 != other.번호)
			return false;
		if (이름 == null) {
			if (other.이름 != null)
				return false;
		} else if (!이름.equals(other.이름))
			return false;
		if (학년 != other.학년)
			return false;
		return true;
	}
	
	

}
