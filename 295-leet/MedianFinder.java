class MedianFinder {
    
    PriorityQueue<Integer>left;
    PriorityQueue<Integer>right;
    

    public MedianFinder() {
        right = new PriorityQueue<>();
        left = new PriorityQueue<>((a1,a2)->{return a2-a1;});
    }
    
    private void redistribute(){
        int diff = (int)Math.abs(right.size()-left.size());
        if(diff>=2){
            PriorityQueue<Integer>big = left.size()>right.size()?left:right;
            PriorityQueue<Integer>small = left.size()>right.size()?right:left;
            small.add(big.remove());
        }
    }
    public void addNum(int num) {
        if(right.size()==0){
            left.add(num);
        }else{
            if(right.peek()<num){
                right.add(num);
            }else{
                left.add(num);
            }
        }
        redistribute();
    }
    
    public double findMedian() {
        int diff = (int)Math.abs(right.size()-left.size());
        if(diff==0){
            
            return ((double)left.peek()+(double)right.peek())/2 ;
        }
        PriorityQueue<Integer>big = left.size()>right.size()?left:right;
        PriorityQueue<Integer>small = left.size()>right.size()?right:left;
        return big.peek();
        
    }
}
