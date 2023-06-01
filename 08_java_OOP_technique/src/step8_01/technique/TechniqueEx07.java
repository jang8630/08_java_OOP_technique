package step8_01.technique;

/*

	# 메서드 오버라이딩 ( Method Overriding )
	
	- 부모클래스로부터 상속 받은 메서드를 재정의(overriding)하여 사용한다.
	- 부모클래스의 메서드와 이름이 같고 구현되는 기능이 다르다.
	- 객체지향 기법의 다형성(polymorphism)을 구현하는 핵심기능이다.
	- 메서드 오버로딩과 혼용되기 쉽다.
	     메서드 오버라이딩 : 부모클래스와 자녀클래스 사이의 메서드이름이 같음(재 정의)
	     메서드 오버로딩 : 같은 클래스 안에서 메서드이름이 같음(중복 정의)

*/

class Warrior2 extends Beginner {
	
	// 메써드 오버라이딩(메써드 재정의)
	void levelUp() {
		this.level ++;
		this.power += 3000;
		this.dex += 300;
		this.life += 1000;
		this.mana += 10;
	}
	
	void dash () { // Warrior2 클래스만의 메써드 추가
		System.out.println("call dash method");
	}
}

class Wizard2 extends Beginner {
	
	// 메써드 오버라이딩(메써드 재정의)
	void levelUp() {
		this.level ++;
		this.power += 2000;
		this.dex += 200;
		this.life += 3000;
		this.mana += 20;
	}
	
	void fireball () { // Wizzard2 클래스만의 메써드 추가
		System.out.println("call fireball method");
	}
}


public class TechniqueEx07 {

	public static void main(String[] args) {
		
		Warrior2 war2 = new Warrior2();
		war2.showStatus(); // 1,1,1,1,1
		war2.levelUp();
		war2.levelUp();
		war2.levelUp();
		war2.showStatus(); // 4,9001, 901, 3001, 31
		
		System.out.println("\n===================\n");
		
		Wizard2 wiz2 = new Wizard2();
		wiz2.showStatus(); // 1,1,1,1,1
		wiz2.levelUp();
		wiz2.showStatus(); // 2,2001, 201, 3001, 21
		
		System.out.println("\n===================\n");
		
		war2.dash();
		wiz2.fireball();

	}

}
