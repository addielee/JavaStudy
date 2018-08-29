class IfEx02{
	public static void main(String [] args){
		int no=(int)(Math.random()*11)+10;
		
		char yoil='일'; //<-초기값 설정
		if(no==10) yoil='월';
		else if(no==11) yoil='화';
		else if(no==12) yoil='수';
		else if(no==13) yoil='목';
		else if(no==14) yoil='금';
		else if(no==15) yoil='토';
		//->else는 안 써도 됨(디폴트가 '일'이라서)

		System.out.println(no+"는 "+yoil+"요일 입니다.");
	

		/*if(no==10){
			System.out.println("월요일");
		}else if(no==11){
			System.out.println("화요일");
		}else if(no==12){
			System.out.println("수요일");
		}else if(no==13){
			System.out.println("목요일");
		}else if(no==14){
			System.out.println("금요일");
		}else if(no==15){
			System.out.println("토요일");
		}else{
			System.out.println("일요일");
		}*/
	}
}
