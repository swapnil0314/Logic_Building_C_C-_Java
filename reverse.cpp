#include<bits/stdc++.h>
using namespace std;

int main()
{
int n =7552;
int iRev = 0 ;
int idigit = 0;
while (n != 0)
{
    idigit=n%10;

    iRev=(iRev*10)+idigit;

    n=n/10;
    
}

cout<<iRev;
}