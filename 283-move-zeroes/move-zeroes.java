class Solution {
    public void moveZeroes(int[] nums) {
        if(nums.length==1)
            return;
        
        if(nums.length==2 && nums[0]==0){
            nums[0]=nums[1];
            nums[1]=0;
        }

        int j=0;
        for(int num:nums){
            if(num!=0){
                nums[j]=num;
                j++;
            }
        }

        while(j<nums.length){
            nums[j++]=0;
        }
    }
}