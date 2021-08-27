package com.kh.chap02_string.controller;

public class A_StringPoolTest {
	
	public void method1() {
		
		// 1. 생성자를 통한 문자열 생성
		String str1 = new String("Hello");
		String str2 = new String("Hello");
		
		System.out.println(str1);
		System.out.println(str2);
		// String클래스에 toString메소드 이미 오버라이딩 되어있음! (실제 담긴 문자열 반환하도록)
		
		System.out.println(str1 == str2); // false (주소값 비교)
		System.out.println(str1.equals(str2)); // true
		// String 클래스에 equals라는 메소드 이미 오버라이딩 되어있음! (주소값 비교가 아닌 실제 담긴 문자열 비교)
		
		System.out.println(str1.hashCode());
		System.out.println(str2.hashCode());
		// String클래스에 hasgCode메소드 이미 오버라이딩 되어있음! (주소값이 아닌 실제 담긴 문자열을 가지고 만듦)
		
		// 정말 정말 정말 주소값에 대해서 알고 싶다면 System.identityHashCode(레퍼런스)
		System.out.println(System.identityHashCode(str1));
		System.out.println(System.identityHashCode(str2));
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
	}

}
