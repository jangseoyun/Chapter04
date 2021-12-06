package com.javaex.ex03;

public class MyListApp {

	public static void main(String[] args) {

		// MyList를 2개 올릴것인데 circle, point따로 생성하여 한 틀로 관리
		// MyList는 Object로 이루어짐 (어떤 도형이와도 관리할 수 있다)

		// ---포인트 (점) 관리------------------------

		Point p01 = new Point(4, 7);
		Point p02 = new Point(8, 17);

		MyList<Point> pList = new MyList<Point>(); 
		// Point만 관리
		
		pList.add(p01);
		pList.add(p02);
		
		System.out.println(pList.toString());
		System.out.println(pList.get(0).toString());// 오버라이딩

		System.out.println(pList.toString());

		// ---원 관리-------------------------------

		Circle c01 = new Circle(5);
		
		MyList<Circle> cList = new MyList<Circle>();
		// Circle만 관리
		cList.add(c01);
		
		// 제네릭으로 정의한 클래스 이외의 다른값은 오류
		//cList.add(p01); point를 넣으면 오류남
		
		cList.get(0).getRadius(); //다운캐스팅 하지 않아도 됨.
		
		System.out.println(cList.toString());
	}

}
