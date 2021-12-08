package com.javaex.ex04;

import java.util.HashMap;
import java.util.Map;
import java.util.Set;

public class Ex05 {

	public static void main(String[] args) {
		
		
		//객체 생성
		Point p01 = new Point(1,11); //권상우 
		Point p02 = new Point(2,22); //정우성
		Point p03 = new Point(3,33); //이효리
		
		//value<>값을 정하고 뭐로 관리할 것인지 정의 2가지 확정 
		Map<String, Point> pMap = new HashMap<String, Point>();
		
		//map으로 관리 
		
		//Key(타입선택 숫자or문자), value()주소;
		pMap.put("권상우", p01); 
		pMap.put("정우성", p02);
		pMap.put("이효리", p03);
		//pMap.put("권상우", p03); 만약 권상우 동일한 키값을 줬을경우, 나중 value로 수정된다.
		
		System.out.println(pMap.toString());
		System.out.println(pMap); //동일한것 println 자체가 toString가지고 있어서 
		
		//값 읽기 
		pMap.get("정우성"); //--> 주소
		pMap.get("정우성").getX(); //-> x값 
		System.out.println(pMap.get("정우성").getX());
		
		//데이터 갯수 
		System.out.println(pMap.size());
		
		//키셋 구하기
		Set<String> keys = pMap.keySet();
		
		//향상된 for문 (배열이 없기 때문에)
		//단점은 누구의 x값인지 모름 
		for(String key : keys) {
			System.out.println(pMap.get(key).getX());
		}
		
		/////////////////////////////////////////
		
		
		
	}

}
