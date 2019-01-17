package 광문중;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.List;
import java.util.Scanner;

public class Main {

	public static void main(String[] args) throws InterruptedException {
		
		Scanner scan = new Scanner(System.in);
		
		int menu = 0;
		List<Student> list  = new ArrayList<>();

		// 종료를 선택할 때까지 반복하여 메뉴를 제공하고 그에 맞는 트리 연산을 수행
		do {
			System.out.print("1:전체조회 2:학생삽입 3:돈삽입 4:수익자,지원자 5:HTMLver 9:종료 --->");
			menu = scan.nextInt();
			switch(menu) {
			case 1:
				Collections.sort(list);
				System.out.println(list.toString());		 
				break;
			case 2:
				while(true) {
					
					int 학년 = scan.nextInt();
					if(학년 == 0)
						break;
					int 반 = scan.nextInt();
					int 번호 = scan.nextInt();
					String 이름 = scan.next();
					list.add(new Student(학년, 반, 번호, 이름));
				}
					
				break;				
			case 3:
				while(true) {
					String 이름 = scan.next();
					if(이름.equals("0"))
						break;
					String 금액 = scan.next();
					for(int i=0; i<list.size(); i++)
						if(list.get(i).get이름().equals(이름))
							list.get(i).set금액(금액);
				}
				break;
			case 4:
				while(true) {
					String 이름 = scan.next();
					if(이름.equals("0"))
						break;
					String 지원여부 = scan.next();
					for(int i=0; i<list.size(); i++)
						if(list.get(i).get이름().equals(이름))
							list.get(i).set지원여부(지원여부);;
				}
				break;
			case 5:
				Collections.sort(list);
				System.out.println("<!DOCTYPE html>");
				System.out.println("<html>");
				System.out.println("<head>");
				System.out.println("</head>");
				System.out.println("<body>");
				System.out.println("<h2>학생 목록</h2>");
				System.out.println("<table border=\"1\">");
				System.out.println("<thead>");
				System.out.println("<tr>");
				System.out.println("<th>학년</th>");
				System.out.println("<th>반</th>");
				System.out.println("<th>번호</th>");
				System.out.println("<th>이름</th>");
				System.out.println("<th>금액</th>");
				System.out.println("<th>지원여부</th>");
				System.out.println("</tr>");
				System.out.println("<tbody>");
				for(int i=0; i<list.size(); i++) {
					System.out.println("<tr>");
					System.out.println("<td>"+list.get(i).get학년()+"</td>");
					System.out.println("<td>"+list.get(i).get반()+"</td>");
					System.out.println("<td>"+list.get(i).get번호()+"</td>");
					System.out.println("<td>"+list.get(i).get이름()+"</td>");
					System.out.println("<td>"+list.get(i).get금액()+"</td>");
					System.out.println("<td>"+list.get(i).get지원여부()+"</td>");
					System.out.println("</tr>");
				}
				System.out.println("</tbody>");
				System.out.println("</table");
				System.out.println("</body>");
				System.out.println("</html>");
				break;
			case 9:
				System.out.println("프로그램을 종료합니다.");
				break;
			default:
				System.out.println("메뉴 번호 오류: 메뉴를 다시 선택하세요.");
			}
		} while(menu != 9);
	}

}
