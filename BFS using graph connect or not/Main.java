#include<bits/stdc++.h>
using namespace std;
 int a[1001][1001];
int checkStrong(int a[][1001],int n,int root)
{
 bool visit[n];
  for(int i=0;i<n;i++)
    visit[i]=false;
  queue<int> q;
  q.push(root);
  visit[root]=true;
  while(!q.empty())
  {
      int x=q.front();
  //  cout<<x<<" ";
  //  visit[x]=true;
    q.pop();
    for(int i=0;i<n;i++)
    {
       if(a[x][i]==1)
       {
          if(visit[i]==false)
          {
            q.push(i);
            visit[i]=true;
          }
       
       }
    }
  }
  int f=0;
  //cout<<"\n";
  for(int i=0;i<n;i++)
  {
  if(visit[i]==false)
  {
   f=1;
    break;
  }
  }
  
//  cout<<root<<" "<<f<<"\n";
  return f;
}
int main()
{
  int n,m;
    memset(a,0,sizeof(a));
  cin>>n>>m;
  while(m)
  {
   int x,y;
    cin>>x>>y;
    a[x][y]=1;
  m--;
  }
  int c;
  for(int i=0;i<n;i++)
  {
      int c=checkStrong(a,n,i);
  //  cout<<i<<" "<<c<<"\n";
    if(c==1)
    {
      cout<<"No";
      break;
    }
    else if(c==0&&i==n-1)
      cout<<"Yes";
  }
  
 

  return 0;
}