#include<bits/stdc++.h>
#define int long long int
using namespace std;
int pow(int n,int m)
{
int s=1;
  for(int i=0;i<m;i++)
    s=s*n;
return s;
}
int32_t main()
{
int n;
  cin>>n;
  int a[n];
  for(int i=0;i<n;i++)
    cin>>a[i];
  int x=pow(2,n);
  for(int i=x-1;i>=1;i--)
  {
   int b[n];
    int c=n-1;
    int y=i;
    while(c>=0)
    {
       b[c]=y%2;
      c--;
      y=y/2;
    }
    for(int j=0;j<n;j++)
    {
      if(b[j]==1)
        cout<<a[j]<<",";
    }
  cout<<"\n";
  }
  cout<<"\n";
return 0;
}