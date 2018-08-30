class Example05{
	public static void main(String[] args) {

		/**
		1. for문을 이용하여 1 ~ 100까지의 정수 중에서
		3의 배수의 총합을 구하세요.
		*/

		int i;
		int sum=0;

		for(i=1;i<=100;i++){
			if(i%3==0){
				sum+=i;
			}
		}System.out.println("3의 배수의 합 : "+sum);



		/**
		2. Math.random()메소드를 이용해서 두개의 주사위를
		던졌을 때 나오는 눈을 (눈1,눈2) 형태로 출력하고
		눈의 합이 5이면 실행을 멈춘다.
		(난수는 2개 발생 / 1 ~ 6)
		*/
		System.out.println();
		while(true){
			int x = (int)(Math.random()*6)+1;
			int y = (int)(Math.random()*6)+1;

			if(x+y==5) break;
			System.out.println("("+x+","+y+")");
		}
		
	

		/**
		3. 중첩 for문을 이용하여 방정식 4x + 5y = 60의
		모든 해를 구해서 (x,y)형태로 출력하세요.
		단, x와y는 10 이하의 자연수 이다.
		*/

		System.out.println();
		for(int x=1;x<=10;x++){
			for(int y=1;y<=10;y++){
				if((4*x)+(5*y)==60){
					System.out.println("("+x+","+y+")");
				}
			}
		}
	}
}
