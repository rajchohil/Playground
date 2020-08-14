#include<bits/stdc++.h>
#define int long long int
using namespace std;
int32_t main()
{
  ios_base::sync_with_stdio(false);
  cin.tie(NULL);
  cout.tie(NULL);
  int n,m;
  cin>>n>>m;
  int a[n][m];
  for(int i=0;i<n;i++)
  {
     for(int j=0;j<m;j++)
       cin>>a[i][j];
  }
  int b,c;
  cin>>b>>c;
  int s=0;
  for(int i=0;i<m;i++)
  {
      s=s+a[b][i];
    a[b][i]=0;
  }
  for(int i=0;i<n;i++)
  {
    s=s+a[i][c];
    a[i][c]=0;
  }
  cout<<s;
return 0;
}