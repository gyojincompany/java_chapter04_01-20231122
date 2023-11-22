package ch04_01;

public class SwitchTest {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int num = 30;
		//char chr = 'A'; 문자(열)도 가능함
		
		switch (num) {
		case 10:
			System.out.println("num값은 10입니다!");
			break;
		case 20:
			System.out.println("num값은 20입니다!");
			break;
		case 30:
			System.out.println("num값은 30입니다!");
			//break;
		case 40:
			System.out.println("num값은 40입니다!");
			//break;

		default:
			System.out.println("num값은 10, 20, 30, 40 중에 한개의 값이 아닙니다!");
			break;
		}
		
	}

}
