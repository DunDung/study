/*
 * 파일명: Main.java
 * 작성일: 2018.6.7
 * 작성자: 홍준성
 */
package hw14_1;

import java.util.InputMismatchException;
import java.util.Scanner;

public class Main {
	public static void main(String[] args) throws TooSmallException {
		System.out.println("hw14_1: 홍준성");

		// 속도가 50인 자동차 생성하여 자동차 정보 출력
		Car myCar = new Car(50);
		System.out.println(myCar);
		try {
			// 가속량을 입력받아 자동차 가속
			Scanner scan = new Scanner(System.in);
			System.out.print("가속량 입력: ");
			int value = scan.nextInt();
			myCar.speedUp(value);
		}catch(SpeedUpException s) {
			System.out.println("최대 속도를 넘어서 자동차가 멈춥니다.");
			myCar.stop();
		}catch(InputMismatchException m) {
			System.out.println("가속량 입력 오류로 가속 불가능합니다.");
		}
		finally {
			System.out.println(myCar);
		}

	}
}


class Car {
	private int speed; // 속도
	public final int MAX_SPEED = 100;   // 최대 속도

	public Car(int speed) {
		this.speed = speed;
	}

	public void speedUp(int value) throws SpeedUpException, TooSmallException {  // 가속
		if(speed + value > MAX_SPEED)
			throw new SpeedUpException();
		else if(value <= 0)
			throw new TooSmallException(value);
		else
			speed += value;
	}


	public void speedDown(int value) {  // 감속
		speed -= value;
	}

	public void stop() { // 멈춤
		speed = 0;
	}

	@Override
	public String toString() {
		return "Car [speed=" + speed + ", MAX_SPEED=" + MAX_SPEED + "]";
	}
}
class SpeedUpException extends Exception{ }
class TooSmallException extends Exception{ 
	public TooSmallException(int speed) {
		super("기준미달 "+speed); //부모생성자 호출을 통해  메세지 지정
	}
}

