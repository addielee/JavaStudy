class SwitchEx01{
	public static void main(String [] args){
		/*10~20사이 난수 발생
		발생한 난수가 10이면 월요일,
		11이면 화요일, 12면 수요일,
		13이면 목요일, 14이면 금요일,
		15이면 토요일, 16이상이면 일요일*/

		int no=(int)(Math.random()*11)+10;
		char day;

		switch(no){
			case 10 : day='월'; break;
			case 11 : day='화'; break;
			case 12 : day='수'; break;
			case 13 : day='목'; break;
			case 14 : day='금'; break;
			case 15 : day='토'; break;
			default : day='일'; 
		}
		System.out.println(no+"는 "+day+"요일입니다.");

	}
}
