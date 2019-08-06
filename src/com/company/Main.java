package com.company;
import java.util.Arrays;
import java.util.List;
import java.util.Scanner;

class task1 {
    public  static void main(String[] args) {
        int[] addArray = {1}; //то, что запишем в начале массива
        int offset = addArray.length;
        int a[] = {2, 3, 4, 5, 6, 7, 8, 9, 10}; //Массив, который будем сдвигать
        int b[] = new int[a.length + offset];
        System.out.print("Массив  до   сдвига: ");
        for (int i = 0; i < a.length; i++) {
            System.out.print(a[i] + " ");
            b[i + offset] = a[i];
            a[i] = b[i];
        }
        System.out.println();
        for (int i = 0; i < offset; i++) {
            a[i] = addArray[i];
        }
        System.out.print("Массив после сдвига: ");
        for (int i : a) {
            System.out.print(i + " ");
        }
        System.out.println();
    }
}


class task2 {
    public    static void main(String[] args) {
        int[] a = {1, 1, 1, 2, 1, 3, 3};
        int n = a.length;
        for (int i = 0, m = 0; i != n; i++, n = m) {
            for (int j = m = i + 1; j != n; j++) {
                if (a[j] != a[i]) {
                    if (m != j) a[m] = a[j];
                    m++;
                }
            }
        }
        if (n != a.length) {
            int[] b = new int[n];
            for (int i = 0; i < n; i++) b[i] = a[i];

            a = b;
        }
        for (int x : a) System.out.print(x + " ");
        System.out.println();
    }
}



class task3 {
    public  static void main(String[] args) {
        int[] a = {2, 3, 10, 12};
        int[] b = {1, 5, 8, 9};
        int[] c = new int[a.length + b.length];
//Объединеие двух массивов int C
        for (int i = 0; i < c.length / 2; i++) {
            if (a[i] > b[i]) {
                c[i + i] = b[i];
                c[i + i + 1] = a[i];
            } else {
                c[i + i] = a[i];
                c[i + i + 1] = b[i];

            }


        }

///элемент 1-го массива меньше предыдущего элемента

        for (int i = 0; i < c.length - 1; i++) {
            int t = c[i];
            if (c[i] > c[i + 1]) {
                c[i] = c[i + 1];
                c[i + 1] = t;
            }
        }
        System.out.println(Arrays.toString(c));
    }
}
class task4 {
    public  static void main(String[] args) {
        String[] a = {" новый ", " комп ", " работает ", " лучше "};
        for (int i = 0; i < a.length; i++) {
            System.out.print(a[i]);
        }
        System.out.println();
        int n = a.length;
        //переменная для обменя элементами

        String temp;

        for (int i = 0; i < n / 2; i++) {
            temp = a[n - i - 1];
            a[n - i - 1] = a[i];
            a[i] = temp;
            for (int i1 = 0; i < a.length; i++) {
                System.out.print(a[i]);
            }

            System.out.println();
        }
    }
}


class task5 {
    public static void main(String[] args) {
        int n = 100;

        int[] a = new int[n];
        int j = 0;
        int i;
        for (i = 1; i < n; i++) {
            if (i % 17 == 0 || i % 13 == 0) {
                a[i] = i;
                System.out.println(a[i]);
                //  i++;

            }
      /*  for (i=1; i<n; i++)
        {
            if(i%10==0)
                cout<<end1;
            cout<<a[i]<<'\t';
        }*/
        }
    }
}

class task6{
    public static void main(String[] args) {
        int[] a = new int[]{0, 2, 3, 9};

        int[]  b = new int[] {0, 2, 3, 9, 1, 1, 1, 0, 1, 2, 9};
         int[]  c = new int[] {0, 2, 9, 8, 0, 4, 9};
        int max =0;
        int[] sum=new int[a.length];
        int suma=0;
        int min =0;

        int maxb = 0;
        int sumab=0;
        int minb =0;
        int[] sumb=new int[b.length];

        int maxc = 0;
        int sumac=0;
        int minc =0;
        int[] sumc=new int[b.length];


        for (int i = 0; i < a.length; i++) {
            if (min > a[i]) {

                min =a[i];
            }

            // for (int i = 0; i < a.length; i++) {

            if (max < a[i]) {
                max = a[i];
            }
        }

       // System.out.println(min+""+max);


            for (int i = 0; i < a.length; i++){

                if(a[i]==min){
                    while  (a[i+1]!=max){

                        sum [i]= a[i+1];
                    i++;}}}

                for (int i = 0; i < a.length; i++){
                    suma+=sum[i];}
        System.out.println("сумма чисел в первом массиве "+suma);
      //  System.out.println(a[i++]);}
//----------------

        for (int i = 0; i < b.length; i++) {
            if (minb > b[i]) {

                minb =b[i];
            }

            // for (int i = 0; i < a.length; i++) {

            if (maxb < b[i]) {
                maxb = b[i];
            }
        }

      //  System.out.println(minb+""+maxb);


        for (int i = 0; i < b.length; i++){

            if(b[i]==minb){
                while  (b[i+1]!=maxb){

                    sumb [i]= b[i+1];
                    i++;}}}

        for (int i = 0; i < b.length; i++){
            sumab+=sumb[i];}
        System.out.println("сумма чисел во втором массиве "+sumab);

////--------------
        for (int i = 0; i < c.length; i++) {
            if (minc > c[i]) {

                minc =c[i];
            }

            // for (int i = 0; i < a.length; i++) {

            if (maxc < c[i]) {
                maxc = c[i];
            }
        }

       // System.out.println(minc+""+maxc);


        for (int i = 0; i < c.length; i++){

            if(c[i]==minc){
                while  (c[i+1]!=maxc){

                    sumc [i]= c[i+1];
                    i++;}}}

        for (int i = 0; i < c.length; i++){
            sumac+=sumc[i];}
        System.out.println("сумма чисел в третьем массиве "+sumac);


    }}


    class task7{

            public static void main(String[] args) {
               int result=0; //result = "Прогрессия возрастающая";
                int[] Mas = new int[3];
                for (int i = 0; i < Mas.length; i++) {
                    Mas[i] = (int) (Math.random() * 90 + 10);
                    System.out.print(Mas[i] + " ");
                }

                for (int i = 0; i <Mas.length; i++) {

                    if (i>0&&Mas[i-1] <= Mas[i]) {

                        result=result+1;


                    }}
                  //  else break;
if( result==2){
                System.out.println("Прогрессия возрастающая");}
        }}

class task8 {

    public static void main(String[] args) {
        int[][] nums = new int[][]
                {
                        {1,1,1,1,1},
                        {0,1,1,1,0},
                        {0,0,1,0,0},
                        {0,1,1,1,0},
                        {1,1,1,1,1}
                };
      


        for (int i = 0; i < nums.length; i++){
            for(int j=0; j < nums[i].length; j++){
                System.out.printf("%d", nums[i][j]);


}  System.out.println();
        }
    }}