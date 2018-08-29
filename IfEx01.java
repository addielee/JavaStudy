class IfEx01{
	public static void main (String [] args){
		//1. 임의의 정수형 변수를 선언하고 적당히 초기화한다.

		//2.선언된 변수의 값이 짝수이면 "숫자는 짝수입니다." 출력
		//	아니면 "숫자는 홀수 입니다." 출력

		int x;
		
		if(x%2==0){
			System.out.println(x+"는 짝수입니다.");
		}else{
			System.out.println(x+"는 홀수입니다.");
		}
	}
}

class IfEx01{
	public static void main (String [] args){
	//난수발생
	
		/**double nansu=Math.random()*5 ;
		int convertNo = (int)nansu;
		System.out.println("nansu="+nansu);
		System.out.println("convertNo="+convertNo);*/
		
		//1. 임의의 정수형 변수를 선언하고 적당히 초기화한다.
		int no=(int)(Math.random()*10)+1;//1~10 사이의 난수

		//2.선언된 변수의 값이 짝수이면 "숫자는 짝수입니다." 출력
		//	아니면 "숫자는 홀수 입니다." 출력
		
		if(no%2==0){
			System.out.println(x+"는 짝수입니다.");
		}else{
			System.out.println(x+"는 홀수입니다.");
		}
	}
}
