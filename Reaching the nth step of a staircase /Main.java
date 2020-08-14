#include<bits/stdc++.h>
using namespace std;
int step(int n)
{
 int a[n+5];
  a[1]=1;
  a[2]=2;
 for(int i=3;i<=n;i++)
   a[i]=a[i-1]+a[i-2];
  return a[n];

}
int main()
{
 int n;
  cin>>n;
  cout<<step(n);
return 0;
}