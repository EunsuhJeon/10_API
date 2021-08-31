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
	
	public void method2() {
		
		String str = new String("hello");
		
		// 2. ���ڿ��� ���ͷ� ������ ����
		String str1 = "hello";
		String str2 = "hello";
		
		System.out.println(str1);
		System.out.println(str2);
		
		System.out.println(str1.hashCode());
		System.out.println(str2.hashCode());
		
		System.out.println(str1 == str2);
		
		System.out.println(System.identityHashCode(str1));
		System.out.println(System.identityHashCode(str2));
		System.out.println(System.identityHashCode(str));
		
		String str3 = "hi";
		
		// StringŬ���� == �Һ�Ŭ����(������ �ʴ� Ŭ����)
		// ������ �����ϱ� �ϳ� �� �ڸ����� �����Ǵ� ������ �ƴ�!
		str3 = "bye";
		System.out.println(System.identityHashCode(str3));
		// �����ϴ� ���� ������ ���ڿ� �ڸ����� ����Ǵ� ���� �ƴ�
		// ���ο� ���� �����ϵ��� �� (���ο� �ּҰ� �ο����� == �ּҰ� ����)
		
		str3 = "hello";
	}

}
