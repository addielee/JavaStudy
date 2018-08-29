import java.util.Scanner;

class Example02{
	public static void main(String [] args){
		Scanner sc = new Scanner(System.in);
	
	int x = (int)(Math.random()*50)+1;
	int y = (int)(Math.random()*50)+1;

	System.out.print("연산기호를 입력해주세요(+,-,*,/,%): ");
	String operation = sc.nextLine();

	switch(operation){
		case "+" : System.out.println(x+"+"+y+"="+(x+y)); break;
		case "-" : System.out.println(x+"-"+y+"="+(x-y)); break;
		case "*" : System.out.println(x+"*"+y+"="+(x*y)); break;
		case "/" : System.out.println(x+"/"+y+"="+(double)(x/y)); break;  //소수점??
		case "%" : System.out.println(x+"%"+y+"="+(x%y)); break;
		default : System.out.println("연산기호가 잘못되었습니다.");
		}
	}
}
