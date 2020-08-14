#include<bits/stdc++.h>
#define int long long int
using namespace std;
int gc(int n,int m)
{
  if(n==0)
    return m;
  if(m>n)
 return gc(n,m-n);
   else
     return gc(m,n-m);
}
int32_t main()
{
int n,m;
  cin>>n>>m;
  int y;
  if(n>m)
    y=gc(m,n);
  else
    y=gc(n,m);
  cout<<y;
return 0;
}
