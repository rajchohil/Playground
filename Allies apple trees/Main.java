#include<bits/stdc++.h>
#define int long long int
using namespace std;
int c=0;
int ap(int n,int y)
{
    if(n<=0)
      return 0;
  c++;
   ap(n-(12*y),y+1);
return c;

}
int32_t main()
{
   ios_base::sync_with_stdio(false);
  cin.tie(NULL);
  cout.tie(NULL);
  int n;
  cin>>n;
  int x=ap(n,0);
 // cout<<x;
  x=(x-1)*2;
  cout<<x*4;
return 0;
}