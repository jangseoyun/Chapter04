package com.javaex.ex02;

import java.util.Arrays;

public class CircleList {

	// 필드 (배열 선언, add 공간차지설정)
	private Circle[] cArray;
	private int crtPos;

	// 생성자 (배열 생성, 공간차지초기화)
	public CircleList() {
		cArray = new Circle[3];
		crtPos = 0;
	}

	// 메소드 g,s

	// 메소드 일반
	@Override
	public String toString() {
		return "CircleList [cArray=" + Arrays.toString(cArray) + ", crtPos=" + crtPos + "]";
	}
	
	//리스트에 인스턴스 값을 넣어준다.
	public void add(Circle c) {
		cArray[crtPos] = c;
		crtPos++;
	}
	
	//인스턴스 클래스에가서 리스트 번호를 입력 받아서 읽어준다.
	public Circle get(int index) {
		Circle result = cArray[index];
		return result;
	}

	//add공간차지와 동일하다고 본다(리스트 사이즈)
	public int size() {
		return crtPos;
	}

}
