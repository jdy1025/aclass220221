package edu.kh.variable.practice;

public class CastingPractice {
	public static void main(String[] args) {
		
		int iNum1 = 10;
		int iNum2 = 4;
		
		float fNum = 3.0f;
		
		double dNum = 2.5;
		
		char ch = 'A';
		
		
		System.out.println( iNum1 / iNum2 ); // iNum1 iNum2를 이용해 2 만들기
		
		System.out.println( (int)dNum  ); // 가장 짧은 2 만드는 코드
		
		System.out.println( (double)iNum1 ); // 10.0을 만들 수 있는 방법 2가지
		System.out.println( (float)iNum1  );

		System.out.println( dNum * iNum2 ); 
		
		
		System.out.println((int)fNum); // 3을 만들수 있는 방법 2가지
		System.out.println(iNum1/(int)fNum);
		System.out.println(iNum1/3);

		
		//System.out.println( iNum1   iNum2 ); // iNum1, iNum2 이용해서 2.5 만들기
		
		
		System.out.println((double)iNum1/iNum2);
		System.out.println(iNum1/(double)iNum2);
		System.out.println((double)iNum1/(double)iNum2);
		
		
		// float / double 차이점
		
						//   10   /  3.0f
		System.out.println( iNum1 / fNum ); // 3.3333333
		
						//    10  /  3.0
		System.out.println( iNum1 / (double)fNum ); // 3.3333333333333335
		
		// float : 소수점 아래 8번째 자리까지 연산 후 반올림 
		// double : 소수점 아래 16번째 자리까지 연산 후 반올림
		
		
 		
		
		
		
		
		
		
	}
}
