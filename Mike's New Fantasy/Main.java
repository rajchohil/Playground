#include<bits/stdc++.h>
#define int long long int
using namespace std;
int fib(int n)
{
  if(n<=1)
    return n;
  return fib(n-1)+fib(n-2);
}
int32_t main()
{
  int n;
  cin>>n;
  int a[72];
  a[0]=0;
  a[1]=1;
  for(int i=2;i<72;i++)
    a[i]=a[i-1]+a[i-2];
  if(n<=0)
    cout<<0;
else
  cout<<a[n-1];
// int x=fib(n);
// cout<<x;
return 0;
}