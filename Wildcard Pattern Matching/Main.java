#include<bits/stdc++.h>
using namespace std;
bool match(string s,string c,int n,int m)
{
  bool l[n+1][m+1];
  if(m==0)
    return (n==0);
  memset(l,false,sizeof(l));
  l[0][0]=true;
  for(int i=1;i<=m;i++)
  {
      if(c[i-1]=='*')
        l[0][i]=l[0][i-1];
  }
  for(int i=1;i<=n;i++)
  {
    for(int j=1;j<=m;j++)
    {
        if(c[j-1]=='*')
          l[i][j]=l[i][j-1]||l[i-1][j];
      else if(c[j-1]=='?'||(c[j-1]==s[i-1]))
        l[i][j]=l[i-1][j-1];
      else
        l[i][j]=false;
    
    }
  }
  

return l[n][m];
}
int main()
{
  string s,c;
  cin>>s>>c;
  int n=s.length();
  int m=c.length();
  if(match(s,c,n,m))
  cout<<"true";
  else
    cout<<"false";
return 0;
}