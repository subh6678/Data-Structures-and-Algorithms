#Linear Search
#GITHUB :dharmateja03
#given an array and an element if found in array returns index 

#include <iostream>
using namespace std;
 
int search(int arr[], int n, int x)
{
    int i;
    for (i = 0; i < n; i++)
        if (arr[i] == x)
            return i;
    return -1;
}

int main(void)
{
    int arr[] = { 12, 3, 32, 11, 4 };
    int x = 5;
    int n = sizeof(arr) / sizeof(arr[0]);
   
    // Function call
    int result = search(arr, n, x);
    (result == -1)? cout << "Element is not present in array": cout << "Element is present at index " << result;
    return 0;
}
