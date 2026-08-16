class Solution {
    public int lengthOfLongestSubstring(String s) {
        if(s.length()==0)
        return 0;
        Map<Character, Integer> map = new HashMap<>();
        int maxm=1, i=0, j=0;
        while(j<s.length()) {
            if(map.containsKey(s.charAt(j))) {
                i=Math.max(map.get(s.charAt(j))+1, i);
                map.remove(s.charAt(j));
            }else {
                map.put(s.charAt(j), j);
                maxm=Math.max(maxm, j-i+1);
                j++;
            }
        }
        return maxm;
    }
}
