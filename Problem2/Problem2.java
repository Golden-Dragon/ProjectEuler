class Problem2
{
	public static void main(String args[]){
		int a=1,b=1,c,s=0;
		c=a+b;
		while(c<4000000){
		  a=b;
		  b=c;
		  if(c%2==0){
			s=s+c;  
		  }
		  c=a+b;
		}
		System.out.println("The sum is "+s);
	}

}