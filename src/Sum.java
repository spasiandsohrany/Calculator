import java.util.Scanner;

public class Sum {
    public static void main(String[] args) {
        for (int i=0; i<3; i++){
            System.out.println("chek");
        }
        for (int z=0; z<3; ){
            z++;
            System.out.println("lul");

        }
    }


    public static void sum() {
        int a,b,c;
        Scanner s=new Scanner(System.in);
        System.out.println("Введите первое число");
        a=s.nextInt();
        System.out.println("Введите второе число");
        b=s.nextInt();
        c = a + b;
        System.out.println("Сумма="+c);
    }
}
