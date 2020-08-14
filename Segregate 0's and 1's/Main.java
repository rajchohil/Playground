#include<bits/stdc++.h>
using namespace std;
int main()
{
  string s;
  cin>>s;
  int x=s.size();
  int a=0;
  int b=0;
  for(int i=0;i<x;i++)
  {
    if(s[i]=='0')
      a++;
    else
      b++;
  }  
  //cout<<a<<" "<<b;
  while(b>0)
  {
    cout<<1;
    b--;
  }
  while(a>0)
  {
    cout<<0;
    a--;
  }
return 0;
}