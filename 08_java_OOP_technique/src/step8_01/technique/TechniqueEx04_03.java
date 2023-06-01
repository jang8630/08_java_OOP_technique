package step8_01.technique;

/*
 * 
 * # 생성자 오버로딩
 * 
 *  - 생성자도 메서드이기 때문에 메서드 오버로딩 기법이 적용 가능하다.
 *  - 생성자 오버로딩을 구현하기 위해서는 메서드와 마찬가지로
 *    파라메타의 개수나 타입을 다르게 정의 하면 된다.
 * 
 * */

class GoodsVO {
	
	String goodsCode;
	String goodsName;
	int goodsPrice;
	
	// 기본 생성자
	GoodsVO() {
		System.out.println("기본생성자 호출");
	}
	
	// 생성자 오버로딩
	GoodsVO(String goodsCode) {
		System.out.println("1개 파라메타 생성자 호출");
	}
	
	// 생성자 오버로딩
	GoodsVO(String goodsCode , String goodsName) {
		System.out.println("2개 파라메타 생성자 호출");
	}
	
	// 생성자 오버로딩
	GoodsVO(String goodsCode , String goodsName , int goodsPrice) {
		System.out.println("3개 파라메타 생성자 호출");
	}
	
}




public class TechniqueEx04_03 {

	public static void main(String[] args) {

		new GoodsVO();
		new GoodsVO("0x001");
		new GoodsVO("0x002" , "기계식키보드");
		new GoodsVO("0x003" , "무소음마우스" , 27000);
		
	}

}
