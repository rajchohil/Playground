#include<bits/stdc++.h>
using namespace std;
int n,m;
int a[1001][1001];
//memset(a,0,sizeof(a));
int dfs(int a[][1001],int i,int j)
{
   if(i<0||j<0||j>m-1||i>n-1||a[i][j]==0)
     return 0;
  a[i][j]=0;
  dfs(a,i+1,j);
  dfs(a,i,j+1);
  dfs(a,i-1,j);
  dfs(a,i,j-1);
  dfs(a,i+1,j+1);
  dfs(a,i-1,j-1);
  dfs(a,i+1,j-1);
  dfs(a,i-1,j+1);
  return 1;

}
int is(int a[][1001],int n,int m)
{
   int l=0;
  for(int i=0;i<n;i++)
  {
     for(int j=0;j<m;j++)
     {
        if(a[i][j]==1)
          l=l+dfs(a,i,j);
     }
  }
  return l;
}
int main()
{  //int n,m;
 cin>>n>>m;
  memset(a,0,sizeof(a));
 for(int i=0;i<n;i++)
 {
  for(int j=0;j,j<m;j++)
    cin>>a[i][j];
 }
 int x=is(a,n,m);
 cout<<x-1;
return 0;
}