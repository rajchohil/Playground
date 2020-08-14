#include<bits/stdc++.h>
#include<math.h>
#define int long long int
using namespace std;
int32_t main()
{
  int n;
  cin>>n;
  vector<int> v;
    for(int i=1;i<=sqrt(n);i++)
    {  if(n%i==0)
       {
        cout<<i<<" ";
      if(n/i!=i)
        v.push_back(n/i);
       }
    }
  for(auto it=v.end()-1;it>=v.begin();it--)
    cout<<*it<<" ";
  
return 0;
}