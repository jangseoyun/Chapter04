package com.javaex.ex04;

import java.util.HashSet;
import java.util.Set;

public class Ex03 {

	public static void main(String[] args) {
		// Set --> HashSet을 시용해서 로또 자동생성기 만들기
		// 랜덤함수 (번호 6개, 1~49까지)

		// 랜덤 숫자 범위
		for (int i = 1; i <= 6; i++) {
			int setNum = ((int) (Math.random() * 49) + 1);
			System.out.println(setNum);
		}

		System.out.println("=======================");

		Integer num01 = new Integer((int) (Math.random() * 49) + 1);
		Integer num02 = new Integer((int) (Math.random() * 49) + 1);
		Integer num03 = new Integer((int) (Math.random() * 49) + 1);
		Integer num04 = new Integer((int) (Math.random() * 49) + 1);
		Integer num05 = new Integer((int) (Math.random() * 49) + 1);
		Integer num06 = new Integer((int) (Math.random() * 49) + 1);

		Set<Integer> lotoSet = new HashSet<Integer>();

		lotoSet.add(num01);
		lotoSet.add(num02);
		lotoSet.add(num03);
		lotoSet.add(num04);
		lotoSet.add(num05);
		lotoSet.add(num06);

		for (Integer i : lotoSet) {
			System.out.println(i.toString());

		}
		
		
		System.out.println("========강사님=======================");
		
		Set<Integer> lotoSet02 = new HashSet<Integer>();
		
		while(true) {
			//6개면 탈출 

			int num = (int)(Math.random()*45)+1;
			System.out.println("생성된 숫자" + num);
			lotoSet02.add(num); // 중복체크는 set을 통해 해결
			
			if(lotoSet02.size()>=6) {
				break;
			}

		}
		
		System.out.println("-----------------------------");
		for(Integer i : lotoSet) { //언박싱
			System.out.println(i);
		}
		
		
	}

}
