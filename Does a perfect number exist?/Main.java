#include<bits/stdc++.h>
#define int long long int
using namespace std;
int32_t main()
{
   int n;
  cin>>n;
  int x=0;
  for(int i=1;i<=sqrt(n);i++)
  {
     if(n%i==0)
     {
        if(n/i!=i&&n/i!=n)
        {
             x=x+i;
          x=x+(n/i);
        
        }
       else
         x=x+i;
     }
  
  }
  if(x==n)
    cout<<"Yes";
  else
    cout<<"No";
return 0;
}