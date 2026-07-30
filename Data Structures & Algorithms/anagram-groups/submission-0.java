class Solution {
    public List<List<String>> groupAnagrams(String[] strs) {
        Map<String, List<String>> map = new HashMap<>();
        List<List<String>> list = new ArrayList<>();
        for(int i=0;i<strs.length;i++) {
            int arr[] = new int[26];
            String str = strs[i];
            for(int j=0;j<str.length();j++) {
                arr[str.charAt(j)-'a']++;
            }
            StringBuilder string = new StringBuilder();
            for(int j=0;j<26;j++) {
                if(arr[j]!=0) {
                string.append((char) ('a' + j));
                string.append(arr[j]);
                }
            }
            System.out.println(string.toString());
            if(map.containsKey(string.toString())) {
                //System.out.println(list);
                map.get(string.toString()).add(str);
            }else{
                map.put(string.toString(), new ArrayList<>(List.of(str)));
            }
        } 
        for(Map.Entry<String, List<String>> entry : map.entrySet()) {
            list.add(entry.getValue());
        }
        return list;
    }
}
