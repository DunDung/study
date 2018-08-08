/*
 * ���ϸ�: Main.java
 * �ۼ���: 2018.6.7
 * �ۼ���: ȫ�ؼ�
 */
package hw14_1;

import java.util.InputMismatchException;
import java.util.Scanner;

public class Main {
	public static void main(String[] args) throws TooSmallException {
		System.out.println("hw14_1: ȫ�ؼ�");

		// �ӵ��� 50�� �ڵ��� �����Ͽ� �ڵ��� ���� ���
		Car myCar = new Car(50);
		System.out.println(myCar);
		try {
			// ���ӷ��� �Է¹޾� �ڵ��� ����
			Scanner scan = new Scanner(System.in);
			System.out.print("���ӷ� �Է�: ");
			int value = scan.nextInt();
			myCar.speedUp(value);
		}catch(SpeedUpException s) {
			System.out.println("�ִ� �ӵ��� �Ѿ �ڵ����� ����ϴ�.");
			myCar.stop();
		}catch(InputMismatchException m) {
			System.out.println("���ӷ� �Է� ������ ���� �Ұ����մϴ�.");
		}
		finally {
			System.out.println(myCar);
		}

	}
}


class Car {
	private int speed; // �ӵ�
	public final int MAX_SPEED = 100;   // �ִ� �ӵ�

	public Car(int speed) {
		this.speed = speed;
	}

	public void speedUp(int value) throws SpeedUpException, TooSmallException {  // ����
		if(speed + value > MAX_SPEED)
			throw new SpeedUpException();
		else if(value <= 0)
			throw new TooSmallException(value);
		else
			speed += value;
	}


	public void speedDown(int value) {  // ����
		speed -= value;
	}

	public void stop() { // ����
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
		super("���ع̴� "+speed); //�θ������ ȣ���� ����  �޼��� ����
	}
}

