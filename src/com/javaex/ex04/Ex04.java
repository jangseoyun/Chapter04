package com.javaex.ex04;

import java.util.HashSet;
import java.util.Set;

public class Ex04 {

	public static void main(String[] args) {
		
		//1. 인스턴스 생성
		Point p01 = new Point(3,13);
		Point p02 = new Point(4,14);
		Point p03 = new Point(3,13);
		
		//2. hashcode, euqals 재정의 
		//object에 있는 hashcode
		//Point에서 hashcode 재정의 구분하는 로직은 정교하게 생각해서 만들어야함 
		//Point에서 hashcode 재정의 1차 검사 
		//Point에서 equals 재정의 2차 검사 (this.x==p.x..)
		System.out.println(p01.hashCode());
		System.out.println(p02.hashCode());
		System.out.println(p03.hashCode());
		
		//set 생성 
		Set<Point> pSet = new HashSet<Point>();
		
		//객체 set에 넣기 
		pSet.add(p01);
		pSet.add(p02);
		pSet.add(p03);
		
		System.out.println(pSet.toString());
		
		
		
	}

}
