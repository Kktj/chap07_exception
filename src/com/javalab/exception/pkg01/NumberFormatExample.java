package com.javalab.exception.pkg01;

public class NumberFormatExample {

	public static void main(String[] args) {
		
		String strNum = "200"; // 알파벳 o기 때문에 오류
		int intNum = Integer.parseInt(strNum);
		System.out.println(strNum + "  " + intNum);
				

	}

}
