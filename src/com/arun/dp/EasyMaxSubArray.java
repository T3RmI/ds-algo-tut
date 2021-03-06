package com.arun.dp;

public class EasyMaxSubArray {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

	}
	
    public int maxSubArray(int[] nums) {
        
    	int[] dp = new int[nums.length];
    	dp[0] = nums[0];
    	int max = dp[0];
    	
    	for(int i = 1; i < nums.length; i++){
    		dp[i] = nums[i] + dp[i-1] > 0 ? dp[i-1] :0;
    		max = Math.max(max, dp[i]);
    	}
    	
    	return max;
    	
    }

}
