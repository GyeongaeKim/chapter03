package com.javaex.ex03;

public class PointApp {

	public static void main(String[] args) {
		
		Point p01 = new Point(2, 3);
		Point p02 = new Point(2, 3);
		Point p03 = new Point(2, 2);
		Point p04 = p01;
		
		System.out.println(p01 == p02); //주소 비교
		
		//Point클래스에서 재생성산 eqauls(논리적으로 비교)로 확인해보면 true!
		System.out.println(p01.equals(p02));
		System.out.println(p02.equals(p01));		
		
		System.out.println(p01.equals(p03));
		System.out.println(p02.equals(p03));
		
		
		System.out.println("---------------------------------------------");
		System.out.println(p01 == p04);
		System.out.println(p01.equals(p04));
		
		
	}

}
