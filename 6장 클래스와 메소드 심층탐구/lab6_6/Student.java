/*
 * 파일명: Student.java
 * 작성일: 2018.4.24
 * 작성자: 홍준성
 * 내용: 이름, 도시, 국가 정보를 갖는 학생 클래스를 정의
 * 과제 수행시 유의사항: Student 클래스 외부에서는 Student가 이름, 도시, 국가 정보로 이루어진 것으로 알고 있으며, Address 클래스의 존재는 알지 못함
 */
package lab6_6;

public class Student {
	// (1) private inner class인 Address 클래스 정의 - 필드는 도시(city)와 국가(country), 메소드는 생성자(도시, 국가를 매개변수로 받음)
	class Address {
		String city;
		String country;

		public Address(String city, String country) {
			this.city = city;
			this.country = country;
		}
	}
	// (2) 2개의 private 필드 선언 - 이름(String 타입), 주소(Address 타입)
	private String name;
	private Address address;
	
	// (3) 생성자 정의 - name, city, country를 매개변수로 받음
	public Student(String name, String city, String country) {
		this.name = name;
		address = new Address(city, country);
	}

	// (4) 이름을 리턴하는 메소드
	public String getName() {
		return name;
	}

	// (5) 도시를 리턴하는 메소드
	public String getCity() {
		return address.city;
	}

	// (6) 국가를 리턴하는 메소드
	public String getCountry() {
		return address.country;
	}

	// (7) 매개변수로 받은 도시, 국가로 이사하는 메소드
	public void move(String city, String country) {
		this.address.city = city;
		this.address.country = country;
	}

	// (8) 이름, 도시, 국가를 문자열로 리턴하는 메소드
	@Override
	public String toString() {
		return "이름 = "+getName()+" 도시 = "+getCity()+" 국가 = "+getCountry();
	}
}
