#include<bits/stdc++.h>
using namespace std;
int main()
{
  int n;
  cin>>n;
  int a[n];
  for(int i=0;i<n;i++)
    cin>>a[i];
  int x=a[0];
  int j=0;
  for(int i=1;i<n;i++)
  {
     if(x>a[i])
     {
        x=a[i];
       j=i;
     }
  }
  int y=a[0];
  a[j]=y;
  a[0]=x;
  for(int i=0;i<n;i++)
    cout<<a[i]<<" ";
return 0;
}