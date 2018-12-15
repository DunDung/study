package e2018.exam1;


public class Person {
    String name;
    String no;
    int year;
    double grade;

    public Person(String name, String no,int year, double grade) {
        this.name = name;
        this.no = no;
        this.year = year;
        this.grade = grade;
    }
    
    @Override
    public boolean equals(Object obj) {
    	if(obj instanceof Person) {
    		Person p = (Person)obj;
    		return this.name.equals(p.name) && this.no.equals(p.no) && this.year == p.year && this.grade == p.grade; 
    	}
    	return false;
    }
}
