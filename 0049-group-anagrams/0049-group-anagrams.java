class Solution {
    public List<List<String>> groupAnagrams(String[] strs) {

        Map<String,List<String>> map=new HashMap<>();

        for(String words:strs)
        {
            char[] chars=words.toCharArray();
            Arrays.sort(chars);
            String key=new String(chars);
            map.putIfAbsent(key,new ArrayList<>());
            map.get(key).add(words);
        }
        return new ArrayList<>(map.values());
        
    }
}