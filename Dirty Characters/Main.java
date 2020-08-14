#include<bits/stdc++.h>
using namespace std;
int main()
{
string s1,s2;
 getline(cin,s1);
  getline(cin,s2);
 // cout<<s1<<"\n"<<s2<<"\n";
  for(int i=0;i<s1.length();i++)
  {
    if(s1[i]==' ')
      s1[i]='!';
  }
  for(int i=0;i<s2.length();i++)
  {
    if(s2[i]==' ')
      s2[i]='!';
  }
  map<int,int> m;
  for(int i=0;i<s2.length();i++)
  {
    m[int(s2[i])]++;
  }
  for(int i=0;i<s1.length();i++)
  {
    if(m[int(s1[i])])
    {
      s1.erase(s1.begin()+i);
      i--;
    }
  }
  for(int i=0;i<s1.length();i++)
  {
    if(s1[i]=='!')
    {
      s1[i]=' ';
   //   i--;
    }
  }
  cout<<s1;
return 0;
}