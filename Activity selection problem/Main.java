#include<bits/stdc++.h>
using namespace std;
struct act{
 int a;
  int b;
};
bool see(act n1,act n2)
{
  return (n1.b<n2.b);
}
int main()
{
  int n;
  cin>>n;
  act x[n];
  map<pair<int,int>,int> m;
  for(int i=0;i<n;i++)
  {
    cin>>x[i].a;
   // m[x[i].a]=i;
  }
  for(int i=0;i<n;i++)
    cin>>x[i].b;
  for(int i=0;i<n;i++)
    m[{x[i].a,x[i].b}]=i;
  sort(x,x+n,see);
  int c=x[0].b;
  cout<<m[{x[0].a,x[0].b}]<<" ";
  for(int j=1;j<n;j++)
  {
      if(x[j].a>=c)
      {
        c=x[j].b;
        cout<<m[{x[j].a,x[j].b}]<<" ";
      }
  }
  return 0;
}