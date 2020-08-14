#include<bits/stdc++.h>
using namespace std;
int main()
{
int n;
  cin>>n;
  int a[n][n];
  for(int i=0;i<n;i++)
  {
     for(int j=0;j<n;j++)
     {
       cin>>a[i][j];
     }
  }
  int j;
  int x=ceil((double )n/2);
  for(int i=0;i<x;i++)
  {
     for(j=i;j<=n-i-1;j++)
     {
       cout<<a[i][j]<<" "; 
     }
    for(j=i+1;j<=n-i-1;j++)
    {
      cout<<a[j][n-i-1]<<" ";
    }
    for(j=n-i-2;j>=i;j--)
    {
      cout<<a[n-i-1][j]<<" ";
    }
    for(j=n-i-2;j>i;j--)
    {
      cout<<a[j][i]<<" ";
    }
  
  }
 // cout<<x;
  
  
  
  
return 0;
}