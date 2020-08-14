#include<bits/stdc++.h>
#define int long long int
using namespace std;
int32_t main()
{
  int n,m;
  cin>>n>>m;
  int x=1;
  for(int i=1;i<=m;i++)
    x=x*n;
  cout<<x;
}