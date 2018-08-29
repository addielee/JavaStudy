
class MathOperatorExam{
	public static void main(String []args){
		int i=5;
		int j=2;
		System.out.println("i+j="+i+j);  //i+j=52 -> ""+i가 먼저 연산됨. 그 다음 j , 연산으로 하고 싶으면 괄호
		System.out.println("i-j="+(i-j)); //i-j=3
		System.out.println("i*j="+(i*j)); //i*j=10
		System.out.println("i/j="+(i/j)); //i/j=2
		System.out.println("i%j="+(i%j)); //i%j=1

		System.out.println("i="+i); //i=5
		
		int k=i++;  //선대입 후 증가
		System.out.println("k="+k); //k=5
		System.out.println("i="+i); //i=6
		
		int p=++i;
		System.out.println("p="+p); //p=7
		System.out.println("i="+i); //i=7

		int x=19 + 4 * 3 / 2 - 10 * 2 + 4; //i=9

		System.out.println("19+4*3/2-10*2+4="+x); //19+4*3/2-10*2+4=9
	}	
}
