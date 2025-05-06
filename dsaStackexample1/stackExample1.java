package dsaStackexample1;

public class stackExample1 {
    private int [] arr;
    private int tos , size;
    public stackExample1(int size){
        arr = new int[size];
        tos= -1;
        this.size = size;
    }

   public int  push(int x){
        if(tos==size){
            System.out.println("Stack is over Flow");
            return -1;
        }
        tos++;
        arr[tos] = x;
       return x;
   }
   public int pop(){
        if(tos== -1){
            System.out.println("Stack is empty or under flow ");
            return -1;
        }
       int x ;
       x= arr[tos];
       tos--;
       return x;
   }

   public int peek(){
        if(tos==-1){
            System.out.println("stack is underflow");
            return -1;
        }
        int x ;
        x= arr[tos];
        return x;
   }

}
