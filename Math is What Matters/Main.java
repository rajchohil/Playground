#include<bits/stdc++.h>
#define int long long int
using namespace std;
int po(int a,int b)
{
int x=1;
  for(int i=0;i<b;i++)
    x=x*a;
  return x;

}
int32_t main()
{
  int n;
  cin>>n;
  int x=n,c=0,l=n;
  while(x!=0)
  {
    x=x/10;
    c++;
  }
  int s=0;
  for(int i=0;i<c;i++)
  {
     int d=n%10;
    int g=po(d,c);
    s=s+g;
    n=n/10;
  }
  if(s==l)
    cout<<"Yes";
  else
    cout<<"No";
return 0;
}