#include<bits/stdc++.h>
using namespace std;
int main()
{
  int n,m;
  cin>>n;
  stack<int> s1;
  stack<int> s2;
  int k1[n];
  cout<<"Stack 1 Elements:"<<"\n";
  for(int i=0;i<n;i++)
  {
     cin>>k1[i];
    s1.push(k1[i]);
  }
  for(int i=n-1;i>=0;i--)
    cout<<k1[i]<<" ";
  cout<<"\n";
  cin>>m;
  int k2[m];
  cout<<"Stack 2 Elements:"<<"\n";
   for(int i=0;i<m;i++)
  {
     cin>>k2[i];
    s2.push(k2[i]);
  }
   for(int i=m-1;i>=0;i--)
    cout<<k2[i]<<" ";
  cout<<"\n";
  int x,y;
  cin>>x>>y;
  if(x>n)
  {
    cout<<"Stack underflow. pop from stack 1 failed"<<"\n";
    cout<<"Stack 1 Elements:"<<"\n";
    cout<<"\n";
  }
  else
  {
     while(x)
     {
       s1.pop();
       x--;
     }
    cout<<"Stack 1 Elements:"<<"\n";
    while(!s1.empty())
    {
     cout<<s1.top()<<" ";
      s1.pop();
    }
    cout<<"\n";
  }
    if(y>m)
  {
    cout<<"Stack underflow. pop from stack 2 failed"<<"\n";
    cout<<"Stack 2 Elements:"<<"\n";
    cout<<"\n";
  }
  else
  {
     while(y)
     {
       s2.pop();
       y--;
     }
    cout<<"Stack 2 Elements:"<<"\n";
    while(!s2.empty())
    {
     cout<<s2.top()<<" ";
      s2.pop();
    }
    cout<<"\n";
  }
return 0;
}