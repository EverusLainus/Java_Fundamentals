package Java_Fundamentals;
/*
 * An year is said to be leap year if
 * divisible by four
 * if divisible by 100 then it also should be divisible by 400
 * 
 * to be a leap year
 * either divisibe by 4 and not divisible by 100
 * or divisible by 4 and divisble by 400(which also implies divisible by 100)
 * 
 * imples:
 * divible by 4 and either not divisible by 100 or divisible by 400
 */
public class leapYear {
    public static void main(String[] args){
        int year = 1201;
        if(year % 4 == 0 && year %100 != 0 || year % 400 ==0){
            System.out.println("It is a Leap Year");
        }
        else{
            System.out.println("It is not a Leap Year");
        }
    } 
}
