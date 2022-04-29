package com.javaex.ex06;

public class Ex02 {

	public static void main(String[] args) {
		
		String a = new String(" abcd");   // a앞에 공백있음
		String b = new String(",efg ");
		
		// 1.concat - 문자열 합치기 -> 합치기만 하고, 원본을 바꾸지는 않음
		System.out.println(a.concat(b));
		
		System.out.println(a);
		System.out.println(b);
		
		System.out.println(a+b);   // ---> concat대신 그냥 + 연산해도 됨ㅎ
		System.out.println("---------------------------------------------");
		
		a = a.concat(b);   // *
		System.out.println(a);
		System.out.println("---------------------------------------------");
		
		
		// 2.trim - 문자열 앞뒤의 공백 없애줌(중간의 공백은 아님)
		System.out.println(a.trim());
		System.out.println("__"+a+"__");   // a 앞뒤로 공백 잘 안보일까봐..ㅎ
		
		a = a.trim();
		System.out.println(a);
		System.out.println("---------------------------------------------");
		
		
		// 3.replace - 교체
		a = a.replace("ab", "12");
		
		/*
		a = a.replace("ab", "12345678");
		a의 앞 두자리(ab)만 바꾸고싶으니까 아무리 많이 넣어도 딱 두개만 들어감
		*/
		
		System.out.println(a);
		System.out.println("---------------------------------------------");
		
		
		// 4.split - 자르기 -> 문자열을 나누어 배열로 리턴한다...!!
		String[] sArray = a.split("");
		for(int i=0; i<sArray.length; i++) {
			System.out.println(sArray[i]);
		}
		
		System.out.println(a);   // a는 멀쩡하다
		System.out.println("---------------------------------------------");
		
		
		// 5.그 외,
		String str = "Hello java!";
		String result01 = str.substring(3);
		System.out.println(result01);
		
		String result02 = str.substring(1, 4);
		System.out.println(result02);
		
		
		char result03 = str.charAt(8);
		//원하는 위치의 글자 하나 꺼내줌(주민번호, 전화번호 등...)
		//0부터...
		System.out.println(result03);
		System.out.println("---------------------------------------------");
		
		
		

	}

}
