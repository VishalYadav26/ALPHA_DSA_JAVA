import java.util.Scanner;
public class MaxSumprefix {
	public static void maxSubarraySum(int numbers[]) {
        int currsum =0;
		int maxsum= Integer.MIN_VALUE;
        int prefix[]=new int[numbers.length];
        prefix[0]= numbers[0];
        for(int i=1;i<prefix.length;i++){
            prefix[i]=prefix[i-1]+numbers[i];
        }

		for (int i=0; i<numbers.length; i++) {
            int start = i;
			for (int j=i;j<numbers.length; j++) {
				int end = j;
				currsum=start==0?prefix[end]:prefix[end]-prefix[start-1];
				if (maxsum<currsum){
					maxsum=currsum;
				}
			}
		}
    	System.out.println("MaxSum is:"+maxsum);

	}
	public static void main (String args[]) {
		int numbers[]= {1,-2,6,-1,3};
		maxSubarraySum(numbers);
	}
} 
