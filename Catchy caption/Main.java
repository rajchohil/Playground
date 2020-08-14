#include<bits/stdc++.h>
using namespace std;
int main()
{
  string s;
  getline(cin,s);
  int x=0,i=0,y=s.size();
  while(i<y)
  {
    if(s[i]==' ')
     x++;
    i++;
  }
 // cout<<s<<" "<<x<<"\n";
  if(x<=10)
    cout<<"Caption eligible for the contest";
  else
    cout<<"Caption not eligible for the contest";
return 0;
}