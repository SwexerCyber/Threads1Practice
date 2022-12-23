package com.company;

public class Main {

    public static void main(String[] args) {
        // Сделать работу 2 потоков,
        // в первом потоке будем искать максимум, во втором минимум

        int[] array = new int[]{2,5,8,4,6};
        MinMaxSearch thread1 = new MinMaxSearch(array);
        MinMaxSearch thread2 = new MinMaxSearch(array);
        try {
            thread1.getThread().join();
            thread2.getThread().join();
        }catch (InterruptedException e){
            System.out.println("Поток прерван");
        }
        System.out.println("Максимум - " + thread1.getMax());
        System.out.println("Минимум - " + thread2.getMin());
        // коммит
    }
}