#include<bits/stdc++.h>
using namespace std;
int main()
{
  string s;
  cin>>s;
  int x=0,y=s.size();
  while(s[x]!='.')
  {
  if(x>y)
    break;
    x++;
  }
 cout<<"Floating part is : ";
  if(x<y)
  {
  for(int i=x+1;i<y;i++)
    cout<<s[i];
  }
return 0;
}