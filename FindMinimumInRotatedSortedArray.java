// Time Complexity : O(log n)
// Space Complexity : O(1) 
// Did this code successfully run on Leetcode : Yes
// Any problem you faced while coding this :


// Your code here along with comments explaining your approach

class Solution {
    public int findMin(int[] nums) {
        //edge cases
        if(nums.length == 1) return nums[0]; 
        if(nums.length > 1 && nums[0] < nums[nums.length-1]) return nums[0];
        
        int left = 0;
        int right = nums.length-1;
        
        while(left< right){
            
            int mid = left + (right - left )/2;
            
            if( mid - 1 >= 0 && nums[mid-1] > nums[mid] ){
                return nums[mid];
            }
        
            if( nums[left] <= nums[mid] && nums[mid] > nums [right]){
                left = mid + 1;
            }else{
                right = mid -1;
            }          
        }
        return nums[left];    
    }
}