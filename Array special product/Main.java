#include<bits/stdc++.h>
using namespace std;
void SpecialProduct(int a[],int n)
{
  
  int l[n];
 l[0]=1;
  int r[n];
  r[n-1]=1;
    for(int i=1;i<n;i++)
      l[i]=a[i-1]*l[i-1];
  for(int i=n-2;i>=0;i--)
    r[i]=a[i+1]*r[i+1];
  for(int i=0;i<n;i++)
    cout<<l[i]*r[i]<<"\n";
}
int main()
{
  int n;
  cin>>n;
  int a[n];
  for(int i=0;i<n;i++)
    cin>>a[i];
  if(n<=1)
    cout<<0;
  else
 SpecialProduct(a,n);
return 0;
}