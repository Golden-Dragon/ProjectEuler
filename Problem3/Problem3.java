import java.io.*;
class Problem3{
    
	public static boolean CheckPrime(long n){
	   long i,c=0;
	   for(i=n/2;i>=1;i--){
	     if (n%i == 0)
			c++;
	   }
	   if (c == 1)
		 return true;
	   else
		 return false;
    }
	
	public static void main(String args []){
	     
		long i,n= 600851475143L,c=0,s=0,k=0;
		boolean cp;
		while (n!=0)
	    {
		   for (i = 2;i <= n;i++)
		   {
			 if (n%i == 0)
			 {
				cp = CheckPrime(i);
				if (cp == true)
				{
					k = i;
					break;
				}
			 }
		   }
		   if (k==n)
		   {
			 s = n;
			 break;
		   }
		   else
		   {
			 n = n / k;
			 s = n;
		   }	
	   }
	   System.out.println("The largest prime factor is "+s);
	   
    }
}
	   