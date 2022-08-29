import java.util.*;
public class condition {
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the Lottery number");
        int num=sc.nextInt();
        switch(num){
            case 1000:
            System.out.println("You won"+num );
            break;
            case 100000:
            System.out.println("You won"+num);
            break;
            default:
            System.out.println("bhag ja bhootni ke");
            break;
        }
        sc.close();
        System.out.println("hello world!");
    }
}
