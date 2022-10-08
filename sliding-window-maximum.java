class Solution {
     
    
    public int[] maxSlidingWindow(int[] nums, int k) {
        Deque<Integer> d = new LinkedList<Integer>();
        int arr[] = new int[nums.length-(k-1)];
        int p=0;
        int i=0;
        int j=0;  
        while(j<nums.length){
            if(d.size()>=1){
                while(d.size() >= 1 && d.getLast()<nums[j]){
                     d.removeLast();
               }
                     d.addLast(nums[j]); 
            }else{
                     d.addLast(nums[j]);
            }
            
            if(j-i+1 < k){
                j++;
            } 
            else if(j-i+1 == k){
                arr[p++] = d.getFirst();
                j++;
                if(nums[i] == d.getFirst()){
                    d.removeFirst();
                }
                i++;
            }
        }
        return arr;
    }
}
