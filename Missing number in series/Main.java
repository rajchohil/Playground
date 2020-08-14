#include<bits/stdc++.h>
using namespace std;
int binarySearch(int a[],int l,int h,int d)
{  
if(h<=l)
  return-1;
  int m=(l+h)/2;
  if(a[m+1]-a[m]!=d)
    return a[m]+d;
  if(m>0&&(a[m]-a[m-1]!=d))
    return a[m-1]+d;
  if(a[m]==a[0]+(m*d))
    return binarySearch(a,m+1,h,d);
  return binarySearch(a,l,m-1,d);
}
int main()
{
  int n;
  cin>>n;
  int a[n];
  for(int i=0;i<n;i++)
    cin>>a[i];
  int d=(a[n-1]-a[0])/n;
  int x=binarySearch(a,0,n-1,d);
  cout<<x;
return 0;
}