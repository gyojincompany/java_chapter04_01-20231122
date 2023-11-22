package ch04_02;

public class WhileTest02 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int a = 10;
		
		while (a > 0) {
			System.out.println("안녕하세요!");
			a++;//a값이 반복될 때 마다 1씩 증가됨
			if (a == 20) {//a값이 1씩 증가되다가 a값이 20이 되면 break문으로 인해 while문 정지됨
				break;
			}
		}
		
		int b = 10;
		
		while (b < 30) {//10~30사이의 수 중 홀수만 출력
			b++;
			if (b % 2 == 0) {
				continue;//짝수는 밑에 출력문이 실행 안되고 처음으로 돌려버림
			}
			System.out.println(b);
		}
		
		
	}

}
