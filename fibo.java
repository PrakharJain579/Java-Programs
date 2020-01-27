class Fibo{
	public static void main(String args[]){
		int n,a,b,c,i;
		a=0;
		b=1;
		System.out.println(a);
		System.out.println(b);
		n=Integer.parseInt(args[0]);
		for (i=0;i<n;i++){
			c=a+b;
			System.out.println(c);
			a=b;
			b=c;
			}
		}
}