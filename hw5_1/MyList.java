package hw5_1;

public class MyList {

	private int[] array;
	private int capacity;
	private int count;

	public MyList() {
		array = new int[10]; //길이가 10일 array배열 생성
		capacity = 10; //저장용량
		count = 0; //배열의 현재 길이
	}

	public void add(int a) { //count를 이용하여 정수 값을 배열에 저장
		if(count == 10) {
			System.out.println("용량증가 10-->20");
			int copy[] = new int[20];
			for(int i=0; i<array.length; i++) {
				copy[i] = array[i];
			}
			array = copy;
			array[count] = a;
			count ++;
		}
		if(count == 20) {
			System.out.println("용량증가 20-->40");
			int copy2[] = new int[40];
			for(int i=0; i<array.length; i++) {
				copy2[i] = array[i];
			}
			array = copy2;
			array[count] = a;
			count ++;
		}
		else {
			array[count] = a;
			count++;

		}
	}

	public void print() { //list를 출력
		System.out.print("[");
		for (int i=0; i < count; i++) {
			if(i>0) {
				System.out.print(", ");
			}
			System.out.print(array[i]);
		}
		System.out.println("]");
	}

	public int get(int index) { //매개변수로 받은 index의 값을 리턴
		if(index<array.length) { 
			System.out.println(프로그램 멈추기);
		}
		return array[index];
	}

	public int set(int a, int num) {  //매개변수로 받은 인덱스a의 값을 num으로 갱신
		if(a<array.length) { 
			System.out.println(프로그램 멈추기);
		}
		return array[a] = num;
	}

	public int size() { //list의 크기를 리턴
		return count;
	}
	public int add(int a, int b) { //인덱스a에 b의 값을 삽입
		if(count == 10) {
			System.out.println("용량증가 10-->20");
			int copy[] = new int[20];
			for(int i=0; i<array.length; i++) {
				copy[i] = array[i];
			}
			array = copy;
			array[count] = a;
			count ++;
			int y = count; 
			for(int i = a; i < count; i++) {
				array[y] = array[y-1]; 
				y--;
			}
			count++;
			return array[a] = b;
		}
		if(count == 20) {
			System.out.println("용량증가 20-->40");
			int copy2[] = new int[40];
			for(int i=0; i<array.length; i++) {
				copy2[i] = array[i];
			}
			array = copy2;
			array[count] = a;
			count ++;
			int y = count; 
			for(int i = a; i < count; i++) {
				array[y] = array[y-1]; 
				y--;
			}
			count++;
			return array[a] = b;
		}
		int y = count; 
		for(int i = a; i < count; i++) {
			array[y] = array[y-1]; 
			y--;
		}
		if(a<array.length) { 
			System.out.println(프로그램 멈추기);
		}
		count++;
		return array[a] = b;
	}

	public int remove(int x) {//매개변수로 받은 인덱스x에 있는 값을 삭제
		if(x<array.length) { 
			System.out.println(프로그램 멈추기);
		}
		int y = array[x];
		for(int i = x; i < count-1; i++) {
			array[i] = array[i+1];
			x++;
		}
		count --;
		array[x] = 0;
		return y;
	}

	@Override
	public String toString() {
		StringBuffer str = new StringBuffer("");
		str.append("[");
		for (int i=0; i < count; i++) {
			if(i>0) {
				str.append(", ");
			}
			str.append(array[i]);
		}
		str.append("]");
		return str.toString(); 
	}
}



