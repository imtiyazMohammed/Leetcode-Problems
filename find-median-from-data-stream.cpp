class MedianFinder {
public:
        priority_queue<int> maxh;
    priority_queue<int,vector<int>,greater<int>> minh; 

    
    MedianFinder() {

    }
    
    void addNum(int num) {
        if(maxh.size()>minh.size()){
            if(maxh.top()>num){  
               minh.push(maxh.top());
                maxh.pop();
                maxh.push(num);
            }
            else {
                minh.push(num);
            }
        }
        else{
            if(maxh.empty()){
              maxh.push(num);
            }else{
                if(num <=maxh.top()){
                maxh.push(num);
            }else{
                minh.push(num);
                 maxh.push(minh.top());
                minh.pop();
            }
            }
        }
    }
    
    double findMedian() { 
        if(minh.size() == maxh.size()){
            if(maxh.empty()) return 0;
	   double avg = (maxh.top() + minh.top()) / 2.0;
				return avg;
        }else{
            return maxh.top();
        }
    }
};
