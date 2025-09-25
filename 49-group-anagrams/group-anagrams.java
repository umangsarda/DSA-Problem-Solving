class Solution {
    public List<List<String>> groupAnagrams(String[] strs) {
        if(strs == null || strs.length == 0){
            return new ArrayList<>();
        }
        Map<String, List<String>> map= new HashMap<>();
        for(String s: strs){
            String freqString= freq(s);
            if(map.containsKey(freqString)){
                map.get(freqString).add(s);
            }
            else{
                List<String> list= new ArrayList<>();
                list.add(s);
                map.put(freqString, list);
            }
        }
        return new ArrayList<>(map.values());
    }
    public String freq(String s){
        int arr[]= new int[26];
        StringBuilder sb= new StringBuilder();
        String s1= s.toLowerCase();
        for(int i=0;i<s.length();i++){
            arr[s1.charAt(i) - 'a']++;
        }
        char ch='a';
        for(int c: arr){
                sb.append(ch);
                sb.append(c);
        
        }
        return sb.toString();
    }
}
