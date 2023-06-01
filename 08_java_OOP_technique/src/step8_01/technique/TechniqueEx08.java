package step8_01.technique;

/*
 * 
 *  # this , super
 * 
 * 	- this : 자신의 객체
 *    super : 부모클래스의 객체
 *  
 *  - this() : 자신의 생성자
 *    super() : 부모클래스의 생성자
 *  
 *  - this.testMethod() : 자신의 메서드 호출
 *    testMethod()		: 자신의 메서드 호출
 *    super.testMethod() : 부모의 메서드 호출
 * 
 * */

class Parent {
	
	String name;
	int age;
	
	Parent() {
		this("무명" , 0);
		System.out.println("(P-기본)부모클래스의 기본생성자 호출");
	}
	
	Parent(String name, int age) {
		System.out.println("(P-추가)부모클래스의 추가생성자 호출");
	}
	
	void testMethod () {
		System.out.println("(P) call parent testMethod");
	}
	
}

class Child extends Parent{

	Child() {
		
		super(); // 부모의클래스의 기본생성자를 실행(기본적으로 생략되어 있다.)
		//super("앨런튜링" , 70); // 부모의클래스의 추가된 생성자를 실행
		System.out.println("(C-기본)자녀클래스의 기본생성자 호출");
		
	}
	
	Child(String name , int age) {
		this();
		// super();
		// super("앨런튜링" , 70);
		System.out.println("(C-추가)자녀클래스의 추가된생성자 호출");
	}
	
	void testMethod () { // 오버라이딩 
		System.out.println("(C) call child testMethod");
	}
	
	void callMethod() {
		
		System.out.println(super.name); // 부모클래스의 변수
		System.out.println(super.age);
		
		super.testMethod(); // 부모클래스의 testMethod 호출
		this.testMethod();  // 자신의 testMethod 호출		
		testMethod();		// 자신의 testMethod 호출(보통 this는 생략한다.)
	}
	
}

public class TechniqueEx08 {

	public static void main(String[] args) {
		
		new Parent();
		System.out.println(); // (P-추가)부모클래스의 추가생성자 호출, 
		                      // (P-기본)부모클래스의 기본생성자 호출
		
		new Parent("제임스", 70);
		System.out.println(); // (P-추가)부모클래스의 추가생성자 호출
		
		new Child();
		System.out.println(); // (P-추가)부모클래스의 추가생성자 호출
							  // (P-기본)부모클래스의 기본생성자 호출
							  // (C-기본)자녀클래스의 기본생성자 호출
		
		new Child("제임스고슬링주니어", 40);
	    System.out.println(); // (P-추가)부모클래스의 추가생성자 호출
	    					  // (P-기본)부모클래스의 기본생성자 호출
	    					  // (C-기본)자녀클래스의 기본생성자 호출
	    					  // (C-추가)자녀클래스의 추가된생성자 호출
		
		Child c = new Child("제임스고슬링주니어" , 40);
		System.out.println(); // null, 0
		c.callMethod();
		
	}

}



