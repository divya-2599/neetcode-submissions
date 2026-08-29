class TimeMap {

    Map<String, List<Pair>> map = new HashMap<>();
    public TimeMap() {
        
    }
    
    public void set(String key, String value, int timestamp) {
        if(!map.containsKey(key)){
            map.put(key, new ArrayList<>());
        }
        map.get(key).add(new Pair(timestamp, value));
    }
    
    public String get(String key, int timestamp) {
        if(!map.containsKey(key))
        return "";
        List<Pair> list = map.get(key);
        int l=0, r=list.size()-1;
        while(l<=r) {
            int mid=l+(r-l)/2;
            if(list.get(mid).timestamp==timestamp) {
                return list.get(mid).value;
            }else if(list.get(mid).timestamp<timestamp) {
                l=mid+1;
            }else{
                r=mid-1;
            }
        }
        if(r<0)
        return "";
        return list.get(r).value;
    }
}

class Pair {
    int timestamp;
    String value;
    public Pair(int timestamp, String value) {
        this.timestamp=timestamp;
        this.value=value;
    }
}
