class ForEx01{
	public static void main(String [] args){
		

		//1.1~100까지 한 줄로 출력
		int i;
		for(i=1;i<=100;i++){
			System.out.print(i+"\t");
		}

		//2. A~Z까지 한 줄로
		System.out.println();
		char c;
		for(c='A';c<='Z';c++){
			System.out.print(c+"\t");
		}
		/**
		for(i=0;i<26;i++){
			System.out.print((char)('A'+i)+"\t");  <-char에 더하기 가능, char는 연산 가능
		}
		*/
		/**
		for(int i=65;i<=90;i++{
			System.out.print((char)i+"\t");  <-알파벳 코드
		}
		*/
		

		//3.1~10사이의 합을 출력
		System.out.println();
		int sum=0;
		for(i=1;i<=10;i++){
			sum+=i;
		}
		System.out.print(sum);

		//4.1~100사이의 7의 배수를 거꾸로 출력한다
		System.out.println();
		for(i=100;i>=1;i--){
			if(i%7==0){
				System.out.print(i+"\t");
			}
		}

		//5.1~100까지 출력하되 10행 10열로 출력한다(for문 안에 for문 이용)
		System.out.println();
		int j;
		for(i=1;i<=10;i++){
			for(j=1+(10*(i-1));j<=10*i;j++){
				System.out.print(j+"\t");
			}
			System.out.print("\n");
		}

		/**
		int sum=1;
		for(i=1;i<=10;i++){
			for(j=1;j<=10;j++){
				System.out.print(sum++ +"\t");
			}
			System.out.print("\n");
		}
		*/
		/**
		for(i=0;i<100;i+=10){
			for(j=1;j<=10;j++){
				System.out.print((j+i) +"\t");
			}
			System.out.print("\n");
		}
		*/

		//6.1~100까지 출력하되 10행 10열로 출력한다(for문 안에 if문 이용)
		System.out.println();
		for(i=1;i<=100;i++){
			if(i%10==0){
				System.out.print(i+"\n");
			}else{
				System.out.print(i+"\t");
			}

		/**
		for(i=1;i<=100;i++){
			System.out.print(i+"\n");
			if(i%10==0){
				System.out.print("\n");
		}
		*/
			
		}
	}
}
