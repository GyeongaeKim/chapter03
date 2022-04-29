package com.javaex.ex06;

public class Ex01 {

	public static void main(String[] args) {
		
		String s01 = new String("안녕하세요");   //new생성자를 이용해서 인스턴스 생성
		String s02 = new String("안녕하세요");   //new생성자를 이용해서 인스턴스 생성
		
		System.out.println(s01.toString());
		System.out.println(s02.toString());
		
		System.out.println(s01 == s02);
		System.out.println("---------------------------------------------");
		
		//한번 저장된 String객체의 값은 변하지 않는다
		String s03 = "hi";
		String s04 = "hi";   //s04는 s03으로 생성된 인스턴스(문자열 값)을 참조한다
		
		System.out.println(s03.toString());
		System.out.println(s04.toString());
		
		System.out.println(s03 == s04);     //같은 인스턴스를 참조하기 때문에 true!
		System.out.println("---------------------------------------------");
		
		//
		s03 = "하이하이";   //새로운 인스턴스 생성!
		
		System.out.println(s03.toString());
		System.out.println(s04.toString());
		
		System.out.println(s03 == s04);     //***
		
		
		
		

	}

}
