class Solution {
    public int characterReplacement(String s, int k) {
        int n=s.length(), maxfreq=0, maxm=0;
        int[] freq = new int[26];
        int i=0, j=0;
        while(j<n) {
            freq[s.charAt(j)-'A']++;
            maxfreq = Math.max(maxfreq, freq[s.charAt(j)-'A']);
            int len = j-i+1;
            if (len - maxfreq <=k) {
                maxm = Math.max(maxm, len);
            }else {
                freq[s.charAt(i)-'A']--;
                i++;
            }
            j++;
        }
        return maxm;
    }
}
