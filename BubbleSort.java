import java.util.Scanner;

public class BubbleSort 
{
      // ** Complexity of this Algorithm is O(n square) which is not  good
      public static void bubble( int arr[])
      {
       for(int turn = 0; turn <arr.length-1; turn++)
           {
          
              for(int i = 0; i<arr.length-1-turn; i++)
                  {
                    // check the element of array if i >i+1 then swap the both elements
                        if(arr[i]>arr[i+1]){
                             int temp;
                              //  temp variable for swap the element
                              temp = arr[i];
                              arr[i] = arr[i+1];
                              arr[i+1] = temp;
                        }
                  }
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
              int n;    
      
            try (Scanner sc = new Scanner(System.in)) {
                System.out.print("Enter the number of elements you want to store :- ");  
                 //reading the number of elements from the that we want to enter 
    
                 n = sc.nextInt();  
                 int[] arr= new int[n];  
                 System.out.print("Enter the elements of the array :- ");  
                 for(int i=0; i<n; i++) 
                {  
                 //reading array elements from the user 
    
                arr[i]=sc.nextInt(); 
                }
              
             bubble(arr);         //bubble Function calling
             System.out.print("Elements After  Apply Bubble Sorting :-");  
             printarr(arr);
      }       
               
      }

}
      

