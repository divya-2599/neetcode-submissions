class Solution {
    public String minWindow(String s, String t) {
        Map<Character, Integer> map = new HashMap<>();
        int count=0, l=0, r=0, minm=Integer.MAX_VALUE, x=0,y=0;
        for(int i=0;i<t.length();i++) {
            map.put(t.charAt(i), map.getOrDefault(t.charAt(i), 0)+1);
        }
        while(r<s.length()) {
            if(map.containsKey(s.charAt(r)) && map.get(s.charAt(r))>0) {
                count=count+1;
            }
            map.put(s.charAt(r), map.getOrDefault(s.charAt(r), 0)-1);
            while(count==t.length()) {
                System.out.println(r);
                while(map.get(s.charAt(l))<0) {
                    map.put(s.charAt(l), map.getOrDefault(s.charAt(l), 0)+1);
                    l++;
                }
                if(r-l+1<minm) {
                    x=l;
                    y=r;
                    System.out.println(x + y);
                    System.out.println(y);
                    minm=Math.min(minm, r-l+1);
                }
                if(map.get(s.charAt(l))==0) {
                    map.put(s.charAt(l), map.getOrDefault(s.charAt(l), 0)+1);
                count--;
                l++;
                }
            }
            r++;
        }
        return minm==Integer.MAX_VALUE? "": s.substring(x, y+1);
    }
}
