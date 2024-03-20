#include<iostream>
using namespace std;

void print(int i , int n)
{
    if (i<1)
    {
        return;
    }
    print( (i-1) , n);
    cout<<i<<" ";
    
    
}

int main()
{
    int n = 0 ;
    cin>>n;
    int i = 0;
    print( n , n);
    return 0;
}