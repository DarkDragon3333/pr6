package ru.mirea.pr6;

public class Main {
    int x = 0;
    public void Sort(){
        int[] arr = {1, 2, 1, 0 ,5};

        for (int i = 0; i < 5; i++) {
            if (i == 4){ System.out.println(arr[i]);}
            else { System.out.print(arr[i] + ", ");}
        }

        System.out.print("");

        for (int i = 1; i < 5; i++){
            if (arr[i - 1] > arr[i]){
                x = arr[i - 1];
                arr[i - 1] = arr[i];
                arr[i] = x;
            }
        }

        for (int i = 0; i < 5; i++) {
            if (i == 4){ System.out.println(arr[i]);}
            else { System.out.print(arr[i] + ", ");}
        }
        System.out.printf("45");
        System.out.println("123");
    }

    public static void main(String[] args) {

    }
}
