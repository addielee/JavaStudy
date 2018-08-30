class Example04{
	public static void main(String[] args) {
		int i;

		for(i=1;i<=5;i++){
			int j;
			for(j=1;j<=5;j++){
				if(i>=j){
					System.out.print("★");
				}else if(i<j){
					System.out.print("  ");
				}
				
			}
			System.out.println();
		}
		
		System.out.println("*********************************");

		for(i=1;i<=5;i++){
			int j;
			for(j=1;j<=5;j++){
				if(i<=(6-j)){
					System.out.print("★");
				}else if(i>(6-j)){
					System.out.print("  ");
				}
				
			}
			System.out.println();
		}

		System.out.println("*********************************");
		
		for(i=1;i<=5;i++){
			int j;
			for(j=1;j<=5;j++){
				if(i>=(6-j)){
					System.out.print("★");
				}else if(i<(6-j)){
					System.out.print("  ");
				}
				
			}
			System.out.println();
		}

		System.out.println("*********************************");

		for(i=1;i<=5;i++){
			int j;
			for(j=1;j<=5;j++){
				if(i<=j){
					System.out.print("★");
				}else if(i>j){
					System.out.print("  ");
				}
				
			}
			System.out.println();
		}

	}
}
