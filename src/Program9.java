import java.util.*;

class Program9 {
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter Year: ");
        int year = sc.nextInt();

        if(year % 4 == 0 && year % 100 != 0 ){
            System.out.println("Leap Year");
        } else if (year % 100 == 0 && year % 400 == 0) {
            System.out.println("Leap Year");
        }else {
            System.out.println("Not Leap Year");
        }
    }
}