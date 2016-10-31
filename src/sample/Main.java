 package sample;
import java.util.Random;
import java.util.Scanner;

import static java.lang.Math.random;

 public class Main {
    public static void main(String[] args) {
        Scanner scar = new Scanner(System.in);
        System.out.println("Введите какое задание Вы хотите выполнить :  ");
        System.out.println("Введите 1, если вы хотите выполнить задание №1: ");
        System.out.println("Введите 2, если вы хотите выполнить задание №2: ");
        System.out.println("Введите 3, если вы хотите выполнить задание №3: ");
        System.out.println("Введите 4, если вы хотите выполнить задание №4: ");
        System.out.println("Введите 5, если вы хотите выполнить задание №5: ");
        int a = scar.nextInt();
       switch (a){    //Гарна ідея з меню. switch тут підходить краще.Також Меню можна було розмістити в циклі, який би повторювався, поки не буде коректної відповіді.
            case 1:  Task1();
                break;
            case 2:  Task2();
                break;
            case 3:  Task3();
                break;
            case 4:  Task4();
                break;
            case 5:  Task5();
                break;
            default: System.out.println("Щось пышло не так...");;
                break;
        }


    }
    public static void Task1() {
        Scanner scar = new Scanner(System.in);

        System.out.println("Введите пожалуйста катет: ");
        int a = scar.nextInt();
        System.out.println("Введите пожалуйста гипотенузу :  ");// Площа обраховується за двума катетами, формула вірна.
        int b = scar.nextInt();
        System.out.print("Ваша площадь равна :  " + treugolnik(a, b));
    }

    static double treugolnik(int a, int b) {     //Площа може бути не цылим числом
        return a * b / 2;//Так краще, ми не створюємо зайву змінну.
    }

    public static void Task2() {
        Scanner scar = new Scanner(System.in);

        System.out.println("Введите пожалуйста размер вашей таблицы умножения.");
        System.out.print("Введите первое число : ");
        int a = scar.nextInt();
        System.out.print("Введите пожалуйста второе число :  ");
        int b = scar.nextInt();
        System.out.println();
        Mnoj(a, b);
    }


    static void Mnoj(int f, int r) {

        for (int i = 1; i < f+1; i++) {
            System.out.println();
            for (int j = 1; j < r+1; j++) {
                System.out.print(j*i + "\t");

            }
        }
    }
    static void Task3(){

        massive1(9);

    }
    static void massive1(int a){
        int[] k = new int[a];

       for ( int i= 1; i<k.length;i++){
           Random rand = new Random();
           int l = rand.nextInt(a);
           k[i]= l;
           System.out.println(k[i]+" ");
       }
    }
    static void  Task4(){
        Random rand= new Random();
         int lk = rand.nextInt(9);
            final int L = lk;
            int arr[] = new int[L];

            for (int i = 0; i < arr.length; i++) {
                arr[i] = (int) (Math.random() * 10);
            }

            System.out.println("Минимальное число в массиве: " + min(arr));
        }


     static int min(int[] arr) {
         int min = arr[0];

         for (int i = 0; i < arr.length; i++) {
             if (arr[i] < min) min = arr[i];
             System.out.print(arr[i] + " ");
         }
         System.out.println();

         return min;
     }

   static void  Task5(){
        Random rand = new  Random();
        int m =  Math.abs(rand.nextInt())%10;
        int n = Math.abs(rand.nextInt())%10;
        int[][] arr = new int[m][n];

        for (int i = 0; i < arr.length; i++) {
            for (int j = 0; j < arr[i].length; j++) {
                arr[i][j] = (int) (Math.random() * 5);
                System.out.print(arr[i][j] + " ");
            }
            System.out.println();
        }
        int[] countArr = func(arr);
        for (int i = 0; i < countArr.length; i++) {
            System.out.println("Результат добавления елементов" + (i + 1) + " рядка: " + countArr[i] + " ");
        }
    }

     static int[] func(int[][] arr) {
         int[] countArr = new int[arr.length];
         for (int i = 0; i < arr.length; i++) {
             for (int j = 0; j < arr[i].length; j++) {
                 countArr[i] += arr[i][j];
             }
         }

         return countArr;
     }

    }

}

