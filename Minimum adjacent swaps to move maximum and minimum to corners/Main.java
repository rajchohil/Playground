#include<bits/stdc++.h>
using namespace std;
int main()
{
  int n;
  cin>>n;
  int a[n];
  for(int i=0;i<n;i++)
    cin>>a[i];
  int min=INT_MAX,j=-1;
  int max=INT_MIN;
  int c=0;
  for(int i=0;i<n;i++)
  {
    if(a[i]<min)
    {
      min=a[i];
      j=i;
    }
  }
  if(j!=n-1)
  {
    for(int i=j;i<n-1;i++)
    {
       int k=a[i];
      a[i]=a[i+1];
      a[i+1]=k;
      c++;
    }
  }
 for(int i=0;i<n;i++)
  {
    if(a[i]>max)
    {
      max=a[i];
      j=i;
    }
  }
   if(j!=0)
  {
    c=c+(j);
  }
  cout<<c;
return 0;
}
