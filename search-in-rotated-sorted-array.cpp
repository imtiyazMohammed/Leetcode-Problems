class Solution {
public:
    int minindex(vector<int>& nums,int start,int end){
        while(start<=end){
            if(nums[start]<=nums[end]){
                return start;
            }
            int middle = start + (end-start)/2;

            int next = (middle+1)%nums.size();
            int prev = (middle-1+nums.size())%nums.size();
            if(nums[middle]<nums[next] && nums[middle] < nums[prev]){
                return middle;
            }
            else if(nums[start] <= nums[middle]){
                start = middle+1;
            }
            else if(nums[middle]<=nums[end]){
                end = middle-1;
            }
        }
        return -1;
    }
    
    int bs(vector<int> &nums,int start,int end,int target){
        while(start<=end){
            int middle = start + (end-start)/2;
            if(nums[middle] == target){
                return middle;
            }
            else if(nums[middle] < target){
                start = middle+1;
            }else{
                end = middle -1;
            }
        }
        return -1;
    }
    
    int search(vector<int>& nums, int target) { 
        int min = minindex(nums,0,nums.size()-1);
        int a1 = bs(nums,0,min-1,target);
        int a2 = bs(nums,min,nums.size()-1,target);
        if(a1 == -1 && a2 == -1){
            return -1;
        }else{
            return max(a1,a2);
        }
        return 0;
    }
};
