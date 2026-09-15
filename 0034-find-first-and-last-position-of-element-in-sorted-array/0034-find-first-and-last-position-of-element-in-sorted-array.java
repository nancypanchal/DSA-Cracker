class Solution {
    public int[] searchRange(int[] nums, int target) {
       int[]result = {-1,-1};
       int start = 0;
       int end = nums.length - 1;
       int mid = - 1; 
       while(start <= end){
        mid = (start + end)/2;
        if(target == nums[mid]){
            result[0] = mid;
            end = mid - 1;   
        }
        else if(target > nums[mid]){
            start = mid + 1;
        }
        else if(target < nums[mid]){
            end = mid - 1;
        }
       }

       int x = mid;
       start = 0;
       end = nums.length - 1;
       while(start <= end){
        int middle = (start + end)/2;
        if(target == nums[middle]){
            result[1] = middle;
            start = middle + 1;
        }
        else if(target > nums[middle]){
            start = middle + 1;
        }
         else if(target < nums[middle]){
            end = middle - 1;
        }
       }
       return result;
    
    }
}