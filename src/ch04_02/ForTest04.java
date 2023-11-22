package ch04_02;

public class ForTest04 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		// 중첩 for문으로 구구단 만들기
		
		for (int i=2;i<=9;i++) {
			for (int j=1;j<=9;j++) {
				System.out.println(i + " X " + j+ " = " + (i*j));
			}
			System.out.println("=======================");
			
		}
	}

}
