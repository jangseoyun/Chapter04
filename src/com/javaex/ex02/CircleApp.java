package com.javaex.ex02;

public class CircleApp {

	public static void main(String[] args) {

		// 인스턴스 생성
		Circle c01 = new Circle(5);
		Circle c02 = new Circle(7);

		// list 생성 (리스트로 접근하기 위해서)
		// list를 메모리에 올려줘야 CircleList의 생성자가 배열을 생성함
		CircleList cList = new CircleList();

		
		cList.add(c01); // 배열에 넣는 것
		cList.add(c02);
		
		System.out.println(cList.toString());
		System.out.println(cList.size());
		
		Circle c03 = new Circle(100);
		cList.add(c03);
		System.out.println(cList.toString());
	
		System.out.println(cList.get(0).getRadius());
	}

}
