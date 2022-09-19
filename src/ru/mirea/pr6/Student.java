package ru.mirea.pr6;

public class Student {
    int x = 0;

    public void Sort() {
        int[] arr = {1, 2, 1, 0, 5};

        for (int i = 0; i < 5; i++) {
            if (i == 4) {
                System.out.println(arr[i]);
            } else {
                System.out.print(arr[i] + ", ");
            }
        }

        System.out.print("");

        for (int left = 0; left < arr.length; left++) {
            // Вытаскиваем значение элемента
            int value = arr[left];
            // Перемещаемся по элементам, которые перед вытащенным элементом
            int i = left - 1;
            for (; i >= 0; i--) {
                // Если вытащили значение меньшее — передвигаем больший элемент дальше
                if (value < arr[i]) {
                    arr[i + 1] = arr[i];
                } else {
                    // Если вытащенный элемент больше — останавливаемся
                    break;
                }
            }
            // В освободившееся место вставляем вытащенное значение
            arr[i + 1] = value;
        }

        for (int i = 0; i < 5; i++) {
            if (i == 4) {
                System.out.println(arr[i]);
            } else {
                System.out.print(arr[i] + ", ");
            }
        }

    }
}