package com.javaex.ex04;

import java.util.HashSet;
import java.util.Set;

public class Ex02 {

	public static void main(String[] args) {
		//Set
		//인스턴스 생성 , Integer 정수형 관리 
		Integer i01 = new Integer(3); //박싱 
		Integer i02 = new Integer(24);
		Integer i03 = new Integer(7);
		
		int i04 = 100;
		
		Integer i05 = new Integer(13); // 중복 저장 안됨
		Integer i06 = new Integer(17);
		
		//정수 관리 
		//제네릭에는 클래스만 들어올 수 있다
		Set<Integer> iSet = new HashSet<Integer>();
		iSet.add(i01);
		iSet.add(i02);
		iSet.add(i03);
		iSet.add(i04); //기본자료형 int 자동 박싱 -> Integer
		iSet.add(i05); //중복 저장 안됨
		iSet.add(i06);
		
		iSet.remove(i05);
		//iSet.remove(13); 값을 직접 넣어 지울 수 있음 
		
		System.out.println("갯수:"+iSet.size());//순서대로 나오지 않음 (순서개념없음)
		
		System.out.println("-------------------------");
		
		//전체출력(향상된 for문 사용, 배열이 없기 때문에) 
		for(Integer no : iSet) {
			System.out.println(no.toString());
		}
		
		System.out.println(iSet.toString());
		
		System.out.println("=========================");
		
		//Point 관리 
		Point p01 = new Point(3,13);  //16
		Point p02 = new Point(4,14);  //18
		Point p03 = new Point(5,15);  //20 >> 아예 다른것은 비교할 필요없음 (일을 줄임)
		Point p04 = new Point(3,13);  //16
		Point p05 = new Point(10,6);  //16
		
		Set<Point> pSet = new HashSet<Point>();
		pSet.add(p01);
		pSet.add(p02);
		pSet.add(p03);
		pSet.add(p04);
		
		pSet.remove(p01);//값을 직접 넣을 수 없다.
		
		System.out.println("갯수:"+pSet.size());
		
		System.out.println("-------------------------");
		for(Point p : pSet) {
			System.out.println(p.toString());
		}
		
		for(Point p : pSet) {
			System.out.println(p.getX()); // 배열이 아니라 방이없어서 바로 접근
		}
		
		System.out.println(pSet.toString());
	}

}
