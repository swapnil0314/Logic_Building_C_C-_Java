#include<iostream>
using namespace std;
//  3   2   1
void print(int i , int n)
{
    if (i>n)
    {
        return;
    }
    print(i+1 , n);

    cout<<i<<" "; 
    
      
}

int main()
{
    int n = 0 ;
    cin>>n;
    int i = 0;
    print( i , n);
    return 0;
}