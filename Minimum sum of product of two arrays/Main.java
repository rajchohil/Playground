#include<bits/stdc++.h>
using namespace std;
int main()
{
ios_base::sync_with_stdio(false);
  cin.tie(NULL);
  cout.tie(NULL);
  int n,k;
  cin>>n;
  int a[n],b[n];
  for(int i=0;i<n;i++)
    cin>>a[i];
  for(int i=0;i<n;i++)
    cin>>b[i];
  cin>>k;
  int dif=0,res=0;
  for(int i=0;i<n;i++)
  {
    int pro=a[i]*b[i];
    res=res+pro;
    int temp;
    if(pro<0&&b[i]<0)
      temp=(a[i]+(2*k))*b[i];
    else if(pro<0&&a[i]<0)
      temp=(a[i]-(2*k))*b[i];
    else if(pro>0&&a[i]>0)
      temp=(a[i]-(2*k))*b[i];
    else if(pro>0&&a[i]<0)
      temp=(a[i]+(2*k))*b[i];
    if(abs(pro-temp)>dif)
      dif=abs(pro-temp);
  }
  cout<<res-dif;
return 0;
}