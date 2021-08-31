package com.kh.chap02_string.controller;

import java.util.StringTokenizer;

public class C_StringTokenizerTest {

	public void method() {
		
		String str = "Java,Oracle,JDBC,HTML,CSS,Spring";
		
		// 구분자를 기준으로 해서 문자열을 분리시키는 방법
		
		// 방법1. 분리된 문자열들을 String[] 배열에 차곡차곡 담고자 할 때
		// 		 String클래스에서 제공하는 split 메소드 이용
		//		  문자열.split(구분자): String[]
		// 		  자바 이외의 언어에서도 많이 쓰이는 방법!
		
		String[] arr = str.split(",");
		System.out.println("배열의 길이: " + arr.length);
		
		/*
		// for문
		for(int i=0; i<arr.length; i++) {
			System.out.println(i + "번째 인덱스: " + arr[i]);
		}
		*/
		
		// 향상된 for문
		int i = 0;
		for(String s : arr) { // s = arr[0]; => arr[1];
			System.out.println(i++ + "번째 인덱스: " + s);
		}
		
		// 방법2. 분리된 문자열들을 각각 토큰으로써 관리하고자 할 때
		//	 	 java.util.StringTokenizer 클래스를 이용하는 방법
		//		 StringTokenizer stn = new StringTokinizer(분리시키고자하는문자열, 구분자);
		//		  자바에서만 사용하는 방법
		StringTokenizer stn = new StringTokenizer(str, ",");
		System.out.println("분리된 문자열의 갯수: " + stn.countTokens());
		/*
		System.out.println(stn.nextToken());
		System.out.println(stn.nextToken());
		System.out.println(stn.nextToken());
		System.out.println(stn.nextToken());
		System.out.println(stn.nextToken());
		System.out.println(stn.nextToken());
		
		System.out.println("남은 토큰의 갯수: " + stn.countTokens());
		// System.out.println(stn.nextToken()); // NoSuchElementException 오류 발생
		*/
		
		/* 잘못된 방법 (반복문이 3번만 돌게 됨)
		for(int j=0; j<stn.countTokens(); j++) {
			System.out.println(stn.nextToken());
		}
		*/
		// 위 반복문 실행과정
		// j=0	j<6	true	출력("java")		j++
		// j=1	j<5	true	출력("Oracle")	j++
		// j=2	j<4	true	출력("JDBC")		j++
		// j=3	j<3	false	=> 반복문 빠져나옴
		
		// 해결방법1.
		/*
		int count = stn.countTokens(); // count = 6 // 값이 6으로 고정됨
		
		for(int j=0; j<count; j++) {
			System.out.println(stn.nextToken());
		}
		*/
		
		// 해결방법2.
		while(stn.hasMoreTokens()) {
			System.out.println(stn.nextToken());
		}
		
		
		
		
	}
}
