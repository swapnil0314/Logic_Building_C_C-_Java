#include<bits/stdc++.h>
using namespace std;

int main()
{
    int n = 15;
    int icnt=0;

    for (int  i = 1; i <= n; i++)
    {
        if((n%i) == 0)
        {
            icnt++;
        }
    }
    if(icnt == 2)
    {
        cout<<"It is a prime number"<<" ";
    }
    else
    {
         cout<<"It is not a prime number"<<" ";
    }
    

    return 0;
}