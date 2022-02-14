// Time Complexity : O(log n)
// Space Complexity : O(1) 
// Did this code successfully run on Leetcode : Yes
// Any problem you faced while coding this :


// Your code here along with comments explaining your approach

class Solution {
    public int findPeakElement(int[] nums) {
        int start = 0;
        int end = nums.length -1;
        
        while(start < end){
            
            int mid = (start+end) / 2;
            
            if( nums[mid] > nums[mid +1]){
                end = mid;
            }else {
               start = mid + 1;
            }
            
        }
        
        return start;
    }
}

