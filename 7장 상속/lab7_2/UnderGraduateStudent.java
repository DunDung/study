package lab7_2;

public class UnderGraduateStudent extends Student{
	
	public UnderGraduateStudent(int id, double score) {
		super(id, score);
	}
	
	@Override
	public boolean warning() {
		if(getScore()<1.5)
			return true;
		else
			return false;
	}

}
