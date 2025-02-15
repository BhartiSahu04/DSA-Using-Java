 import java.util.*;
 // THIRD SORTING ALGORITHM
// Complexity of Selection sort is O(n square)
 public class InsertionSort
  {
      
      public static void insertion( int arr[]){
            for(int i = 1; i<arr.length;i++)
            {
                  int curr = arr[i];
                  int prev = i-1;

                  // Finding the Correct Position to Insert
                  while(prev >=0 && arr[prev]>curr){
                        arr[prev+1] = arr[prev];
                        prev-- ;
                  }
                  
                  // insertion into the Correct Position
                  arr[prev+1] = curr;

            }

      }

      // Function for Print the array

      public static void printarr(int arr[])
      { 
            for(int j = 0; j<arr.length ; j++)
            {
            System.out.print(arr[j] + " ");
            }
      }

      public static void main(String[] args) 
      {
        int num;    
      
            try (Scanner sc = new Scanner(System.in)) 
            {
                System.out.print("Enter the number of elements you want to store :- ");  
                 num = sc.nextInt();  
                 int[] arr = new int[num];  
                 System.out.print("Enter the elements of the array :- "); 

                 for(int i=0; i<num; i++) 
                 {  
                 //reading array elements from the user 
    
                 arr[i]=sc.nextInt(); 
                 }
                System.out.println("Elements After Applying InsetionSort:-");
                // Function Calling     
                insertion(arr);
                printarr(arr);

            }
            
      }
}
