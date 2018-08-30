import java.util.Scanner;

class Example06{
	public static void main(String[] args) {
		boolean run=true;
		int balance=0;

		Scanner sc=new Scanner(System.in);

		while(run){
			System.out.println("----------------------------------");
			System.out.println("1.예금 | 2.출금 | 3. 잔고 | 4.종료");
			System.out.println("----------------------------------");
			System.out.print("선택>");
			int no = sc.nextInt();

			if(no==1){
				System.out.print("예금액>");
				int in = sc.nextInt();
				balance=balance+in;
				System.out.println();
			}else if(no==2){
				System.out.print("출금액>");
				int out = sc.nextInt();
				balance=balance-out;
				System.out.println();
			}else if(no==3){
				System.out.println("잔고>"+balance);
				System.out.println();
			}else if(no==4) break;
			else System.out.println("잘못 입력");
			System.out.println();
		}
		System.out.println("\n프로그램 종료");
		
	}
}
