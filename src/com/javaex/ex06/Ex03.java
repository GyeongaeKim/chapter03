package com.javaex.ex06;

public class Ex03 {

	public static void main(String[] args) {
		
		Integer i01 = new Integer(10);
		Integer i02 = new Integer(20);
		
		//형변환 필요
		Short s = new Short((short)3);
		Byte b = new Byte((byte)3);
		
		
		Integer iResult = new Integer(3) + new Integer(5);
		System.out.println(iResult);
		
		Integer no = 3;
		int r01 = no.parseInt("1234");		//문자열 --> 정수로
		System.out.println(r01+1);
		
		int r02 = no.parseInt("12345");
		System.out.println(r02);
		
		
		Integer no2 = 100;
		int no3 = no2;          //언박싱
		
		
		//정수-->문자열
		//555 --> "555"
		String str = "안녕하세요";
		String str01 = str.valueOf(555);
		System.out.println(str01+1);      //555는 숫자가 아닌 문자열이기 때문에 +1해도 계산ㄴㄴ
		
		String str02 = String.valueOf(555);   //정수 --> 문자열
		System.out.println(str02);
		
		//정수 --> 문자열
		String str03 = "" + 555; // 문자열 + 정수 --> 문자열로 변환됨
		System.out.println(str03);
		
		
		
		
		
		

	}

}
