import java.util.*;
class patterns{
    public static void main(String []args){
        Scanner sc=new Scanner(System.in);
        System.out.println("enter the symbol");
        String n=sc.nextLine();
        int i=sc.nextInt();
        int j=sc.nextInt();
        switch(n){
            case "+":
                System.out.println("add: "+(i+j));
                break;
            case "-":
                System.out.println("sub: "+(i-j));
                break;
            case "*":
                System.out.println("multiply: "+(i*j));
                break;
            case "/":
                System.out.println("divide: "+(i/j));
                break;
            case "%":
                System.out.println("modulus: "+(i%j));
                break;
            default:
                System.out.println("error");
                break;

            

        }
    }
}