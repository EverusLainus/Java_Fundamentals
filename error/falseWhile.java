package Java_Fundamentals.error;

public class falseWhile {
    public static void main(String[] args){
        //body of code is unreachable
        //error: unreachable statement
        while(false){
            System.out.println("hi");
        }
    }
}
