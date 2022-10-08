class Solution {
public:
    string minWindow(string s, string t) {
        unordered_map<char,int> m;
        for(auto c:t){
            m[c]++;
        }
        int size=m.size();
          int i=0;
          int j=0; 
          string ans = "";
        int start=0;
        int len=0;
          while(j<s.length()){ 
                m[s[j]]--;
                if(m[s[j]] == 0){
                    size--;
                }
                if(size>0){
                    j++;
                }
                else if(size==0){  
                    while(size==0){ 
                    if(len == 0 || j-i+1<len){
                        start = i;
                        len = j-i+1;
                    } 
                    if(!m.count(s[i])){
                        i++;
                    }else{
                        m[s[i]]++;
                        if(m[s[i]] == 1){
                            size++;
                            i++;
                            j++;
                        }else{
                            i++;
                        }
                      }
                    }
                }
          }
        return s.substr(start,len);
    }
};
