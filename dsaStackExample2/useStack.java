package dsaStackExample2;

public class useStack {
    public static void main(String[] args) {
        Stack s = new Stack(5);
        int x = 10;
        try{
            for(int i =1; i<= 6; i++){
                s.push(x);
                System.out.println("pushed"+x);
                x = x+10;
            }
        }
        catch (stackOverFlowException ex){
            System.out.println(ex.getMessage());

        }
        System.out.println("Top element of the Stack is :"+s.peek());
        try{
            for(int i=1;i<=6;i++){
               x= s.pop();
                System.out.println("Popped: "+x);
            }
        }
        catch(stackUnderflowException ex ){
            System.out.println(ex.getMessage());
        }
    }
}
