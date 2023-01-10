package com.yedam.variable;

public class Variable01 {
	public static void main(String[] args) {
		int hour = 3;
		int minute = 5;
		System.out.println(hour+"시간"+minute+'분');
		int totalMinute = (hour*60)+minute;
		System.out.println("총"+totalMinute+'분');
		int value = 0;
		int result = value + 10;
		System.out.println(result);
		int x = 3;
		int y = 5;
		// x<->y 의 값 바꾸기
		int z = 0;
		// x의 데이터를 미리 z에 담아 두고,
		// 1)x->z (z=3)
		// 2)y->x (x=5)
		// 3)z->y (y=3)
		z=x;
		x=y;
		y=z;
		System.out.println(y);
	}
}
