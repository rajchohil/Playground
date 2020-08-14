#include<bits/stdc++.h>
using namespace std;
int main()
{
  int n,m;
  cout<<"Enter the number of vertices:"<<"\n";
  cout<<"Enter the number of edges:"<<"\n";
  cin>>n>>m;
  vector<int> v[n];
  for(int i=0;i<m;i++)
  {
    cout<<"Enter the Start node and End node of edge "<<i+1<<"\n";
     int x,y;
    cin>>x>>y;
    v[x].push_back(y);
    v[y].push_back(x);
  }
  cout<<"Adjacency List:"<<"\n";
  for(int i=0;i<n;i++)
  {
    cout<<i<<"--->";
    for(auto it=v[i].begin();it!=v[i].end();it++)
      cout<<*it<<" ";
    cout<<"\n";
     
  }
return 0;
}