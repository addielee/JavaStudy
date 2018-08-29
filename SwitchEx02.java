class SwitchEx02{
	public static void main(String [] args){
		/*
		1~12사이 난수를 발생한다.
		발생한 난수의 달의 몇일까지 있는지 출력한다.
		ex)3월은 31일까지
		31일: 1 3 5 7 8 10 12
		30일: 4 6 9 11
		28일: 2
		*/

		int no=(int)(Math.random()*12)+1;

		/*switch(no){
			case 2 : System.out.println(no+"월은 28일까지."); break;
			case 4 :
			case 6 :
			case 9 :
		    case 11 : System.out.println(no+"월은 30일까지."); break;
			default : System.out.println(no+"월은 31일까지.");
		}*/

		int end=31;

		if(no==2){
			end=28;
		}else if(no==4 || no==6 || no==9 || no==11){
			end=30;
		}
		System.out.println(no+"월은 "+end+"일까지 있습니다.");
			
	}
}
