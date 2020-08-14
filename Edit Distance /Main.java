#include<bits/stdc++.h>
using namespace std;
int edit(string s1,string s2)
{
  int x=s1.length();
  int y=s2.length();
  int a[x+5][y+5];
  for(int i=0;i<=y;i++)
    a[0][i]=i;
  for(int i=0;i<=x;i++)
    a[i][0]=i;
  for(int i=1;i<=x;i++)
  {
    for(int j=1;j<=y;j++)
    {
      if(s1[i-1]==s2[j-1])
        a[i][j]=a[i-1][j-1];
      else
        a[i][j]=1+min(a[i-1][j-1],min(a[i][j-1],a[i-1][j]));
    }
  }
return a[x][y];
}
int main()
{
string s1,s2;
  cin>>s1>>s2;
  cout<<edit(s1,s2);

return 0;
}