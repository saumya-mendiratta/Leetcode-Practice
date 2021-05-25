package Leetcode;

public class Q33 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		int[] nums = {8,9,2,3,4};
		System.out.println(search(nums, 9));
	}

	public static int search(int[] nums, int target) {

		int left = 0;
		int right = nums.length - 1;
		int mid = (left + right) / 2;
		
		int pivot=-1;
		
		while(left<=right) {
			
			if( mid+1<=nums.length-1 &&  nums[mid+1] < nums[mid]) {
				pivot=mid;
				break;
			}
			
			else if(nums[mid] >= nums[left]) {
				left=mid+1;
			}
			
			else
				right=mid-1;
			
			 mid = (left + right) / 2;
			
		}
	
		System.out.println(pivot);
		
		if(pivot!=-1 && nums[pivot] == target)
			return pivot;
		
		if(pivot ==-1) {
			 left = 0;
			 right = nums.length - 1;
			
		}else {
			
			if(target>=nums[0] && target<nums[pivot]) {
				left=0;
				right=pivot-1;
			}
			else {
				 left=pivot+1;
				 right = nums.length - 1;
			}
		}
		
		 mid = (left + right) / 2;
		 
			while (left <= right) {


				if (target > nums[mid]) {
					left = mid + 1;
				} else if (target < nums[mid]) {
					right = mid - 1;
				} else {
					return mid;
				}

				mid = (left + right) / 2;
			}
		
		return -1;
	}
}
