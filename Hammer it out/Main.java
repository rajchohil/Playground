#include<bits/stdc++.h>
#define int long long int
using namespace std;
int32_t main()
{
  int n;
  cin>>n;
  int c=0;
  int o=0;
  int e=0;
  int x=n;
  while(x!=0)
  {
     x=x/10;
    c++;
  }
  if(c%2==0)
  {
     while(n!=0)
     {
        e=e+n%10;
       n=n/10;
       if(n>0)
       {
       o=o+n%10;
       n=n/10;
       }
     }
  }
  else
  {
      while(n!=0)
     {
        o=o+n%10;
       n=n/10;
        if(n>0)
        {
       e=e+n%10;
       n=n/10;
        }
     }
  }
  cout<<abs(o-e);
return 0;
}