package com.kh.chap02_string.controller;

public class A_StringPoolTest {
	
	public void method1() {
		
		// 1. �����ڸ� ���� ���ڿ� ����
		String str1 = new String("Hello");
		String str2 = new String("Hello");
		
		System.out.println(str1);
		System.out.println(str2);
		// StringŬ������ toString�޼ҵ� �̹� �������̵� �Ǿ�����! (���� ��� ���ڿ� ��ȯ�ϵ���)
		
		System.out.println(str1 == str2); // false (�ּҰ� ��)
		System.out.println(str1.equals(str2)); // true
		// String Ŭ������ equals��� �޼ҵ� �̹� �������̵� �Ǿ�����! (�ּҰ� �񱳰� �ƴ� ���� ��� ���ڿ� ��)
		
		System.out.println(str1.hashCode());
		System.out.println(str2.hashCode());
		// StringŬ������ hasgCode�޼ҵ� �̹� �������̵� �Ǿ�����! (�ּҰ��� �ƴ� ���� ��� ���ڿ��� ������ ����)
		
		// ���� ���� ���� �ּҰ��� ���ؼ� �˰� �ʹٸ� System.identityHashCode(���۷���)
		System.out.println(System.identityHashCode(str1));
		System.out.println(System.identityHashCode(str2));
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
	}

}
