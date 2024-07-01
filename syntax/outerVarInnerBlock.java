package Java_Fundamentals.syntax;

public class outerVarInnerBlock {
    /**
     * variable of outter block can be used in inner block
     * variable of inner block cannot be used in outer block
     * @param args
     */
    public static void main(String[] args){
        int a =1;
        {
            int b = 2;
            System.out.println("a: "+ a+ "b: "+ b);
        }
        //System.out.println("a: "+ a+ "b: "+ b);
    }
    
}
