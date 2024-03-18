#include<bits/stdc++.h>
using namespace std;



int main()
{
int n =1221;
int iTemp = n;
int iRev = 0 ;
int idigit = 0;
while (n != 0)
{
    idigit=n%10;

    iRev=(iRev*10)+idigit;

    n=n/10;
    
}
if(iRev==iTemp)
{
    cout<<"It is a pallindrome\n";
}
else
{
    cout<<"It is not a pallindrome\n";
}
}