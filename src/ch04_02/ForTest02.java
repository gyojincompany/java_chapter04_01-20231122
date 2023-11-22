package ch04_02;

public class ForTest02 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		//1부터 1000까지의 합을 출력하는 for문을 작성하시오.
		int sum=0;
		for (int i=1;i<=1000;i++) {
			sum = sum + i;//누적합계식
		}
		System.out.println(sum);
	}

}
