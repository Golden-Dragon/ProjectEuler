class Problem4{

    public static boolean CheckPalindrome(long n){
		long r=0,d,or=n;
		while(n>0){
			d=n%10;
			n=n/10;
			r=(r*10)+d;
		}
		if(r==or)
			return true;
		else
			return false;
	}
	
	public static void main(String args[]){
		long i,j,p=1,max=1;
		boolean cp;
		outer: for(i=100;i<1000;i++)
			for(j=100;j<1000;j++){
				p=i*j;
				cp=CheckPalindrome(p);
				if((cp==true) && (p>max))
					max=p;
			}
		System.out.println("The largest multiple is "+max);
	}

}