package step8_01.technique;

/*
 * # 싱글턴 디자인 패턴
 * 
 *  - 객체를 1번만 생성하고 싶을 때 사용하는 기법
 *  
 *  - 싱글턴 패턴을 만드는 방법
 *  
 *    1) private 기본 생성자를 만든다.
 *    2) 내부에서 static으로 자기자신의 인스턴스를 생성한다. (핵심)
 *	  3) instance를 반환할 getter를 만들어준다.	  
 *  
 * */

class SingleTonTest {
	
	// 1) private 기본 생성자를 만든다.
	private SingleTonTest(){}
	
	// 2) 내부에서 static으로 자기자신의 인스턴스를 생성한다. (핵심)
	private static SingleTonTest instance = new SingleTonTest();
	
	// 3) instance를 반환할 getter를 만들어준다.	 
	public static SingleTonTest getInstance() {
		return instance;
	}
	
	
	// 테스트 속성
	String testVar = "테스트속성";
	
	// 테스트 메서드
	void testMothod() {
		System.out.println("테스트 메서드");
	}
	
}

class ClassTest {}

public class TechniqueEx05 {

	public static void main(String[] args) {
		
		System.out.println(new ClassTest()); // 다른객체 step8_01.technique.ClassTest@53bd815b
		System.out.println(new ClassTest()); // 다른객체 step8_01.technique.ClassTest@5d22bbb7
		System.out.println(new ClassTest()); // 다른객체 step8_01.technique.ClassTest@41a4555e
		System.out.println();
		
		
		//(error) private 접근제어자로 인해서 아래와 같은 형태로 객체 생성 불가 
		//new SingleTonTest();
		
		
		// SingleTonTest.instance
		System.out.println(SingleTonTest.getInstance()); // 같은객체 step8_01.technique.SingleTonTest@39ed3c8d
		System.out.println(SingleTonTest.getInstance()); // 같은객체 step8_01.technique.SingleTonTest@39ed3c8d
		System.out.println(SingleTonTest.getInstance()); // 같은객체 step8_01.technique.SingleTonTest@39ed3c8d
		System.out.println();
		
		// 테스트
		//System.out.println(SingleTonTest.instance.testVar);
		//SingleTonTest.instance.testMothod();
		
		System.out.println(SingleTonTest.getInstance().testVar); // 테스트속성
		SingleTonTest.getInstance().testMothod();
		
	}

}
