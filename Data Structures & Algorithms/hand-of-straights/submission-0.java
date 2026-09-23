class Solution {
    public boolean isNStraightHand(int[] hand, int groupSize) {
        Map<Integer,Integer> map = new HashMap<>();
        for(int i=0;i<hand.length;i++){
            map.put(hand[i], map.getOrDefault(hand[i],0)+1);
        }
        Arrays.sort(hand);
        for(int i=0;i<hand.length;i++){
            if(map.containsKey(hand[i])){
                int x=hand[i];
                for(int j=0;j<groupSize;j++){
                  if(!map.containsKey(x))
                  return false;
                  int count=map.get(x);
                  map.put(x, count-1);
                  if(count-1==0)
                  map.remove(x);
                  x++;
                }
            }
        }
        return true;
    }
}
