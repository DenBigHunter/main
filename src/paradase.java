import java.util.Scanner;
public class paradase {
    static Scanner scanner = new Scanner(System.in);

    public static void main(String[] args) {
        int den = getInt();
        int sum = getInt1();
        int kvartira = getInt2();
        int benzin = getInt3();
        int proch = getInt4();
        int result = den*sum+kvartira+benzin+proch+30;
        System.out.println("Попробуй доживи: "+result);
    }

    public static int getInt(){
        System.out.println("Количество дней:");
        int num;
        if(scanner.hasNextInt()){
            num = scanner.nextInt();
        } else {
            System.out.println("Вы допустили ошибку при вводе числа. Попробуйте еще раз.");
            scanner.next();//рекурсия
            num = getInt();
        }
        return num;
    }
    public static int getInt1(){
        System.out.println("Введите сумму в день:");
        int num;
        if(scanner.hasNextInt()){
            num = scanner.nextInt();
        } else {
            System.out.println("Вы допустили ошибку при вводе числа. Попробуйте еще раз.");
            scanner.next();//рекурсия
            num = getInt();
        }
        return num;
    }
    public static int getInt2(){
        System.out.println("стоимость квартплаты:");
        int num;
        if(scanner.hasNextInt()){
            num = scanner.nextInt();
        } else {
            System.out.println("Вы допустили ошибку при вводе числа. Попробуйте еще раз.");
            scanner.next();//рекурсия
            num = getInt();
        }
        return num;
    }
    public static int getInt3(){
        System.out.println(" бензина:");
        int num;
        if(scanner.hasNextInt()){
            num = scanner.nextInt();
        } else {
            System.out.println("Вы допустили ошибку при вводе числа. Попробуйте еще раз.");
            scanner.next();//рекурсия
            num = getInt();
        }
        return num;
    }
    public static int getInt4(){
        System.out.println("прочие расходы:");
        int num;
        if(scanner.hasNextInt()){
            num = scanner.nextInt();
        } else {
            System.out.println("Вы допустили ошибку при вводе числа. Попробуйте еще раз.");
            scanner.next();//рекурсия
            num = getInt();
        }
        return num;
    }
}
