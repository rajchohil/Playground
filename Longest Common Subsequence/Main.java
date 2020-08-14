#include<bits/stdc++.h>
#define int long long int
using namespace std;
int subs(string s1,string s2)
{
  int x=s1.length();
  int y=s2.length();
  if(x==0||y==0)
    return 0;
  int a[x+5][y+5];
  a[0][0]=0;
  for(int i=1;i<=x;i++)
  {
    a[i][0]=0;
  }
   for(int i=1;i<=y;i++)
  {
    a[0][i]=0;
  }
  for(int i=1;i<=x;i++)
  {
     for(int j=1;j<=y;j++)
     {
       if(s1[i-1]==s2[j-1])
         a[i][j]=1+a[i-1][j-1];
       else
         a[i][j]=max(a[i-1][j],a[i][j-1]);
     }
  }
  return a[x][y];
}
int32_t main()
{
string s1,s2;
  cin>>s1>>s2;
  cout<<subs(s1,s2);
return 0;
}