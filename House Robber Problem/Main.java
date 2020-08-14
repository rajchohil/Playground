#include<bits/stdc++.h>
using namespace std;
int main()
{
 int n;
  cin>>n;
  int a[n];
  for(int i=0;i<n;i++)
    cin>>a[i];
  int si=a[0],cu=0;
  int x;
 for(int i=1;i<n;i++)
 {
  if(si>cu)
    x=si;
   else
     x=cu;
   si=cu+a[i];
   cu=x;
 }
  if(si>cu)
    cout<<si;
  else
    cout<<cu;
return 0;
}