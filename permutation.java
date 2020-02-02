class permutation{
	public static void main(String args[]){
		int a=Integer.parseInt(args[0]);
		int b=Integer.parseInt(args[1]);
		int c=Integer.parseInt(args[2]);
		int d,i,j,k=0;
		for (j=0;j<3;j++){
			for(i=0;i<=1;i++){
				System.out.print(a);System.out.print(b);System.out.println(c);
				d=b;
				b=c;
				c=d;
				k++;
				}
			if(k==2){
				d=a;
				a=b;
				b=d;
				}
			else{
				d=a;
				a=c;
				c=d;
				}	
			}
		}
	}