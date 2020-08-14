#include<bits/stdc++.h>
using namespace std;
int main()
{
  string s;
  cin>>s;
  stack<char> s1;
  for(int i=0;i<s.length();i++)
    s1.push(s[i]);
  while(!s1.empty())
  {
    cout<<s1.top();
    s1.pop();
  }
}