#include <bits/stdc++.h>

using namespace std;

int main(){

    string s;

    cin>>s;

    int n = s.length();

    int ans = 1;

    int i = 0, j = 1;

    while(j < n){

        if(s[i] == s[j]){

            j++;

        }

        else{

            ans = max(ans, j-i);

            i = j;

        }

    }

    if(i < n) ans = max(ans, j-i);

    cout<<ans<<endl;

    return 0;

}
