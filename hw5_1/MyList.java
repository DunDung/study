package hw5_1;

public class MyList {

	private int[] array;
	private int capacity;
	private int count;

	public MyList() {
		array = new int[10]; //���̰� 10�� array�迭 ����
		capacity = 10; //����뷮
		count = 0; //�迭�� ���� ����
	}

	public void add(int a) { //count�� �̿��Ͽ� ���� ���� �迭�� ����
		if(count == 10) {
			System.out.println("�뷮���� 10-->20");
			int copy[] = new int[20];
			for(int i=0; i<array.length; i++) {
				copy[i] = array[i];
			}
			array = copy;
			array[count] = a;
			count ++;
		}
		if(count == 20) {
			System.out.println("�뷮���� 20-->40");
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

	public void print() { //list�� ���
		System.out.print("[");
		for (int i=0; i < count; i++) {
			if(i>0) {
				System.out.print(", ");
			}
			System.out.print(array[i]);
		}
		System.out.println("]");
	}

	public int get(int index) { //�Ű������� ���� index�� ���� ����
		if(index<array.length) { 
			System.out.println(���α׷� ���߱�);
		}
		return array[index];
	}

	public int set(int a, int num) {  //�Ű������� ���� �ε���a�� ���� num���� ����
		if(a<array.length) { 
			System.out.println(���α׷� ���߱�);
		}
		return array[a] = num;
	}

	public int size() { //list�� ũ�⸦ ����
		return count;
	}
	public int add(int a, int b) { //�ε���a�� b�� ���� ����
		if(count == 10) {
			System.out.println("�뷮���� 10-->20");
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
			System.out.println("�뷮���� 20-->40");
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
			System.out.println(���α׷� ���߱�);
		}
		count++;
		return array[a] = b;
	}

	public int remove(int x) {//�Ű������� ���� �ε���x�� �ִ� ���� ����
		if(x<array.length) { 
			System.out.println(���α׷� ���߱�);
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



