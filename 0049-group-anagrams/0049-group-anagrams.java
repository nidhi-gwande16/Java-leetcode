class Solution {
    public List<List<String>> groupAnagrams(String[] strs) {
        HashMap<String, ArrayList<String>> anagrams=new HashMap<>();
        for(String s:strs)
        {
            char ch[]=s.toCharArray();
            Arrays.sort(ch);
            String keys=String.valueOf(ch);
            if(!anagrams.containsKey(keys)){
                anagrams.put(keys,new ArrayList<>());
            }
            anagrams.get(keys).add(s);
            
        }
        return new ArrayList(anagrams.values());
    }
}