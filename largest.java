class Largest{
	public static void main( String args[]){

	int a,b,c,d;
	a=Integer.parseInt(args[0]);
	b=Integer.parseInt(args[1]);
	c=Integer.parseInt(args[2]);
	if(a>b){
		if(a>c){
			System.out.println(a);
			}		
		}	
	else if(b>a){
		if(b>c){
			System.out.println(b);
			}
		}	
	else if(c>a){
		if(c>b){
			System.out.println(c);
			}
		}	
	}
}