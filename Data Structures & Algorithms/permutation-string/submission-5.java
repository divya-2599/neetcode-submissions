class Solution {
    public boolean checkInclusion(String s1, String s2) {
        int n=s1.length(), m = s2.length(), count=0;
        if(n>m)
        return false;
        int[] freq1 = new int[26];
        int[] freq2 = new int[26];
        for(int i=0;i<n;i++) {
            freq1[s1.charAt(i)-'a']++;
            freq2[s2.charAt(i)-'a']++;
        }
        int matches=0;
        for(int i=0;i<26;i++) {
            if(freq1[i]==freq2[i])
            matches++;
        }
        if(matches==26)
        return true;
        for(int i=n;i<m;i++) {
            int add = s2.charAt(i)-'a';
            freq2[add]++;
            if(freq1[add]==freq2[add]) {
                matches++;
            }else if (freq1[add]+1==freq2[add]){
                matches--;
            }
            int remove = s2.charAt(i-n)-'a';
            freq2[remove]--;
            if(freq1[remove]==freq2[remove]) {
                matches++;
            }else if (freq1[remove]-1==freq2[remove]){
                matches--;
            }
            if(matches==26)
            return true;
        }
        return false;
    }
}
