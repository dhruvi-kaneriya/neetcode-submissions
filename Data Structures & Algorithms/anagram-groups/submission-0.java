class Solution {
    public List<List<String>> groupAnagrams(String[] strs) {
        
        Map<String, List<String>> mapstr = new HashMap<>();

        for(String s : strs){
            char[] charArray = s.toCharArray();

            Arrays.sort(charArray);
            String sorted =  new String(charArray);

            mapstr.putIfAbsent(sorted, new ArrayList<>());
            mapstr.get(sorted).add(s);

            
        }
        return new ArrayList<>(mapstr.values());
    }
}
