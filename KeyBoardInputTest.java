import java.util.Scanner;

class KeyBoardInputTest{
	public static void main(String [] args){
		//모니터 출력-> System.out.println() or printf(),print()
		//키보드 입력 ->System.in

		Scanner sc=new Scanner(System.in);

		System.out.println("연산기호를 입력해주세요(=,-,/,*,%).");
		String operation = sc.nextLine();
		System.out.println("operation= "+operation);
		
	}
}
