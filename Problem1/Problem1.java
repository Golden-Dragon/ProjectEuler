import java.io.*;
class Problem1 {
	
	public static void main(String args[]){
		int i, s=0;
		for(i=1;i<1000;i++){
			if((i%3==0) || (i%5==0)){
				s=s+i;
			}
		}
		System.out.println("The sum is "+s);
	}

}