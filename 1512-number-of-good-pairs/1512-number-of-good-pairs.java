class Solution {
    public int numIdenticalPairs(int[] nums) {

        int[] freq=new int[101];
        for(int num:nums){
            freq[num]++;
        }
        int pairs=0;
        for(int count:freq){
            if(count >=2)
            pairs +=count*(count-1)/2;

        }
        return pairs;
    }
}