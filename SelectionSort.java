import java.util.Scanner;
//SECOND SORTING ALGORITHM
// Complexity of Selection sort is O(n square)
public class SelectionSort 
{
  public static void selection(int arr[])
  {
    for(int turns = 0; turns <arr.length-1; turns++)
    {
      int minIndex = turns;
      for(int j = turns+1; j <arr.length; j++)
      {
        if(arr[minIndex] > arr[j]) // For  Accending order
        // if(arr[minIndex] < arr[j])  For  decending order
        {
          minIndex = j;

        }
      }
      int temp;
      temp = arr[minIndex];
      arr[minIndex] = arr[turns];
      arr[turns] = temp;

    }
  }
  public static void printarr(int arr[])
      { 
            for(int i = 0; i<arr.length ; i++)
            {
            System.out.print(arr[i] + " ");
            }
      }

      //  Main Function
        public static void main(String[] args) 
      {
        int num;    
      
            try (Scanner sc = new Scanner(System.in)) 
            {
                System.out.print("Enter the number of elements you want to store :- ");  
                 //reading the number of elements from the that we want to enter 
    
                 num = sc.nextInt();  
                 int[] arr= new int[num];  
                 System.out.print("Enter the elements of the array :- ");  
                 for(int i=0; i<num; i++) 
                {  
                 //reading array elements from the user 
    
                arr[i]=sc.nextInt(); 
                }
            System.out.print("Elements After applying Selection Sort:-");
            //Function Calling
            selection(arr); 
            printarr(arr);
         }
        }

      }
