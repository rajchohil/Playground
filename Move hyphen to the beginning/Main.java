#include<bits/stdc++.h>
using namespace std;
int main()
{
 string s;
  cin>>s;
  int c=0;
  for(int i=0;i<s.length();i++)
  {
     if(s[i]=='-')
       cout<<s[i];
  }
  for(int i=0;i<s.length();i++)
  {
    if(s[i]!='-')
      cout<<s[i];
  }
return 0;
}