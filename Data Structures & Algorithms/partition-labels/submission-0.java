class Solution {
    public List<Integer> partitionLabels(String s) {
        List<Integer> arr = new ArrayList<>();
        Map<Character, Integer> map = new HashMap<>();
        int n=s.length(), maxm=Integer.MIN_VALUE, count=0,j=0;
        for(int i=0;i<n;i++) {
            map.put(s.charAt(i), i);
        }
        for(int i=0;i<n;i++) {
            int lastindex=map.get(s.charAt(i));
            maxm=Math.max(maxm, lastindex);
            if(i==maxm){
                arr.add(maxm-j+1);
                j=i+1;
            }
        }
        return arr;
    }
}
