#include <iostream>

using namespace std;

int main()
{
    int n;
    cin>>n;
    int arr[n];
    for(int i=0; i<n;i++){
        cin>>arr[i];
    }
    int m;
    cin>>m;
    int ele[m],pos[m];
    for(int i=0; i<m; i++){
        cin>>ele[i];
       // cin>>pos[i];
    }
    for(int i=0; i<m; i++){
        cin>>pos[i];
    }
    
    for(int i=0; i<m; i++){
        pos[i] -= 1;
    }
    
    for(int i=0; i<m; i++){
        arr[pos[i]] = ele[i];
    }
    
    for(int i=0; i<n; i++){
        cout<<arr[i]<<" ";
    }

    return 0;
}

/*
INPUT:
5
0 1 2 3 4
2 
5 6 
2 4 

OUTPUT:
0 5 2 6 4 
*/

