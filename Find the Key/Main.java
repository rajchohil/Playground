#include<bits/stdc++.h>
#define int long int
using namespace std;
int32_t main()
{
  ios_base::sync_with_stdio(false);
  cin.tie(NULL);
  cout.tie(NULL);
  int a[3];
  cin>>a[0]>>a[1]>>a[2];
  int x=INT_MIN,y=INT_MIN;
  int u=INT_MAX,v=INT_MAX;
  for(int i=0;i<3;i++)
  {
    int b=a[i]%10;
    a[i]=a[i]/10;
    int c=a[i]%10;
      a[i]=a[i]/10;
    int d=a[i]%10;
      a[i]=a[i]/10;
    int e=a[i]%10;
    if(e<u)
      u=e;
    if(d>x)
      x=d;
    if(c<v)
      v=c;
    if(b>y)
      y=b;
  }
  cout<<u<<x<<v<<y;

return 0;
}