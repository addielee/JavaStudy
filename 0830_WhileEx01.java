class WhileEx01 
{
	public static void main(String[] args) 
	{
		//1.1~100까지 한 줄로 출력
		int i=1;
		while(i<=100){
			System.out.print(i+"\t");
			i++;
		}

		//2. 1~100 사이의 5의 배수만 출력
		System.out.println();
		i=1;							//다시 초기화하기!
		while(i<=100){
			i++;
			if(i%5==0) {
				System.out.print(i+"\t");
			}
		}

		//3. 1~100 출력하되 10행 10열 출력(while문 안에 while 이용)
		System.out.println();
		i=1;
		int j=1+(10*(i-1));
		while(i<=10){
			while(j<=10*i){
				System.out.print(j+"\t");
				j++;
			}
			System.out.println();
			i++;
		}
		/**
		i=0;
		while(i<100){
			int j=1;
			while(j<=10){
				System.out.print((i+j)+"\t");
				j++;
			}
			System.out.println();
			i+=10;
		}
		*/

		//4. 구구단 출력
		System.out.println();
		i=1;
		while(i<=9){
			j=2;
			while(j<=9){
				System.out.print(j+"*"+i+"="+(j*i)+"\t");
				j++;
			}
			System.out.println();
			i++;
		}
		
		/**i=1;
		while(i<=9){
			j=2;
			while(j<=9){
				
				System.out.print(j+"*"+i+"="+(j*i)+"\t");
				j++;
			}
			System.out.println();
			i++;
		}*/
		

	}
}
