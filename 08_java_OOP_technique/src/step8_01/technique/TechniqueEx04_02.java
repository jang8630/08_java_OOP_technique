package step8_01.technique;

// 생성자 설명
// 생성자를 이용한 멤버변수 초기화
class GoodsDTO {
	
	String goodsCode;
	String goodsName;
	int goodsPrice;
	
//	GoodsDTO (String goodsCode, String goodName, int goodsPrice) {
//		this.goodsCode = goodsCode;
//		this.goodsName = goodsName;
//		this.goodsPrice = goodsPrice;
//	}
	
	// 생성자 단축키 > 좌측 상단 Source > Generate Constructor Using Fields.. 자동생성 결과
	GoodsDTO(String goodsCode, String goodsName, int goodsPrice) {
		super(); // 상속에서 사용한다.
		this.goodsCode = goodsCode;
		this.goodsName = goodsName;
		this.goodsPrice = goodsPrice;
	}
	
	
//	void setData(String goodsCode, String goodName, int goodsPrice) {
//		this.goodsCode = goodsCode;
//		this.goodsName = goodsName;
//		this.goodsPrice = goodsPrice;
//	}
	
	void printData() {
		System.out.println("this.goodsCode : " + this.goodsCode);
		System.out.println("this.goodsName" + this.goodsName);
		System.out.println("this.goodsPrice" + + this.goodsPrice);
		System.out.println();
	}

}

public class TechniqueEx04_02 {

	public static void main(String[] args) {
	
		//GoodsDTO temp = new GoodsDTO();
		//temp.goodsCode = "상품코드";
		//temp.goodsName = "상품명";
		//temp.goodsPrice = 0;
		
		GoodsDTO g1 = new GoodsDTO("0x001" , "맨투맨" , 40000);
		//g1.setData("0x001" , "맨투맨" , 40000);
		
		GoodsDTO g2 = new GoodsDTO("0x002" , "팬츠" , 30000);
		//g2.setData("0x002" , "팬츠" , 30000);
		
		g1.printData();
		g2.printData();
	}

}
