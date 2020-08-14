#include<bits/stdc++.h>
#define int long long int
using namespace std;
int32_t main()
{
  int n;
  cin>>n;
  int f=0;
if(n<=1)
     cout<<"Not Prime";
  else if(n<=3)
       cout<<"Prime";
  else if(n%2==0||n%3==0)
       cout<<"Not Prime";
  else
  {
    for(int i=5;i*i<=n;i=i+6)
    {
      if(n%i==0||n%(i+2)==0)
      {
       f=1;
        break;
      }
    }
    if(f==1)
         cout<<"Not Prime";
    else
         cout<<"Prime";
  
  
  }

return 0;
}