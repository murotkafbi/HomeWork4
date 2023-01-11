
public class Main {
    public static void main(String[] args) {
        // Задание 1
        System.out.println("Задание 1");
        for (int i = 0; i < 10; i++) {
            System.out.println("Итерация цикла " + i);
        }
        // Задание 2
        System.out.println("Задание 2 ");
        for (int a = 10; a > 0; a = a - 1) {
            System.out.println("Итерация цикла " + a);
        }
        // Задание 3
        System.out.println("Задание 3");
        for (int B = 17; B > 0; B = B / 2) {
            System.out.println("Чётные числа " + B);
        }
        // Задание 4
        System.out.println("Задание 4");
        for (int C = -10; C < 10; C = C + 1) {
            System.out.println("Большему к меньшему " + C);
        }
        // Задание 5
        System.out.println("Задание 5 ");
        for (int i = 1904; i < 2096; i = i + 4) {
            System.out.println("Високосный год " + i);
        }
        // Задание 6
        System.out.println("Задание 6");
        for (int a= 7;a < 105 ; a=a + 7){
            System.out.println("последовательность чисел "+ a);

        }
        // Задание 7
        System.out.println("Задание 7");
        for ( int b = 1; b < 1024 ; b = b * 2){
            System.out.println( "последовательность чисел " + b );
        }
        // Задание 8
        System.out.println("Задание 8");
        int sell = 0;
        int postpone = 29_000;
        for (int i = 1; i <= 12; i=i + 1) {
            sell +=postpone;
            System.out.println("Месяц " + i +" сумма накоплений  равна " + postpone + " рублей" );
        }
    }
}