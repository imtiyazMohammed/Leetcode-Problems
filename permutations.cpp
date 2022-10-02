#include <bits/stdc++.h>

using namespace std;

int main(){

    long long n;

    scanf("%lld", &n);

    if(n == 2 || n == 3){

        cout<<"NO SOLUTION";

        return 0;

    } 

    if(n == 4){

        cout<<"2 4 1 3";

        return 0;

    }

    int x = n;

    while(x > 1){

        if(x%2 == 0) cout<<x<<" ";

        x--;

    }

    while(n >= 1){

        if(n%2 != 0) cout<<n<<" ";

        n--;

    }

    return 0;

}
