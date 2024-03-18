#include<bits/stdc++.h>
using namespace std;

int main()
{
    int n = 186;
    int iTemp = n;

    int idigit=0;
    int iSum=0;


    while (n != 0)
    {
        idigit=n%10;

        iSum=iSum+(idigit*idigit*idigit);

        n=n/10;

    }

    if(iSum==iTemp)
    {
        cout<<"It is a Armstrong number\n";
    }
    else
    {
         cout<<"It is not a Armstrong number\n";   
    }
    
}