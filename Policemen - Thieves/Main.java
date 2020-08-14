#include<bits/stdc++.h>
using namespace std;
int main(){
    int n,i,j,k;
    cin>>n;
    string arr[n+1];
    vector<int>thieves,policeman;
    for(i=1;i<=n;i++){
        cin>>arr[i];
        if(arr[i]=="P")
            policeman.push_back(i);
        else
            thieves.push_back(i);
    }
    cin>>k;
    int l=thieves.size();
    i=0;
    int ans=0;
    for(int y:policeman){
        if(thieves[i]>y){
            if(thieves[i]-y > k)
                continue;
            else{
                ans++;
                i++;
            }
        }
        else{
            while(i<l && thieves[i]<y && y-thieves[i] > k)
                i++;
            if(i == l)
                break;
            if(y>thieves[i]){
                ans++;
                i++;
            }
            else{
                if(thieves[i]-y<=k){
                    ans++;
                    i++;
                }
            }
        }
        if(i==l)
        break;
    }
    cout<<"Maximum thieves caught: "<<ans;
}