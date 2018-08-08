/*
 * 파일명: RandomWalk.java
 * 작성일: 2018.3.29
 * 작성자: 홍준성
 * 내용: 교재 180~182쪽의 랜덤워크를 참고한 프로그램  
 */
public class RandomWalk {

	public static void main(String[] args) {
		System.out.println("hw4_2: 홍준성\n");
		int x = 0;
		int y = 0;
		boolean tile[][] = new boolean[5][5]; //boolean형 5x5의 타일 생성
		int steps=0; //이동 횟수를 저장할 변수
		boolean success = false; //성공여부를 알려줄 변수
		int goal1 = (int) (Math.random()*5); //목표 위치를 나타낼 int형 변수를 0~4숫자 중 랜덤으로 초기회
		int goal2 = (int) (Math.random()*5);
		System.out.println("출발 = (0,0)");
		System.out.printf("목표 = (%d,%d)\n", goal1, goal2);
		System.out.print("이동경로 = (0,0)");
		while(steps<20 ) { // 최대 20회 반복
			int direction = (int) (Math.random()*4);
			if(direction == 0 && x > 0) //교재 내용을 참고함
				x--;
			else if(direction == 1 && x < 4)
				x++;
			else if(direction == 2 && y > 0)
				y--;
			else if (y<4)
				y++;
			tile[y][x] = true; //들린 곳을 true로 초기화
			System.out.printf("(%d,%d)", y, x); //들린곳을 출력한다.
			steps++;
			if(tile[goal1][goal2] == true) { //목표지점이 true가 됐다면
				success = true;  //success를 true로 초기화
				break; //반복문 탈출
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
		if(success ==true) //succes가 true로 초기화 되었으면 성공
			System.out.println("성공");
		else
			System.out.println("실패");
		System.out.print("총 시도 횟수  = "+steps);

	}
}