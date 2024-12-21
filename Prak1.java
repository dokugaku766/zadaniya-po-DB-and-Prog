import java.util.Scanner;
import java.util.Arrays;
import java.util.Random;

public class Prak1 {
        public static void main(String[] args) {
            //printNum1();
            //sum2();
            //srarfm3();
            //plpryam4();
            //chetnechet5();
            //factorial6();
            //prost7();
            //tablumn8();
            //bin9();
            //max10();
            //nchislo11();
            //palindrome12XXX();
            //korenb13();
            //summcif14();
            //perevcif15();
            //sovchisl16();
            //NOD17();
            //naimiz2_18();
            //izmznak19();
            //cummpervNchl24();
            //celchis26();
        }

 public static void printNum1() {
        System.out.println("\n-+-Вы запустили первое задание-+-\n");

        Scanner scan = new Scanner(System.in);
        System.out.print("Введите число: ");
        int num = scan.nextInt();
        System.out.print("Вы ввели: " + num);
        scan.close();
    }

    public static void sum2() {
        System.out.println("\n-+-Вы запустили второе задание-+-\n");

        Scanner scan = new Scanner(System.in);
        System.out.print("Введите первое число: ");
        int q = scan.nextInt();
        System.out.print("Введите первое число: ");
        int w = scan.nextInt();
        int sum = q + w;
        System.out.print("Сумма ваших чисел равна: " + sum);
        scan.close();
    }

    public static void srarfm3() {
        System.out.println("\n-+-Вы запустили третье задание-+-\n");

        Scanner scan = new Scanner(System.in);
        System.out.print("Введите первое число: ");
        double q = scan.nextDouble();
        System.out.print("Введите первое число: ");
        double w = scan.nextDouble();
        System.out.print("Введите первое число: ");
        double e = scan.nextDouble();
        double average = (q + w + e) / 3;
        System.out.print("Среднее арифметическое: " + average);
        scan.close();
    }

    public static void plpryam4() {
        System.out.print("\n-+-Вы запустили четвертое задание-+-\n");

        Scanner scan = new Scanner(System.in);
        System.out.print("Введите длину: ");
        double d = scan.nextDouble();
        System.out.print("Введите ширину: ");
        double sh = scan.nextDouble();
        double S = d * sh;
        System.out.print("Площадь прямоугольника: " + S);
        scan.close();
    }

    public static void chetnechet5() {
        System.out.print("\n-+-Вы запустили пятое задание-+-\n");

        Scanner scan = new Scanner(System.in);
        System.out.print("Введите число: ");
        int chet = scan.nextInt();
        if (chet % 2 == 0) System.out.print("Число четное");
        else System.out.print("Число не четное");
        scan.close();
    }

    public static void factorial6() {
        System.out.print("\n-+-Вы запустили шестое задание-+-\n");

        System.out.print("Введите число, факториал которого собираетесь найти: ");
        Scanner scan = new Scanner(System.in);
        int fact = scan.nextInt();
        int factorial = 1;
        for (int i = 1; i <= fact; i++) {
            factorial *= i;
        }
        System.out.print("Факториал числа равен: " + factorial);
        scan.close();
    }

    public static void prost7() {
        System.out.print("\n-+-Вы запустили седьмое задание-+-\n");
        Scanner scan = new Scanner(System.in);
        boolean a = true;
        System.out.print("Введите число: ");
        int b = scan.nextInt();
        for (int i = 2; i <= Math.sqrt(b); i++) {
            if (b % i == 0) a = false;
        }

        if ( a == true) System.out.print("Число простое");
        else System.out.print("Число составное");
        scan.close();
    }

    public static void testtablumn8() {
        System.out.print("\n-+-Вы запустили восьмое задание-+-\n");

        Scanner scan = new Scanner(System.in);
        System.out.print("Введите число: ");
        int tabl = scan.nextInt();
        System.out.println("***Таблица умножения на " + tabl + "***");

        for (int i = 0; i < 10; i++) {
            System.out.println(tabl + "x" + (i + 1) + "=" + (tabl * (i + 1)));
        }
        scan.close();
    }

    public static void bin9() {
        System.out.print("\n-+-Вы запустили девятое задание-+-\n");

        Scanner scan = new Scanner(System.in);
        System.out.print("Введите число: ");
        int bn = scan.nextInt();
        if (bn == 0) System.out.println("0");

        int[] bin = new int[32];
        int r = 0;
        while (bn > 0) {
            bin[r++] = bn % 2;
            bn = bn / 2;
        }
        System.out.print("Число в бинарном виде будет выглядеть как: ");
        for (int i = r - 1; i >= 0; i--) {
            System.out.print(bin[i]);
        }
        scan.close();
    }

    public static void max10() {
        System.out.print("\n-+-Вы запустили десятое задание-+-\n");

        Scanner scan = new Scanner(System.in);
        int[] array = new int[3];
        System.out.print("Введите три числа: ");
        for (int i = 0; i < 3; i++) {
            array[i] = scan.nextInt();
        }
        int max = Arrays.stream(array).max().getAsInt();
        System.out.print("Максимальное число: " + max);

        scan.close();
    }

