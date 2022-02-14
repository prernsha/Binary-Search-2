// Time Complexity : O(log n)
// Space Complexity : O(1) 
// Did this code successfully run on Leetcode : Yes
// Any problem you faced while coding this :


// Your code here along with comments explaining your approach
/*
    Do a binary serach until I find such a mid that matches target. 
    Once found, expand around the mid towards left and right to get
    first and last position of targets occurence in array
*/

class Solution {
    public int[] searchRange(int[] nums, int target) {
        if(nums.length == 1 && nums[0] == target) return new int [] {0,0};
        
        int firstOccurence = occurence(nums, target, true);
        
        if(firstOccurence == -1){
            return new int[] {-1,-1};
        }
        
        int lastOccurence = occurence (nums,target,false);
        
        return new int[] {firstOccurence,lastOccurence};
    }
    
    public int occurence(int[] nums, int target, boolean firstOccurence){
        
        int leftPtr = 0;
        int rightPtr = nums.length-1;
        
        while( leftPtr <= rightPtr){
            
            int mid = (leftPtr + rightPtr) / 2;
            
            if(nums[mid] == target){
                if(firstOccurence){
                    if(mid == leftPtr || nums[mid - 1] != target){
                        return mid;
                    }
                    rightPtr = mid - 1; 
                }else{
                    if(mid == rightPtr || nums[mid + 1] != target){
                        return mid;
                    }
                   leftPtr = mid + 1;
                }
            }else if(nums[mid] > target){
                rightPtr = mid-1;
            }else{
               leftPtr = mid +1;
            }
            
        }
        
        return -1;
    }
}