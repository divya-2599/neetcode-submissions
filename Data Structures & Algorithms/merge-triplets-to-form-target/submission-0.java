class Solution {
    public boolean mergeTriplets(int[][] triplets, int[] target) {
        boolean x=false, y=false, z=false;
        for(int i=0;i<triplets.length;i++) {
            x=x||(triplets[i][0]==target[0] && triplets[i][1]<=target[1] && triplets[i][2]<=target[2]);
            y=y||(triplets[i][0]<=target[0] && triplets[i][1]==target[1] && triplets[i][2]<=target[2]);
            z=z||(triplets[i][0]<=target[0] && triplets[i][1]<=target[1] && triplets[i][2]==target[2]);
        }
        return x&&y&&z;
    }
}
