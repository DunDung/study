/*
 * ���ϸ�: RandomWalk.java
 * �ۼ���: 2018.3.29
 * �ۼ���: ȫ�ؼ�
 * ����: ���� 180~182���� ������ũ�� ������ ���α׷�  
 */
public class RandomWalk {

	public static void main(String[] args) {
		System.out.println("hw4_2: ȫ�ؼ�\n");
		int x = 0;
		int y = 0;
		boolean tile[][] = new boolean[5][5]; //boolean�� 5x5�� Ÿ�� ����
		int steps=0; //�̵� Ƚ���� ������ ����
		boolean success = false; //�������θ� �˷��� ����
		int goal1 = (int) (Math.random()*5); //��ǥ ��ġ�� ��Ÿ�� int�� ������ 0~4���� �� �������� �ʱ�ȸ
		int goal2 = (int) (Math.random()*5);
		System.out.println("��� = (0,0)");
		System.out.printf("��ǥ = (%d,%d)\n", goal1, goal2);
		System.out.print("�̵���� = (0,0)");
		while(steps<20 ) { // �ִ� 20ȸ �ݺ�
			int direction = (int) (Math.random()*4);
			if(direction == 0 && x > 0) //���� ������ ������
				x--;
			else if(direction == 1 && x < 4)
				x++;
			else if(direction == 2 && y > 0)
				y--;
			else if (y<4)
				y++;
			tile[y][x] = true; //�鸰 ���� true�� �ʱ�ȭ
			System.out.printf("(%d,%d)", y, x); //�鸰���� ����Ѵ�.
			steps++;
			if(tile[goal1][goal2] == true) { //��ǥ������ true�� �ƴٸ�
				success = true;  //success�� true�� �ʱ�ȭ
				break; //�ݺ��� Ż��
			}
		}
		System.out.println("\n----------");
		for(int i = 0; i < 5; i++) {
			for(int j= 0; j<5; j++) {
				if(i ==0 && j==0)
					System.out.print("S ");
				else if(i==goal1 && j==goal2) 
					System.out.print("G ");
				else if(tile[i][j] == true) 
					System.out.print("# ");
				else
					System.out.print(". ");
			}
			System.out.println();
		}

		System.out.println("----------");
		if(success ==true) //succes�� true�� �ʱ�ȭ �Ǿ����� ����
			System.out.println("����");
		else
			System.out.println("����");
		System.out.print("�� �õ� Ƚ��  = "+steps);

	}
}