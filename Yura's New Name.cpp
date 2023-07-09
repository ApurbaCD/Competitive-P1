#include<bits/stdc++.h>
using namespace std;
int ans(){
    string s;
    cin>>s;
    int l=s.size(),val=0,k=0;
    //cout<<l<<endl;
    if((l==1)&&(s[0]=='^')){
        return 1;
    }
    for(int i=0;i<l;i++){
        if(s[i]=='_'){
            k++;
        }
        else{
            if(k>1){
                val+=k-1;
                k=0;
            }
            k=0;
        }
    }
    if(k>1){
                val+=k-1;
                k=0;
            }
    if(s[0]=='_')val++;
    if(s[l-1]=='_')val++;
    return val;
}

int main(){
  //ios::sync_with_stdio(false);cin.tie(0);
    int t;
    cin>>t;
    while(t--){
        int v=ans();
        cout<< v<<"\n";
    }
}