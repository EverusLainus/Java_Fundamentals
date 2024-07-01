package Java_Fundamentals;
/**
 * Immutable nature of string in JAVA
 */
public class stringInMemory {
    public static void main(String[] args){
        //create string str1 with value Hello
    String str1 = "Hello";
    //get memory address of str1
    int hashCode = System.identityHashCode(str1);
    System.out.println();
    System.out.println("Create a variable str1 with value Hello, memory address of str1: "+hashCode);

        //create string str2 with value Hello
    String str2 = "Hello";
    //get memory address of str2
    int hashCode0 = System.identityHashCode(str2);
    System.out.println();
    System.out.println("Create a variable str2 with same value Hello, memory address of str2: "+hashCode0); 

    //modifying value of str2
    str2 = "hello hi";
    //get memory address of str2
    int hashCode1 = System.identityHashCode(str2);
    System.out.println();
    System.out.println("After modifying value of str2, Memory Address of str2: "+hashCode1);
    System.out.println();
    }
}
