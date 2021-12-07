package com.javaex.ex04;

import java.util.ArrayList;
import java.util.List;

public class Ex01 {

	public static void main(String[] args) {
		//List
		Point p01 = new Point(2,12);
		Point p02 = new Point(3,13);
		Point p03 = new Point(7,17);
		
		//List를 섞어쓰는 이유 (호환하기 위해서)
		List<Point> pList = new ArrayList<Point>(); //섞어쓰기 업캐스팅
		//List<Point> pList = new LinkedList<Point>(); //섞어쓰기 업캐스팅
		
		pList.add(p01);
		pList.add(p02);
		pList.add(p03);
		
		//갯수 출력하기 
		System.out.println(pList.size());
		
		//관리되고 있는 Point에 접근하기 
		System.out.println(pList.get(1).getY());
		System.out.println(pList.get(1).toString());
		
		//전체 출력하기 
		//배열에 직접 접근 못한 따라서 size로 접근
		for(int i = 0; i<pList.size(); i++) {
			System.out.println(pList.get(i).toString());
		}
		
		System.out.println("==========================");
		
		//데이터 지우기 
		//1) 방 지우기 
		pList.remove(1);
		System.out.println(pList.size());
		
		for(int i = 0; i<pList.size(); i++) {
			System.out.println(pList.get(i).toString());
		}
		
		//2) p02가 전부 지워짐 
		//pList.remove(p02);
		
		System.out.println("==========================");
		System.out.println(pList.get(1).toString());
		
		//추가 삽입 
		System.out.println("==========================");
		pList.add(1, p02);
		for(int i = 0; i<pList.size(); i++) {
			System.out.println(pList.get(i).toString());
		}
		
		System.out.println("==========================");
		System.out.println(pList.toString());
		
		System.out.println("==========================");
		
		//새로운 반복문 향상된 for문 -->처음부터 끝까지 
		for(Point p:pList) {
			System.out.println(p.getX());
		}
	}

}
