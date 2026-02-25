class Solution {
    public int majorityElement(int[] nums) {
        int temp=0;
        int count=0;

        for(int n:nums)
        {
            if(count==0)
            {
                temp=n;
            }
            if(n==temp)
            {
                count++;

            }else
            {
            count--;
            } 
        }
         return temp;
    }
}
