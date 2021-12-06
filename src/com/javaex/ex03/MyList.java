package com.javaex.ex03;

import java.util.Arrays;

//T --> Point   Circle
public class MyList<T> {
	
	//필드
	private T[] oArray; //따라가보면 오브젝트가 있을거야
	private int crtPos;
	
	//생성자
	public MyList() {
		this.oArray = (T[])new Object[3]; //배열 문법상 다운캐스팅
		this.crtPos = 0;
	}
	//메소드 g,s
	
	//메소드 일반
	//add, get, size
	
	public void add(T o) {
		oArray[crtPos] = o;
		crtPos++;
	}
	
	//주소를 읽어오는 것 
	public T get(int index) {
		T result = oArray[index];
		return result;
	}
	
	public int size() {
		return crtPos;
	}

	@Override
	public String toString() {
		return "MyList [oArray=" + Arrays.toString(oArray) + ", crtPos=" + crtPos + "]";
	}
	
	
	
}
