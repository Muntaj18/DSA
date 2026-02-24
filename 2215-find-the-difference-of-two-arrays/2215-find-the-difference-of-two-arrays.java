class Solution {
    public List<List<Integer>> findDifference(int[] nums1, int[] nums2) {

        List<Integer> list1=new ArrayList();
        List<Integer> list2=new ArrayList();

        for(int i:nums1)
        {
            if(!list1.contains(i))
            {
                list1.add(i);
            }
        }
        for(int i:nums2)
        {
            if(!list2.contains(i))
            {
                list2.add(i);
            }
        }

        List<Integer> rem=new ArrayList();
        for(int i:list1)
        {
            if(list2.contains(i))
            {
                rem.add(i);
            }
        }
        List<List<Integer>> res=new ArrayList();
        list1.removeAll(rem);
        list2.removeAll(rem);
        res.add(list1);
        res.add(list2);
        return res;



        
    }
}