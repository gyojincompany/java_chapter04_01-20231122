package ch04_01;

import java.util.Scanner;

// 1월부터 12월까지 임의의 월을 입력받아 해당 월의 일수(30일, 31일, 28일)를 출력하는 프로그램(switch~case문)
public class SwitchExer {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.out.print("해당 월의 일수를 알고 싶은 월을 숫자로 입력하세요(1~12):");
		Scanner scan = new Scanner(System.in);
		int month = scan.nextInt();//정수를 키보드로 부터 입력 받음
		//System.out.println(month);
		
		switch (month) {
		case 1:
//			System.out.println("31일");
//			break;
		case 3:
//			System.out.println("31일");
//			break;
		case 5:
//			System.out.println("31일");
//			break;
		case 7:
//			System.out.println("31일");
//			break;
		case 8:
//			System.out.println("31일");
//			break;
		case 10:
//			System.out.println("31일");
//			break;
		case 12:
			System.out.println("31일");
			break;
		case 2:
			System.out.println("28일");
			break;		
		case 4:
//			System.out.println("30일");
//			break;		
		case 6:
//			System.out.println("30일");
//			break;		
		case 9:
//			System.out.println("30일");
//			break;		
		case 11:
			System.out.println("30일");
			break;	

		default:
			System.out.println("1부터 12까지의 수 중 1개를 넣어주세요!");
			break;
		}
	}

}
