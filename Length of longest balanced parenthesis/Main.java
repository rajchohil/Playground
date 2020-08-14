#include<bits/stdc++.h>
using namespace std;
int check(string s)
{
 int max=0;
  stack<int> s1;
  s1.push(-1);
  for(int i=0;i<s.length();i++)
  {
     if(s[i]=='(')
       s1.push(i);
    else
    {
      s1.pop();
       if(s1.empty())
       {
         s1.push(i);
         continue;
       }
      int curr=0;
      curr=i-s1.top();
      if(curr>max)
        max=curr;
    
    }
  }
  
  
  return max;
}
int main()
{
  string s;
  cin>>s;
  int x=check(s);
  cout<<x;
return 0;
}