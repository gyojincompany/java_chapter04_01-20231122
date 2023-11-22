package ch04_02;

public class ForExer03 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		//1부터 100사이의 수중 짝수가 몇개인지 출력하는 코드를 작성하시오.
		int count=0;
		
		for (int i=1;i<=100;i++) {
			if (i % 2 == 0) {
//				count = count + 1;
				count++;
			}
		}
		
		System.out.print(count);
	}

}
