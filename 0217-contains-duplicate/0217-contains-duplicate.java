class Solution {
    public boolean containsDuplicate(int[] nums) {

        Set<Integer> result=new HashSet<>();
        for(int n:nums)
        {
            if(!result.add(n))
            {
                return true;
            }
        }
        return false;
    }
}