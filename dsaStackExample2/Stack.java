package dsaStackExample2;

public class Stack {

    private int [] arr;
    private int tos , size;
    public Stack(int size){
        arr = new int[size];
        tos= -1;
        this.size = size;
    }

    public int  push(int x){
        if(tos==size-1){
           stackUnderflowException ex = new stackUnderflowException("Stack Overflow");
           throw ex;
        }
        tos++;
        arr[tos] = x;
        return x;
    }
    public int pop(){
        if(tos== -1){
            stackUnderflowException ex = new stackUnderflowException("Stack UnderFlow");
            throw ex;

        }
        int x ;
        x= arr[tos];
        tos--;
        return x;
    }

    public int peek(){
        if(tos==-1){
           stackUnderflowException ex = new stackUnderflowException("Stack UnderFlow");
           throw ex;
        }
        int x ;
        x= arr[tos];
        return x;
    }
}
