/*
 * ���ϸ�: CardGame.java
 * �ۼ���: 2018.6.12
 * �ۼ���: ȫ�ؼ�
 */
package hw15_1;
import java.util.*;
public class CardGame {

	public static void main(String[] args) {
		System.out.println("hw15_1: ȫ�ؼ�");
		Deck d = new Deck(); //�� ��ü ����
		d.shuffle(); //���� 
		Player p1 = new Player(); //�÷��̾� p1 ����
		Player p2 = new Player(); //�÷��̾� p2 ����
		for(int i=0; i<5; i++) { //5�徿 �����ư��� �����忡�� ī�� �ο�
			p1.getCard(d.deal());
			p2.getCard(d.deal());
		}
		System.out.println("\np1��  p2�� ī����");
		p1.showCards(); //ī�� ��� ���
		p2.showCards();
		int p1Win = p1.getMaxCard(); //�ִ�ī�带 �˾Ƴ��� ���ÿ� ���� �ϸ鼭 �¸��ڸ� �˾Ƴ������� int�� ������ ����
		int p2Win = p2.getMaxCard();
		System.out.println("\np1��  p2�� �ִ� ī��"); //�ִ�ī�� ���
		System.out.println(p1Win +"\n" +p2Win);
		if(p1Win > p2Win) //�����ص״� ������ �¸��� ��������
			System.out.println("p1 �¸�!");
		else if(p1Win == p2Win)
			System.out.println("���º�!");
		else
			System.out.println("p2�¸�!");
		System.out.println("\np1��  p2�� ī����"); //ī���� �ٽ� ���
		p1.showCards(); 
		p2.showCards();

	}

}
class Player {
	private ArrayList <Card> list = new ArrayList(); //getNumber()�� �������� <Card>�߰�

	public void getCard(Card card) {
		list.add(card);
	}

	public void showCards() {
		System.out.println(list);
	}
	public int getMaxCard() {
		Collections.sort(list); 
		return list.remove(list.size()-1).getNumber();
	}
}
class Deck {
	public static final int MAX_NUMBER = 50;
	private ArrayList deck = new ArrayList();

	// ī�带 �����Ͽ� ���� ����
	public Deck() {
		for (int i = 0; i < MAX_NUMBER; i++)
			deck.add(new Card(i));
	}

	// ī�带 ����
	public void shuffle() {
		Collections.shuffle(deck);
	}

	// ���� �� �� ī�带 �����Ͽ� ����
	public Card deal() {
		return (Card) deck.remove(0);
	}
}
class Card implements Comparable<Card>{
	private int number; // ī�� ��ȣ

	public Card(int number) {
		this.number = number;
	}
	public int getNumber() {
		return number;
	}
	public String toString() {
		return Integer.toString(number);
	}
	@Override //list�� �����ϱ����� compareTo ������
	public int compareTo(Card c) {
		return this.number-c.number;
	}

}



