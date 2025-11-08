import java.util.*;
class patterns{
    public static void main(String []args){
        Scanner sc=new Scanner(System.in);
        System.out.println("enter weight");
        int weight=sc.nextInt();
        System.out.println("enter height");
        int height=sc.nextInt();
        int bmi=weight/(height*height);
        if(bmi<18.5){
            System.out.println("thinnu nalla");
        }
        else if(bmi>=18.5 && bmi<25){
            System.out.println("maintain pannu");
        
        }
        else if(bmi>=25 && bmi<30){
            System.out.println("gundu agita da eruma");

        }
        else{
            System.out.println("weight kora da panni payale");
        }
        
    }
}
