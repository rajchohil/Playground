#include<bits/stdc++.h>
using namespace std;
int main()
{
  int k,c=0;
  stack<int> s;
  queue<int> q;
  cin>>k;
  while(k>=0)
  {
     s.push(k);
    q.push(k);
    cin>>k;
    c++;
  }
  if(c>0)
  {
    cout<<"Before reversing:"<<"\n";
    while(!q.empty())
    {
      cout<<q.front()<<" ";
      q.pop();
    }
    cout<<"\n";
    cout<<"After reversing:"<<"\n";
     while(!s.empty())
    {
      cout<<s.top()<<" ";
      s.pop();
    }
    cout<<"\n";
  }
  else
    cout<<"Queue is empty";
return 0;
}