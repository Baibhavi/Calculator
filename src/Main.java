import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int a = sc.nextInt();
        int b = sc.nextInt();
        int c = sc.nextInt();
        if(a>b && a>c){
            System.out.println(a+ " is largest");
            if(b>c){
                System.out.println(b + " is greater than "+ c + " and smaller than "+ a);
                System.out.println(c + " is smallest");
            }
            else{
                System.out.println(c + " is greater than "+ b + " and smaller than "+ a);
                System.out.println(b + " is smallest");
            }
        }
        else if(b>a && b>c){
            System.out.println(b+ " is largest");
            if(a>c){
                System.out.println(a + " is greater than "+ c + " and smaller than "+ b);
                System.out.println(c + " is smallest");
            }
            else{
                System.out.println(c + " is greater than "+ a + " and smaller than "+ b);
                System.out.println(a + " is smallest");
            }
        }
        else if(c>b && c>a){
            System.out.println(c+ " is largest");
            if(b>a){
                System.out.println(b + " is greater than "+ a + " and smaller than "+ c);
                System.out.println(a + " is smallest");
            }
            else{
                System.out.println(a + " is greater than "+ b + " and smaller than "+ c);
                System.out.println(b + " is smallest");
            }
        }
    }
}