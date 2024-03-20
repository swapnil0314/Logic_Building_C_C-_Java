#include<iostream>
using namespace std;

void print(int i , int n)
{
    if (i>n)
    {
        return;
    }
    cout<<i<<" ";
    print( (i+1) , n);
    
}

int main()
{
    int n = 0 ;
    cin>>n;
    int i = 0;
    print( i , n);
    return 0;
}