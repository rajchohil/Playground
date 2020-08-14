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
  int i=2;
  vector <int>v;
  while(i<=n&&i<=m)
  {
    if(n%i==0&&m%i==0)
      v.push_back(i);
  i++;
  }
  int x=0;
  int y=v.size();
  for(int i=y-1;i>=0;i--)
  {
    int f=0;
    if(v[i]==2||v[i]==3)
    {
      cout<<v[i];
      x=1;
      break;
    }
      if(v[i]%2==0||v[i]%3==0)
       f=1;
    for(int j=5;j*j<=v[i];j=j+6)
    {
         if(v[i]%j==0)
         {
            f=1;
           break;
         }
    }
    if(f==0)
    {
        cout<<v[i];
      x=1;
      break;
    }
  
  }
  if(x==0)
    cout<<-1; 
return 0;
}