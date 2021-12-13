package main;

import java.util.Arrays;
import java.util.Collections;
import java.util.Objects;
import java.util.Random;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        int[] arr = new int[5];
        Random r = new Random();
        for (int i = 0; i < arr.length; i++) {
            arr[i] = r.nextInt(200) - 300;
        }
        for (int i = 0; i < arr.length; i++) {
            System.out.println(arr[i]);
        }
        int max = arr[0];
        for (int i = 1; i < arr.length; i++) {
            if (arr[i] > max) {
                max = arr[i];
            }
        }
        System.out.println("Max равен " + max);//Наименее отрицательные число или число самое максимальное положительное
        //Перевернуть массив (способ создания доп. массива
        int[] reverseArr = new int[arr.length];
        for (int i = arr.length - 1; i >= 0 ; i--) {
            reverseArr[i] = arr[arr.length - 1 - i];
        }
        System.out.println(Arrays.toString(reverseArr));
        //Переворачивание в один массив
        for (int i = 0; i < arr.length/2; i++) {
            int temp = arr[i];
            arr[i] = arr[arr.length - 1 - i];
            arr[arr.length - 1 - i] = temp;
            //Collections.swap(arr,i,i+1); //Коллекции пример
        }
    }
}


