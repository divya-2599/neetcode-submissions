class Solution {

    public String encode(List<String> strs) {
        if(strs.isEmpty()){
            return null;
        }

       StringBuilder sb = new StringBuilder();
       for(int i=0;i<strs.size();i++) {
        String val = strs.get(i);
        sb.append(val.length()).append("#").append(val);
       }
       String value =  sb.toString();
       System.out.println(value);
       return value;
    }

    public List<String> decode(String str) {
        if(str==null){
            return Collections.emptyList();
        }
        List<String> list = new ArrayList<>();
        int i=0;
        while(i<str.length()) {
            int j=i;
            while(str.charAt(j)!='#') {
                j++;
            }
            int ele = Integer.parseInt(str.substring(i,j));
            String s = str.substring(j+1, j+1+ele);
            list.add(s);
            i=j+1+ele;
        }
        return list;
    }
}
