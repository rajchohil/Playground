#include <bits/stdc++.h>
using namespace std;
int main()
{
string s;
  getline(cin,s);
  int x=s.size();
  for(int i=x-1;i>=0;i--)
    cout<<s[i];
}