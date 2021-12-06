package com.javaex.ex01;

import java.util.Arrays;

public class PointList {
	
	//필드
	//배열 선언
	private Point[] pArray; // Point 주소 담고있는 것 
	private int crtPos; // 숫자 담는 것 

	//생성자
	//배열 생성 
	public PointList() {
		this.pArray = new Point[3];
		this.crtPos = 0;
	}
	
	//메소드 g,s
	
	
	//메소드 일반
	//배열에 순차적으로 값 추가
	public void add(Point p) {//Point p > 인스턴스의 주소
		pArray[crtPos] = p;
		crtPos++;
	}
	
	//값을 출력해줌 (해당 배열의 값 읽어오기)
	public Point get(int index) {
		Point result = pArray[index];
		return result;
	}
	
	//배열의 사이즈
	public int size() {
		return crtPos;
	}

	//메소드 일반 
	@Override
	public String toString() {
		return "PointList [pArray=" + Arrays.toString(pArray) + ", crtPos=" + crtPos + "]";
	}

	
}
