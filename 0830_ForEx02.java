class ForEx02{ // 구구단
	public static void main(String [] args){
		int i,j;
		for(i=1;i<=9;i++){
			for(j=2;j<=9;j++){
				System.out.print(j+"*"+i+"="+(j*i)+"\t");
			}
			System.out.println();
		}

	}
}
