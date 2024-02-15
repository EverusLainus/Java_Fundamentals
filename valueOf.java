public class valueOf {
    public static void main(String[] args){
        int n =9;
        String val = String.valueOf(n);
        String v = "hi";
        String s = val.concat(v);
        s = s.replace('h', ' ');
        s = s.toUpperCase();
        System.out.println(s);
    }
}