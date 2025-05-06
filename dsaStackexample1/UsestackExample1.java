package dsaStackexample1;

public class UsestackExample1 {
    public static void main(String[] args) {
        stackExample1 s= new stackExample1(5);
        int x =10;
        for(int i = 1; i<= 5; i++){
            s.push(x);
            System.out.println("pushed "+ x);
            x = x+10;
        }
        for(int i = 1; i<= 5; i++){
            x = s.pop();
            System.out.println("popped "+ x);

        }

    }
}
