class Solution {
    public int[][] kClosest(int[][] points, int k) {
        int m = points.length;
        PriorityQueue<int[]> pq = new PriorityQueue<>((a,b)->{
            int dist1=a[0]*a[0]+a[1]*a[1];
            int dist2=b[0]*b[0]+b[1]*b[1];
            return dist2-dist1;
        });
        for(int i=0;i<m;i++) {
            pq.add(new int[]{points[i][0], points[i][1]});
            if(pq.size()>k)
            pq.poll();
        }
        int[][] arr = new int[k][2];
        for(int i=0;i<=k;i++) {
            int[] arr1 = pq.poll();
            if(arr1!=null) {
                arr[i][0]=arr1[0];
                arr[i][1]=arr1[1];
            }
        }
        return arr;
    }
}
