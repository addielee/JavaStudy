class CastingExam{
	public static void main(String []args){
		byte b1;
		byte b2,b3; 
		int i1=7;
		System.out.println("int i1="+i1);

		b1=(byte)i1 ; //int를 byte에 담을 수없다 -> casting이 필요
		System.out.println("byte b1="+b1);

		b2=20;
		System.out.println("byte b2="+b2);
		
	   	b3=(byte)(b2+b1); //연산에는 최소 4byte 공간이 필요(연산 결과는 int로 바뀜)

		System.out.println("byte b3="+b3);
		
		long lo=56897L;
		System.out.println("long lo="+lo);

		int i4=(int)lo+i1; //서로 다른 type연산하면 결과는 큰 타입으로
		System.out.println("int i4="+i4);
		
		boolean boo;
		 boo=true;  //boolean형은 반드시 true 또는 false 값만 허용
		
		System.out.println("boolean boo="+boo);

		double d=4.67e-3;
		System.out.println("double d="+d);

		float f1=lo;
		System.out.println("float f1="+f1);
				
		
	    float f2=(float)d; //double이 float보다 커서 casting 필요
		System.out.println("float f2="+f2);

		char c1,c2, c3;
		c1='\u0167';
		System.out.println("char c1="+c1);

		b2=(byte)c1;
		System.out.println("byte b2="+b2);
		
		c2='가';
		System.out.println("char c2="+c2);
		
		b2=(byte)c1; //char와 byte는 타입이 같지 않음
		System.out.println("byte b2="+b2);
		
		c3=(char)(c2+2); //"가" + 2 -> 가2, '가'+2 -> 연산 
		System.out.println("char c3="+c3);

		int subjectCount=3;
		int sum=274;
		double avg=sum/(double)subjectCount;

		System.out.println("avg="+avg);
		
		
	}

}
