package step8_01.technique;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

/*
 * 
 *  # 인터페이스 타입 객체 생성
 * 
 *  - 클래스가 구현한 인터페이스의 타입의 참조형으로 이를 구현한 클래스의 객체를 생성할 수 있다.
 *  - 인터페이스를 자료형으로 구현할 경우 프로그램은 더욱 유연해진다.
 * 
 *  [ 방법 ]
 * 
 *  인터페이스 변수명 = new 클래스명();
 *  
 *   [ 예시 ]
 *  
 *   List<Object> temp1 = new ArrayList<Object>();
 *   List<Object> temp2 = new Vector<Object>();
 *   
 *   Map<Object,Object> temp3 = new HashMap<Object, Object>();
 *   Map<Object,Object> temp4 = new TreeMap<Object, Object>();
 *   
 * */

interface Card {}

class ShinhanCard implements Card{}
class HyundaiCard implements Card{}
class NHCard implements Card{}

public class TechniqueEx10_03 {

	public static void main(String[] args) {
		
		ShinhanCard shinhan = new ShinhanCard();
		HyundaiCard hyundai = new HyundaiCard();
		NHCard nh = new NHCard();
		
		// 인터페이스의 타입으로 객체를 생성
		Card shinhan2 = new ShinhanCard();
		Card hyundai2 = new HyundaiCard();
		Card nh2 	  = new NHCard();
		
		// 예시 1)
		ArrayList<Integer> list1 = new ArrayList<Integer>();
		List<Integer> list2 = new ArrayList<Integer>();
		
		
		// 예시 2)
		HashMap<String, String> map1 = new HashMap<String, String>();
		Map<String, String> map2 = new HashMap<String, String>();
		
	}
	
}