#include<bits/stdc++.h>
using namespace std;
int main()
{
  int n,m;
  cin>>n>>m;
  int x,y;
  cin>>x>>y;
  int a[n+5][m+5];
  int min=INT_MIN;
  for(int i=0;i<n;i++)
  {
  for(int j=0;j<m;j++)
  {
     a[i][j]=abs(x-i)+abs(y-j);
    if(a[i][j]>min)
      min=a[i][j];
  }
  }
  cout<<min+1;
return 0;
}