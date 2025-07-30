#include<iostream>
using namespace std;
int main(){
    int size;
    cout<<"Enter the size of the array :";
    cin>>size;
    int item;
    int arr[size];
    for(int i = 0; i<size ; i++){
        cout<<"Enter the Element of Array :";
        cin>>item;
        arr[i]=item;
    }

    cout<<"Array is : ";
     for(int j = 0; j<size ; j++){
        cout<<arr[j];
    }


}
