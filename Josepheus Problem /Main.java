#include<bits/stdc++.h>
using namespace std;
vector<int> v;
int jo(int n,int k)
{
   for(int i=0;i<n;i++)
     v.push_back(i);
  if(v.size()==1)
    return 1;
  int it=k-1;
  while(v.size()>1)
  {
     v.erase(v.begin()+it);
    it=(it+k-1)%v.size();
  }
return v[0]+1;

}
int main()
{
int n,k;
  cin>>n>>k;
  int x=jo(n,k);
cout<<x;
return 0;
}