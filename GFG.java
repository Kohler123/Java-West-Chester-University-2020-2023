
class GFG { 
  

  
    // Function to right rotate arr[] 
    // of size n by d 
    void rightRotate(int arr[], 
                     int d, int n) 
    { 
        for (int i = n; i > d; i--) 
            rightRotatebyOne(arr, n); 
    } 
  
    void rightRotatebyOne(int arr[], int n) 
    { 
        int i, temp; 
        temp = arr[0]; 
        for (i = 0; i < n - 1; i++) 
            arr[i] = arr[i + 1]; 
        arr[i] = temp; 
    } 
  
    // utility function to print an array 
    void printArray(int arr[], int n) 
    { 
        for (int i = 0; i < n; i++) 
            System.out.print(arr[i] + " "); 
    } 
  
    // Driver program to test above functions 
    public static void main(String[] args) 
    { 
        GFG rotate = new GFG(); 
        int arr[] = { 1, 2, 3, 4, 5 }; 
        rotate.rightRotate(arr, 2, arr.length); 
        rotate.printArray(arr, arr.length); 
    } 
} 