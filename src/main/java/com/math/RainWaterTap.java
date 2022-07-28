package com.math;

public class RainWaterTap {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int[] trap = {0,1,0,2,1,0,1,3,2,1,2,1};
		int minimumWaterTrap = trap(trap);
		System.out.println(minimumWaterTrap);
	}
	
	public static int trap(int trap[]) {
		int height = trap.length;
		int[] left = new int[height];
		int[] right = new int[height];
		
		int leftMax = Integer.MIN_VALUE;
		int rightMax = Integer.MIN_VALUE;
		
		for(int i = 0; i < height; i++) {
			leftMax = Math.max(trap[i], leftMax);
			left[i] = leftMax;
		}
		
		for(int i = height - 1; i >= 0; i--) {
			rightMax = Math.max(trap[i], rightMax);
			right[i] = rightMax;
		}
		
		int waterTrapTotal = 0;
		for(int i = 0; i < height; i++) {
			
			int minimumWaterTrap = Math.min(left[i], right[i]) - trap[i];
			waterTrapTotal += minimumWaterTrap;
		}
		
		return waterTrapTotal;
	}

}
