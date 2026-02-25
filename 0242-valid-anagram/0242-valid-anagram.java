class Solution {
    public boolean isAnagram(String s, String t) {

        if(s.length() != t.length())
        {
            return false;
        }
        String[] sarr=s.split("");
        String[] tarr=t.split("");
        Arrays.sort(sarr);
        Arrays.sort(tarr);

        return Arrays.equals(sarr,tarr);
        
    }
}