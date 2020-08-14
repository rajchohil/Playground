#include<bits/stdc++.h>
using namespace std;
int main()
{
  int n,m;
  cout<<"Please enter the number of nodes in the graph"<<"\n";
  cin>>n;
  cout<<"Please enter the number of edges in the graph"<<"\n";
  cin>>m;
  int a[n][n];
  cout<<"Is the graph directed"<<"\n";
  string s;
  cin>>s;
  cout<<"Adjacency Matrix Representation:"<<"\n";
  for(int i=1;i<=n;i++)
  {
    for(int j=1;j<=n;j++)
    {
        a[i][j]=0;
      cout<<0<<" ";
    }
    cout<<"\n";
  }
  for(int i=0;i<m;i++)
  {
     cout<<"Enter the start node, end node and weight of edge no "<<i+1<<"\n";
    int x,y,z;
    cin>>x>>y>>z;
    if(s=="yes")
      a[x][y]=z;
    else
    {
      a[x][y]=z;
      a[y][x]=z;
    }
  }
  cout<<"Adjacency Matrix Representation:"<<"\n";
   for(int i=1;i<=n;i++)
  {
    for(int j=1;j<=n;j++)
    {
       // a[i][j]=0;
      cout<<a[i][j]<<" ";
    }
    cout<<"\n";
  }
return 0;
}