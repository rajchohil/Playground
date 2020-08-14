#include<bits/stdc++.h>
using namespace std;
int longs(int a[],int n)
{
 int b[n];
  b[0]=1;
  for(int i=1;i<n;i++)
  {
    b[i]=1;
     for(int j=0;j<i;j++)
     {
         if(a[j]<a[i]&&(b[i]<(1+b[j])))
           b[i]=1+b[j];
     }
  }
  return *max_element(b,b+n);
}
int main()
{
  int n;
  cin>>n;
  int a[n];
  for(int i=0;i<n;i++)
  {
  cin>>a[i];
  }
  cout<<longs(a,n);
return 0;
}
