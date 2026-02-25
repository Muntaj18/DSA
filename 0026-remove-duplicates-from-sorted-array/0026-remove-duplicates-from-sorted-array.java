class Solution {
    public int removeDuplicates(int[] nums) {

        int ad=0;
        for(int i=0;i<nums.length;i++)
        {
            if(nums[ad]!=nums[i])
            {
                ad++;
            }
            nums[ad]=nums[i];
        }
        return ad+1;
    }
}
