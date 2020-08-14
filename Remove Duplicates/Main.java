#include<bits/stdc++.h>
using namespace std;
int main()
{
string s;
  cin>>s;
  map<char,int> m;
  for(auto it=s.begin();it!=s.end();it++)
  {
      if(!m[*it])
        cout<<*it;
    m[*it]++;
  
  }
  //cout<<s;
return 0;
}