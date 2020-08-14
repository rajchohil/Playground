#include<bits/stdc++.h>
using namespace std;
int SumofDigits(int a)
{
   if(a==0)
     return 0;
  else
    return (a%10)+SumofDigits(a/10);
}
int main()
{
   int t,n,d;
  //cin>>t;
    cin>>n>>d;
    int c=0;
    for(int i=1;i<=n;i++)
    {
         int x=SumofDigits(i);
      //cout<<i<<" "<<x<<"\n";
      if((i-x)>=d)
        c++;
    }
    cout<<c<<"\n";

return 0;
}