class DoWhileEx01 
{
	public static void main(String[] args) 
	{
		//1.1~100까지 한 줄로 출력
		int i=1;
		do{
			System.out.print(i+"\t");
			i++;
		}while(i<=100);

		//2. 1~100 사이의 5의 배수만 출력
		System.out.println();
		i=1;
		do{
			if(i%5==0){
				System.out.print(i+"\t");
			}
			i++;
		}while(i<=100);


		//3. 1~100 출력하되 10행 10열 출력(do_while문 안에 do_while 이용)
		System.out.println();
		i=0;
		do{
			int j=1;
			do{
				System.out.print((i+j)+"\t");
				j++;
			}while(j<=10);
			System.out.println();
			i+=10;
		}while(i<100);


		//4. 구구단 출력
		System.out.println();
		i=1;
		do{
			int j=2;
			do{
				System.out.print(j+"*"+i+"="+(j*i)+"\t");
				j++;
			}while(j<=9);
			System.out.println();
			i++;
		}while(i<=9);
	}
}
