/*
 * 파일명: CardGame.java
 * 작성일: 2018.6.12
 * 작성자: 홍준성
 */
package hw15_1;
import java.util.*;
public class CardGame {

	public static void main(String[] args) {
		System.out.println("hw15_1: 홍준성");
		Deck d = new Deck(); //덱 객체 생성
		d.shuffle(); //셔플 
		Player p1 = new Player(); //플레이어 p1 생성
		Player p2 = new Player(); //플레이어 p2 생성
		for(int i=0; i<5; i++) { //5장씩 번갈아가며 맨윗장에서 카드 부여
			p1.getCard(d.deal());
			p2.getCard(d.deal());
		}
		System.out.println("\np1과  p2의 카드목록");
		p1.showCards(); //카드 목록 출력
		p2.showCards();
		int p1Win = p1.getMaxCard(); //최대카드를 알아내고 동시에 삭제 하면서 승리자를 알아내기위해 int형 변수에 저장
		int p2Win = p2.getMaxCard();
		System.out.println("\np1과  p2의 최대 카드"); //최대카드 출력
		System.out.println(p1Win +"\n" +p2Win);
		if(p1Win > p2Win) //저장해뒀던 값으로 승리자 가려내기
			System.out.println("p1 승리!");
		else if(p1Win == p2Win)
			System.out.println("무승부!");
		else
			System.out.println("p2승리!");
		System.out.println("\np1과  p2의 카드목록"); //카드목록 다시 출력
		p1.showCards(); 
		p2.showCards();

	}

}
class Player {
	private ArrayList <Card> list = new ArrayList(); //getNumber()을 쓰기위한 <Card>추가

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

	// 카드를 생성하여 덱에 넣음
	public Deck() {
		for (int i = 0; i < MAX_NUMBER; i++)
			deck.add(new Card(i));
	}

	// 카드를 섞음
	public void shuffle() {
		Collections.shuffle(deck);
	}

	// 덱의 맨 앞 카드를 제거하여 리턴
	public Card deal() {
		return (Card) deck.remove(0);
	}
}
class Card implements Comparable<Card>{
	private int number; // 카드 번호

	public Card(int number) {
		this.number = number;
	}
	public int getNumber() {
		return number;
	}
	public String toString() {
		return Integer.toString(number);
	}
	@Override //list를 정렬하기위한 compareTo 재정의
	public int compareTo(Card c) {
		return this.number-c.number;
	}

}



