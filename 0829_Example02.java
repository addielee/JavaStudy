import java.util.Scanner;

class Example02{
	/*
	연산기호에 따라 연산의 결과를 출력한다.(연산기호 keyboard 입력받는다)
	- 연산 기호(+,-,*,/,%)
	- 임의의 두 개의 난수를 정수형에 저장한다.
	  (난수의 범위는 1~50 사이)
	만약, +라면 발생한 두 개의 난수를 더한 결과를 출력한다.
	  ex) 5+3=8 출력
	-라면 두 개의 난수를 뺀다
	  ex) 5-3=2 출력
	만약 연산기호가 +,-,*,/,%중의 하나가 아니라면
	  "연산기호가 잘못되었습니다." 출력
	*/
	
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
		case "/" : System.out.println(x+"/"+y+"="+((double)x/y)); break;  //연산하고 난 후는 의미 없음. 둘 중 하나를 double로 바꾸자!
		case "%" : System.out.println(x+"%"+y+"="+(x%y)); break;
		default : System.out.println("연산기호가 잘못되었습니다.");
		}
	 /**
	if(operation.equals("+")){
		System.out.println(x+"+"+y+"="+(x+y));
	}else if(operation.equals("-")){
		System.out.println(x+"-"+y+"="+(x-y));
	}else if(operation.equals("*")){
		System.out.println(x+"*"+y+"="+(x*y));
	}else if(operation.equals("/")){
		System.out.println(x+"/"+y+"="+((double)x/y));
	}else if(operation.equals("%")){
		System.out.println(x+"%"+y+"="+(x%y));
	}else{
		System.out.println("연산기호가 잘못되었습니다.");
	}*/
    }
} 
