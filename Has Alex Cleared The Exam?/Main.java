#include<bits/stdc++.h>
using namespace std;
int main()
{
  int n,m,f=0;
  cin>>n;
  int a[n];
  for(int i=0;i<n;i++)
    cin>>a[i];
  cin>>m;
  for(int i=0;i<n;i++)
  {
  if(a[i]==m)
  {
  f=1;
    break;
  }
  }
  if(f==1)
    cout<<"She passed her exam";
  else
    cout<<"She failed";
  
  
  
  
return 0;
}