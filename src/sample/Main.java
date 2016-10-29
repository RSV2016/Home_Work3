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
        if (a == 1) {
            Task1();
        } else if (a == 2) {
            Task2();
        }else if ( a==3){
            Task3();
        }else if (a==4){
            Task4();
        }else if (a==5){
            Task5();
        }


    }
    public static void Task1() {
        Scanner scar = new Scanner(System.in);

        System.out.println("Введите пожалуйста катет: ");
        int a = scar.nextInt();
        System.out.println("Введите пожалуйста гипотенузу :  ");
        int b = scar.nextInt();
        System.out.print("Ваша площадь равна :  " + treugolnik(a, b));
    }

    static int treugolnik(int a, int b) {
        int c = a * b / 2;
        return c;
    }

    public static void Task2() {
        Scanner scar = new Scanner(System.in);

        System.out.print("Введите пожалуйста размер вашей таблицы умножения.");
        System.out.print("Введите первое число : ");
        int a = scar.nextInt();
        System.out.println("Введите пожалуйста второе число :  ");
        int b = scar.nextInt();
        Mnoj(a, b);
    }


    static void Mnoj(int f, int r) {

        for (int i = 1; i < f+1; i++) {
            System.out.println();
            for (int j = 1; j < r+1; j++) {
                System.out.print(j*i + " ");

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
        int m =  rand.nextInt();
        int n = rand.nextInt();
        final int M = m;
        final int N = n;
        int[][] arr = new int[M][N];

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

