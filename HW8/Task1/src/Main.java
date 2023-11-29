import java.util.Random;

public class Main {
    public static void main(String[] args) {
        //#1 Создать массив из 10 целых чисел. Значения могут быть любыми
        //todo
        int[] array1 = new int[10];
        for (int i = 0; i < array1.length; i++) {
            array1[i] = new Random().nextInt(10, 20);
        }

        //#2 Распечатать все значения массива начиная с 0 до последнего индексов.
        //todo
        for (int i = 0; i < array1.length; i++) {
            System.out.println(array1[i]);
        }

        //#3 Распечатать все значения массива с конца (начиная с последнего до 0 индексов).
        //todo
        System.out.println("********");
        for (int i = array1.length-1; i >= 0; i--) {
            System.out.print(" "+array1[i]);
        }

        //#4 *** Задание особой сложности. Развернуть массив(см конец урока).
        //todo
        System.out.println("********");
        int temp = 0;
        for (int i = 0; i < array1.length; i++){
            temp = array1[i];
            array1[i]= array1[array1.length-(i+1)];
            array1[array1.length-(i+1)]= temp;
        }
        for (int i = 0; i < array1.length;i++){
        System.out.print(" "+array1[i]);}
    }
}
