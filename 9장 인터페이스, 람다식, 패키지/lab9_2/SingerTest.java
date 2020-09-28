package test;

import mic.MicSystem;

//Singer 인터페이스를 테스트하는 클래스
public class SingerTest {
	public static void main(String[] args) {
		System.out.println("lab9_2: 홍준성\n");

		// 마이크 시스템 객체를 생성
		MicSystem mic = new MicSystem();

		// Person 객체를 생성하여 마이크 테스트 매개변수로 전달
		mic.micTest(new Person());
	}
}
