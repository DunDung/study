package asd;

import java.util.Scanner;

public class Asd {
	  public static void main(String[] args) {
		  Scanner input = new Scanner(System.in);
		  System.out.print("도시명을 입력하세요: ");
		  String city = input.nextLine();
		  System.out.print("인구를 입력하세요 : ");
		  int population = input.nextInt();
		  System.out.print("평균 기온을 입력하세요: ");
		  double averageDegree = input.nextDouble();
		  System.out.print("도시명은: "+city +" ");
		  System.out.print("인구 수는: "+population +" ");
		  System.out.print("평균 기온은: "+averageDegree +" ");
	  // (1) Scanner형 변수 input에 키보드 입력을 위한 Scanner 객체 생성하여 지정
		  
	  // (2) 도시명을 입력하라는 안내문을 출력

	  // (3) String형 변수 city를 선언하고, 한 줄의 도시명을 입력받아 city에 지정 - nextLine() 메소드

	  // (4) 인구를 입력하라는 안내문을 출력

	  // (5) int형 변수 population를 선언하고, 인구를 입력받아 population에 지정 - nextInt() 메소드

	  // (6) 평균 기온을 입력하라는  입력하라는 안내문을 출력

	  // (7) double형 변수 averageDegree를 선언하고, 평균 기온을 입력받아 averageDegree에 지정 - nextDouble() 메소드

	  // (8) 도시명, 인구수, 평균 기온을 출력


	 }
	 }
