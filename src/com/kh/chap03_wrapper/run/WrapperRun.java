package com.kh.chap03_wrapper.run;

public class WrapperRun {

	public static void main(String[] args) {
		/*
		 * * Wrapper Ŭ����
		 * 	 => �⺻�ڷ����� ��ü�� �������� �� �ִ� Ŭ������ ����
		 *  
		 *  �⺻�ڷ���	<---> WrapperŬ����
		 *  boolean			Boolean
		 *   char		   Character
		 *   byte			 Byte
		 *  short			 Short
		 *   int			Integer		*
		 *   long			 Long
		 *  float			 Float 
		 *  double			 Double
		 *  
		 *  => �⺻�ڷ����� ��ü�� ����ؾ��ϴ� ���
		 *  	- �޼ҵ带 ȣ���ؾ��� ��
		 *  	- �޼ҵ��� �Ű������� �⺻�ڷ����� �ƴ� ��üŸ�Ը��� �䱸�� ��
		 *  	- �������� �����Ű�� ���� ��
		 */
		
		// Boxing: �⺻�ڷ��� => WrapperŬ���� �ڷ���
		int num1 = 10;
		int num2 = 15;
		
		//System.out.println(num1.equals(num2));
		
		// 1. ��ü ���� ������ ���� ���
		Integer i1 = new Integer(num1);		// num1 => i1
		Integer i2 = new Integer(num2);		// num2 => i2
		
		System.out.println(i1);
		System.out.println(i2);
		
		System.out.println(i1 == i2);
		
		// ��üȭ ��Ű�� �޼ҵ� ȣ�� ����
		System.out.println(i1.equals(i2));
		System.out.println(i1.compareTo(i2)); // �� ���� ���ؼ� ������ ũ�� 1 ��ȯ, ������ ũ�� -1 ��ȯ, ������ 0��ȯ
		
		// 2. ��ü �������� ���� �ʰ� ��ٷ� �����ϴ� ���(AutoBoxing)
		Integer i3 = num1;
		System.out.println(i3);
		
		// ��ü������ ���� �ݵ�� ��ȯ�ؾ��ϴ� ���		=>���ڿ��� IntegerŸ������
		//Integer i4 = "123";
		Integer i4 = new Integer("123");
		System.out.println(i4);
		
		// UnBoxing: WrapperŬ���� �ڷ��� => �⺻�ڷ���
		
		// 1. �ش� �� WrapperŬ�������� �����ϴ� xxxValue() �޼ҵ带 ����
		int num3 = i3.intValue(); // i3 => num3		10
		int num4 = i4.intValue(); // i4 => num4		123
		
		// 2. �޼ҵ���� ������� �ʰ� �ٷ� �����ϴ� ���(AutoUnBoxing)
		int num5 = i1;
		
		System.out.println("=====================");
		
		// �⺻�ڷ��� <--> String
		
		String str1 = "10";
		String str2 = "15.3";
		
		System.out.println(str1 + str2); // ���ڿ��� �۾���!
		
		// 1. String --> �⺻�ڷ���
		// 		"10" --> 10
		// 	  "15.3" --> 15.3
		// 	�ش� WrapperŬ����.parseXXX() ���
		int i = Integer.parseInt(str1);
		double d = Double.parseDouble(str2);
		
		System.out.println(i + d);
		
		// 2. �⺻�ڷ��� --> String
		// 		10	  --> "10"
		//		15.3  --> "15.3"
		
		String strI = String.valueOf(i);
		String strD = String.valueOf(d);
		
		
		
		
		
		
		
		
		
	}
}