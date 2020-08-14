#include<bits/stdc++.h>
using namespace std;
void pal(string s,string r)
{
   int n=s.length();
  int m=r.length();
  int l[n+1][m+1];
  for(int i=0;i<=n;i++)
  {
      for(int j=0;j<=m;j++)
      {
         if(i==0||j==0)
           l[i][j]=0;
        else if(s[i-1]==r[j-1])
          l[i][j]=1+l[i-1][j-1];
        else
          l[i][j]=max(l[i-1][j],l[i][j-1]);
      }
  }
  int i=n;
  int j=m;
  while(i>0&&j>0)
  {
       if(s[i-1]==r[j-1])
       {
          cout<<s[i-1];
         i--;
         j--;
       }
      else if(l[i-1][j]>l[i][j-1])
        i--;
    else
      j--;
  }
}
int main()
{ 
  string s;
  cin>>s;
  string r=s;
 for(int i=0;i<(r.length())/2;i++)
   swap(r[i],r[(r.length())-i-1]);
  pal(s,r);
return 0;
}