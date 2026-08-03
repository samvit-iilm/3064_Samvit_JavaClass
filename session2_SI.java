import java.util.Scanner;


class Main {
    public static void main(String[] args) {
        
        Scanner sc = new Scanner(System.in);
        
        System.out.println("Enter you principal amount :- ");
        int p = sc.nextInt();
        System.out.println("Enter you rate of intrest :- ");
        int R = sc.nextInt();
        System.out.println("Enter you time to pay in years :- ");
        int T = sc.nextInt();
        System.out.println("your SI is :- " + ((p*R*T)/100));
        System.out.println("your full amount is :- " + (((p*R*T)/100) + p));
        
    }
}
