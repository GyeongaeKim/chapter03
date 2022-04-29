package com.javaex.ex01;

public class Ex01 {

	public static void main(String[] args) {
		
		Object obj = new Object();
		Object obj2 = new Object();
		
		// 1.getClass - 클래스 정보
		obj.getClass();
		System.out.println(obj.getClass());
		// 2.hashCode - 주소같은 개념
		obj.hashCode();
		System.out.println(obj.hashCode());
		// 3.toString
		obj.toString();
		System.out.println(obj.toString());
		// 4.equals
		obj.equals(obj);
		obj.equals(args);
		System.out.println(obj.equals(obj));
		System.out.println(obj.equals(args));
		System.out.println("---------------------------------------------");
		
		
		System.out.println("obj.getClass()");
		System.out.println(obj.getClass());
		System.out.println(obj2.getClass());
		System.out.println("---------------------------------------------");
		
		System.out.println("obj.hashCode() - 메모리의 주소값에 대응되는 중복되지 않는 값");
		Object obj01 = new Object();
		Object obj02 = new Object();
		Object obj03 = new Object();
		System.out.println(obj01.hashCode());
		System.out.println(obj02.hashCode());
		System.out.println(obj03.hashCode());
		System.out.println("---------------------------------------------");
		
		System.out.println("obj.toString() - 객체의 값 정보를 문자열로 리턴");
		System.out.println(obj.toString());
		System.out.println(obj2.toString());
		System.out.println("---------------------------------------------");
		
		System.out.println("obj.equals()");
		System.out.println(obj.equals(obj));
		System.out.println(obj.equals(obj2));
		System.out.println("---------------------------------------------");
		
		
		
		
		

	}

}
