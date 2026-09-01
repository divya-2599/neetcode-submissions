class MedianFinder {
    PriorityQueue<Integer> minpq = new PriorityQueue<>();
    PriorityQueue<Integer> maxpq = new PriorityQueue<>((a,b)->b-a);
    public MedianFinder() {
        
    }
    
    public void addNum(int num) {
        int maxpqsize = maxpq.size();
        if(maxpqsize==0)
        maxpq.add(num);
        else {
            if(num>maxpq.peek())
            minpq.add(num);
            else
            maxpq.add(num);
            if(minpq.size()>maxpq.size()) {
                maxpq.add(minpq.poll());
            }else if(maxpq.size()>minpq.size()+1)
            minpq.add(maxpq.poll());
        }
    }
    
    public double findMedian() {
        if(maxpq.size()==minpq.size()) {
            return (double)(maxpq.peek()+minpq.peek())/2;
        }
        return maxpq.peek();
    }
}
