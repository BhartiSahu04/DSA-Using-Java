import java.util.*;
public class CountingSort 
{
      public static void counting(int arr[])
      { 
            int largest = Integer.MIN_VALUE;
            for(int i = 0; i < arr.length; i++)
            {
                  largest = Math.max(largest , arr[i]);
            }
             int count [] = new int[largest+1];
             for(int i = 0; i < arr.length; i++)
             {
                  count[arr[i]]++;
             }
             int j = 0;
             for(int i = 0; i < count.length; i++)
             {
                  while(count[i] > 0){
                        arr[j] = i;
                        j++;
                        count[i]--;
                  }
             }
      }
      public static void printarr(int arr[])
      { 
            for(int i = 0; i < arr.length; i++)
            {
            System.out.print(arr[i] + " ");
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
                 System.out.print("Elements After applying Counting Sort:- ");
                 counting(arr);
                 printarr(arr);
            }
        }
      }
