class Problem1 {
	
	public static void main(String args[]){
		int i, s=0;
		int limit = 1000;
		s = sumSeq(3, limit) + sumSeq(5, limit) - sumSeq(15, limit);
		System.out.println("The sum is "+s);
	}

	private static int sumSeq(int val, int limit) {
		int count = (limit -1)/val;
		return val * count * (count + 1) / 2;
	}

}