    public static void nchislo11() {
        System.out.print("\n-+-Вы запустили одиннадцатое задание-+-\n");

        Scanner scan = new Scanner(System.in);
        System.out.print("Введите число до которого нужно будет найти сумму чисел начиная от 1: ");
        int N = scan.nextInt();
        int summ = N * (N + 1) / 2;
        System.out.print("Сумма чисел от 1 до " + N + " равна " + summ);

        scan.close();
    }

    public static void palindrome12XXX() {
        System.out.print("\n-+-Вы запустили двенадцатое задание-+-\n");

        Scanner scan = new Scanner(System.in);
        System.out.print("Введите число: ");
        int obrat = 0;
        int palin = scan.nextInt();
        int tpalin = palin;
        while (tpalin != 0) {
            int A = palin % 10;
            obrat = (obrat * 10) + A;
            palin = palin / 10;
        }
        if (obrat == tpalin)
            System.out.print("Число " + tpalin + " является полиндромом, т. к, если его перевернуть, то он будет равен " + obrat);
        else
            System.out.print("Число " + tpalin + " не полиндромное, т.к оно не будет таким же как и прошлое, а будет таким: " + obrat);

        scan.close();
    }

    public static void korenb13() {
        System.out.print("\n-+-Вы запустили тринадцатое задание-+-\n");

        Scanner scan = new Scanner(System.in);
        System.out.print("Введите число: ");
        int a = scan.nextInt();
        double result = Math.sqrt(a);
        System.out.print("Корень из числа " + a + " равен " + result);

        scan.close();
    }

    public static void summcif14() {
        System.out.print("\n-+-Вы запустили четырнадцатое задание-+-\n");

        Scanner scan = new Scanner(System.in);
        System.out.print("Введите число: ");
        int a = scan.nextInt();
        int z = 0;
        while (a != 0) {
            z += a % 10;
            a /= 10;
        }
        System.out.print("Сумма чисел равна: " + z);

        scan.close();
    }

    public static void perevcif15() {
        System.out.print("\n-+-Вы запустили пятнадцатое задание-+-\n");

        Scanner scan = new Scanner(System.in);
        System.out.print("Введите число: ");
        int v = scan.nextInt();
        int z = 0;
        while (v != 0) {
            int A = v % 10;
            z = (z * 10) + A;
            v = v / 10;
        }
        System.out.print("Обратное число равно " + z);

        scan.close();
    }

    public static void sovchisl16() {
        System.out.print("\n-+-Вы запустили шестнадцатое задание-+-\n");

        Scanner scan = new Scanner(System.in);
        System.out.print("Введите число: ");
        int a = scan.nextInt();
        int summa = 0;
        for (int i = 1; i <= a / 2; i++) {
            if (a % i == 0)
                summa = summa + i;
        }
        if (summa == a) System.out.print("Число " + a + " является совершенным");
        else System.out.print("Число " + a + " не является совершенным");

        scan.close();
    }

    public static void NOD17() {
        System.out.print("\n-+-Вы запустили семнадцатое задание-+-\n");

        Scanner scan = new Scanner(System.in);
        System.out.print("Введите первое число: ");
        int a = scan.nextInt();
        System.out.print("Введите второе число: ");
        int v = scan.nextInt();
        while (a != v) {
            if (a > v) a = a - v;
            else a = v - a;
        }
        System.out.print("НОД равен: " + a);

        scan.close();
    }

    public static void naimiz2_18() {
        System.out.print("\n-+-Вы запустили восемнадцатое задание-+-\n");

        Scanner scan = new Scanner(System.in);
        int[] arr = new int[2];
        System.out.print("Введите два числа: ");
        for (int i = 0; i < arr.length; i++) {
            arr[i] = scan.nextInt();
        }
        int min = Arrays.stream(arr).min().getAsInt();
        System.out.print("Минимальное число: " + min);

        scan.close();
    }

    public static void izmznak19() {
        System.out.print("\n-+-Вы запустили девятнадцатое задание-+-\n");

        Scanner scan = new Scanner(System.in);
        System.out.print("Введите число: ");
        int a = scan.nextInt();
        int b = a * (-1);
        System.out.print("Изначальное число: " + a + "\nПолученное число: " + b);

        scan.close();
    }

    public static void cummpervNchl24() {
        
        System.out.print("\n-+-Вы запустили двадцать четвёртое задание-+-\n");
        Scanner scan = new Scanner(System.in);
        System.out.print("\nВведите первый член прогрессии: ");
        int first = scan.nextInt();
        System.out.print("Введите количество членов прогрессии: ");
        int N = scan.nextInt();
        System.out.print("Введите разность прогрессии (т.е шаг): ");
        int d = scan.nextInt();

        int Sn = ((2 * first + d * (N - 1)) / 2) * N;
        System.out.print("\n*Сумма первых " + N + " членов арифметической прогрессии равна: " + Sn);
    }

    public static void celchis26() {
        System.out.print("\n-+-Вы запустили двадцать шестое задание-+-\n");

        Scanner scan = new Scanner(System.in);
        int Chet = 0;
        int Nechet = 0;
        System.out.print("Введите целое число: ");
        int a = scan.nextInt();
        while (a > 0) {
            int SL = a % 10;
            if (SL % 2 == 0) Chet++;
            else Nechet++;
            a = a / 10;
        }
        System.out.print("Количество четных чисел: " + Chet + "\nКоличество нечетных чисел: " + Nechet);
        System.out.println(" ");
        scan.close();
    }
}
