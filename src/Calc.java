    /*import java.util.Scanner;
    public class Calc {
        public static void main(String[] args) {
            double num1 = getNumber();
            double num2 = getNumber();
            char operation = getOperation();
            double result = calc(num1, num2, operation);
            System.out.println("Результат:" + result);
        }

        public static double getNumber() {
            Scanner sc = new Scanner(System.in);
            System.out.println("Введите число:");
            if(sc.hasNextDouble()) {
                return sc.nextDouble();
            } else {
                System.out.println("Ошибка при вводе. Повторите ввод");
                return getNumber();
            }
        }

        public static char getOperation() {
            Scanner sc = new Scanner(System.in);
            System.out.println("Выберите номер операции:\n1 - прибавить\n2 - отнять\n3 - умножить\n4 - разделить");
            int operationNumber = 0;
            if(sc.hasNextInt()) {
                operationNumber = sc.nextInt();
            } else {
                System.out.println("Вы ввели не число! Повторите ввод!");
                return getOperation();
            }
            switch (operationNumber) {
                case 1:
                    return '+';
                case 2:
                    return '-';
                case 3:
                    return '*';
                case 4:
                    return '/';
                default:
                    System.out.println("Неправильная операция! Повторите ввод!, ЛОХ");
                    return getOperation();
            }
        }
        public static double add(double num1, double num2) {
            return num1+num2;
        }

        public static double sub(double num1, double num2) {
            return num1-num2;
        }

        public static double mul(double num1, double num2) {
            return num1*num2;
        }

        public static double div(double num1, double num2) {
            if(num2 != 0.0) {
                return num1/num2;
            } else {
                System.out.println("На 0 делить нельзя!");
                return Double.NaN;
            }
        }

        public static double calc(double num1, double num2, char operation) {
            switch (operation) {
                case '+':
                    return add(num1, num2);
                case '-':
                    return sub(num1, num2);
                case '*':
                    return mul(num1, num2);
                case '/':
                    return div(num1, num2);
                default:
                    return Double.NaN;
            }
        }
    }*/
    import java.util.Scanner;

    public class Calc{
        static Scanner scanner = new Scanner(System.in);

        public static void main(String[] args) {
            int num1 = getInt();
            int num2 = getInt();
            char operation = getOperation();
            int result = calc(num1,num2,operation);
            System.out.println("Результат операции: "+result);
        }

        public static int getInt(){
            System.out.println("Введите число:");
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

        public static char getOperation(){
            System.out.println("Введите операцию:");
            char operation;
            if(scanner.hasNext()){
                operation = scanner.next().charAt(0);
            } else {
                System.out.println("Вы допустили ошибку при вводе операции. Попробуйте еще раз.");
                scanner.next();//рекурсия
                operation = getOperation();
            }
            return operation;
        }

        public static int calc(int num1, int num2, char operation){
            int result;
            switch (operation){
                case '+':
                    result = num1+num2;
                    break;
                case '-':
                    result = num1-num2;
                    break;
                case '*':
                    result = num1*num2;
                    break;
                case '/':
                    result = num1/num2;
                    break;
                default:
                    System.out.println("Операция не распознана. Повторите ввод.");
                    result = calc(num1, num2, getOperation());//рекурсия
            }
            return result;
        }
    }

