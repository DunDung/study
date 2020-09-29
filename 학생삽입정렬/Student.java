package hw11_1;

public class Student { 
	private int stdnum; //인스턴스 변수 stdnum과 age 생성 
	private int age;

	public Student() { //메소드 호출을 위한..
	}

	public Student(int stdnum, int age) { 
		this.stdnum = stdnum;
		this.age = age;
	}

	public String toString() { //출력을 위한 메소드
		return "학번: "+stdnum+"  나이: "+ age;
	}

	public void insertionSort(Student [] s) { //삽입정렬 메소드
		int anum,snum; //스왑을 위한 변수
		int j, i; //반복문을 위한 변수
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
