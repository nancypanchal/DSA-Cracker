import java.util.ArrayList;
import java.util.Collections;
class Solution {
    public void rotate(int[] nums, int k) {
        ArrayList<Integer>list=new ArrayList<>();
        for(int num:nums){
            list.add(num);
        }
        Collections.rotate(list,k);
        for(int i=0;i<nums.length;i++){
            nums[i]=list.get(i);
        }
        System.out.println(nums);
    }
}
