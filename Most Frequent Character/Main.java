#include<bits/stdc++.h>
using namespace std;
int maxfreq(string s)
{
int a[26];
  memset(a,0,sizeof(a));
  int max=-1;
  for(int i=0;i<s.length();i++)
    a[int(s[i])-97]++;
  for(int i=0;i<26;i++)
  {
    if(a[i]>max)
      max=a[i];
  }
return max;
}
int main()
{
string s;
  cin>>s;
  cout<<maxfreq(s);
return 0;
}