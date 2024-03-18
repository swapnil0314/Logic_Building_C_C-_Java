#include<bits/stdc++.h>
using namespace std;

int main()
{

    int n = 36;

    int d = 0 ;
    
    for (d = 1; d<= n ; d++)
    {
        if((n%d) == 0)
        {
            cout<<d<<" ";
        }
    }
    cout<<endl;

}