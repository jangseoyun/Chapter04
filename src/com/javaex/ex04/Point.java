package com.javaex.ex04;

import java.util.Objects;

public class Point {
	// 필드
	private int x;
	private int y;

	// 생성자
	public Point() {
	}

	public Point(int x, int y) {
		super();
		this.x = x;
		this.y = y;
	}

	// 메소드 g,s
	public int getX() {
		return x;
	}

	public void setX(int x) {
		this.x = x;
	}

	public int getY() {
		return y;
	}

	public void setY(int y) {
		this.y = y;
	}

	// 메소드 일반
	@Override
	public String toString() {
		return "Point [x=" + x + ", y=" + y + "]";
	}
	
	//hashcode와 equals를 재정의하지 않을 경우 hashcode값이 모두 달라서 set에서 걸러내지못하고 다 들어간다.
	@Override //hashcode 재정의하여 1차적으로 검사 
	public int hashCode() {
		return x*y;
	}

	@Override //equals 재정의하여 2차 검사 
	public boolean equals(Object obj) {
		 Point p = (Point)obj; //형변환 
		if(this.x==p.x && this.y==p.y) {
			return true;
		}else {
			return false;
		}
		
	}
	
	
	/*
	@Override
	public int hashCode() {
		return Objects.hash(x, y);
	}

	@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (obj == null)
			return false;
		if (getClass() != obj.getClass())
			return false;
		Point other = (Point) obj;
		return x == other.x && y == other.y;
	}*/
	
	
	
	
	
	

	
	
	

}
