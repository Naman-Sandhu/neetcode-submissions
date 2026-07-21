class Solution {
    public List<List<String>> groupAnagrams(String[] strs) {
        Map<String,List<String>> map = new HashMap<>();
        for(String s : strs){
            char[] charray =  s.toCharArray();
            Arrays.sort(charray);
            String sortedS = new String(charray);
            map.putIfAbsent (sortedS, new ArrayList<>());
            map.get(sortedS).add(s);
        }
    return new ArrayList<>(map.values());
        
    }
}
