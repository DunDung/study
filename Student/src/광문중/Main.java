package ������;
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

		// ���Ḧ ������ ������ �ݺ��Ͽ� �޴��� �����ϰ� �׿� �´� Ʈ�� ������ ����
		do {
			System.out.print("1:��ü��ȸ 2:�л����� 3:������ 4:������,������ 5:HTMLver 9:���� --->");
			menu = scan.nextInt();
			switch(menu) {
			case 1:
				Collections.sort(list);
				System.out.println(list.toString());		 
				break;
			case 2:
				while(true) {
					
					int �г� = scan.nextInt();
					if(�г� == 0)
						break;
					int �� = scan.nextInt();
					int ��ȣ = scan.nextInt();
					String �̸� = scan.next();
					list.add(new Student(�г�, ��, ��ȣ, �̸�));
				}
					
				break;				
			case 3:
				while(true) {
					String �̸� = scan.next();
					if(�̸�.equals("0"))
						break;
					String �ݾ� = scan.next();
					for(int i=0; i<list.size(); i++)
						if(list.get(i).get�̸�().equals(�̸�))
							list.get(i).set�ݾ�(�ݾ�);
				}
				break;
			case 4:
				while(true) {
					String �̸� = scan.next();
					if(�̸�.equals("0"))
						break;
					String �������� = scan.next();
					for(int i=0; i<list.size(); i++)
						if(list.get(i).get�̸�().equals(�̸�))
							list.get(i).set��������(��������);;
				}
				break;
			case 5:
				Collections.sort(list);
				System.out.println("<!DOCTYPE html>");
				System.out.println("<html>");
				System.out.println("<head>");
				System.out.println("</head>");
				System.out.println("<body>");
				System.out.println("<h2>�л� ���</h2>");
				System.out.println("<table border=\"1\">");
				System.out.println("<thead>");
				System.out.println("<tr>");
				System.out.println("<th>�г�</th>");
				System.out.println("<th>��</th>");
				System.out.println("<th>��ȣ</th>");
				System.out.println("<th>�̸�</th>");
				System.out.println("<th>�ݾ�</th>");
				System.out.println("<th>��������</th>");
				System.out.println("</tr>");
				System.out.println("<tbody>");
				for(int i=0; i<list.size(); i++) {
					System.out.println("<tr>");
					System.out.println("<td>"+list.get(i).get�г�()+"</td>");
					System.out.println("<td>"+list.get(i).get��()+"</td>");
					System.out.println("<td>"+list.get(i).get��ȣ()+"</td>");
					System.out.println("<td>"+list.get(i).get�̸�()+"</td>");
					System.out.println("<td>"+list.get(i).get�ݾ�()+"</td>");
					System.out.println("<td>"+list.get(i).get��������()+"</td>");
					System.out.println("</tr>");
				}
				System.out.println("</tbody>");
				System.out.println("</table");
				System.out.println("</body>");
				System.out.println("</html>");
				break;
			case 9:
				System.out.println("���α׷��� �����մϴ�.");
				break;
			default:
				System.out.println("�޴� ��ȣ ����: �޴��� �ٽ� �����ϼ���.");
			}
		} while(menu != 9);
	}

}
