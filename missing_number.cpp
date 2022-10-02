#include <bits/stdc++.h>

using namespace std;

int main(){

    int n;

    scanf("%d", &n);

    set<int> st;

    for(int i  = 0; i < n; i++){

        int x;

        cin>>x;

        st.insert(x);

    }

    int ans = 1;

    for(int i = 1; i <= n; i++){

        if(st.find(i) == st.end()){

            ans = i;

            break;

        }

    }

    cout<<ans<<endl;

    return 0;

}
