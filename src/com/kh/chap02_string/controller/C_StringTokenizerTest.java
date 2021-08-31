package com.kh.chap02_string.controller;

import java.util.StringTokenizer;

public class C_StringTokenizerTest {

	public void method() {
		
		String str = "Java,Oracle,JDBC,HTML,CSS,Spring";
		
		// �����ڸ� �������� �ؼ� ���ڿ��� �и���Ű�� ���
		
		// ���1. �и��� ���ڿ����� String[] �迭�� �������� ����� �� ��
		// 		 StringŬ�������� �����ϴ� split �޼ҵ� �̿�
		//		  ���ڿ�.split(������): String[]
		// 		  �ڹ� �̿��� ������ ���� ���̴� ���!
		
		String[] arr = str.split(",");
		System.out.println("�迭�� ����: " + arr.length);
		
		/*
		// for��
		for(int i=0; i<arr.length; i++) {
			System.out.println(i + "��° �ε���: " + arr[i]);
		}
		*/
		
		// ���� for��
		int i = 0;
		for(String s : arr) { // s = arr[0]; => arr[1];
			System.out.println(i++ + "��° �ε���: " + s);
		}
		
		// ���2. �и��� ���ڿ����� ���� ��ū���ν� �����ϰ��� �� ��
		//	 	 java.util.StringTokenizer Ŭ������ �̿��ϴ� ���
		//		 StringTokenizer stn = new StringTokinizer(�и���Ű�����ϴ¹��ڿ�, ������);
		//		  �ڹٿ����� ����ϴ� ���
		StringTokenizer stn = new StringTokenizer(str, ",");
		System.out.println("�и��� ���ڿ��� ����: " + stn.countTokens());
		/*
		System.out.println(stn.nextToken());
		System.out.println(stn.nextToken());
		System.out.println(stn.nextToken());
		System.out.println(stn.nextToken());
		System.out.println(stn.nextToken());
		System.out.println(stn.nextToken());
		
		System.out.println("���� ��ū�� ����: " + stn.countTokens());
		// System.out.println(stn.nextToken()); // NoSuchElementException ���� �߻�
		*/
		
		/* �߸��� ��� (�ݺ����� 3���� ���� ��)
		for(int j=0; j<stn.countTokens(); j++) {
			System.out.println(stn.nextToken());
		}
		*/
		// �� �ݺ��� �������
		// j=0	j<6	true	���("java")		j++
		// j=1	j<5	true	���("Oracle")	j++
		// j=2	j<4	true	���("JDBC")		j++
		// j=3	j<3	false	=> �ݺ��� ��������
		
		// �ذ���1.
		/*
		int count = stn.countTokens(); // count = 6 // ���� 6���� ������
		
		for(int j=0; j<count; j++) {
			System.out.println(stn.nextToken());
		}
		*/
		
		// �ذ���2.
		while(stn.hasMoreTokens()) {
			System.out.println(stn.nextToken());
		}
		
		
		
		
	}
}
