/**
작성일 : 2018.08.30
작성자 : 이원경
작성 내용 : do_while

*/


import java.util.Scanner;

class DoWhileEx02{
	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		System.out.println("선택 >> 1.증가 2.감소 3.종료");
		int no = sc.nextInt();

		int i=1;
		do{
			if(no==1){
				i++;
				System.out.print("\n증가 결과:"+i);
			}else if(no==2){
				i--;
				System.out.print("\n감소 결과:"+i);
			}

			System.out.println("\n선택 >> 1.증가 2.감소 3.종료");
			no = sc.nextInt();
			if(no==3) System.out.print("\n---프로그램 종료---\n");

		}while(no !=3);


		/**
		Scanner sc=new Scanner(System.in);
		int input;
		int sum=0;

		do{
			System.out.println("선택>> 1.증가 2.감소 3.종료");
			input=sc.nextInt(); 
			switch(input){
				case 1 : System.out.println("증가결과="+(++sum)); break;
				case 2 : System.out.println("감소결과="+(--sum)); break;
			}	
		}while(input !=3);
		System.out.println("프로그램 종료");

		*/
	}
}
