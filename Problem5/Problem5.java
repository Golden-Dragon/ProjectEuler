class Problem5{
	
	public static void main(String args[]){
		long n,i=1,j,k=21,c=0;
		while(k>0){
			for(i=20;i>=1;i--){
				if(k%i==0)
					c++;
			}	
			if(c==20)
			   break;
			else{
		      k++;
			  c=0;
			}
		}
		System.out.println("Smallest number divisible by the first 20 natural numbers is "+k);
	}
	
}