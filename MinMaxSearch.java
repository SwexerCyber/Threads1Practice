package com.company;

public class MinMaxSearch implements Runnable {
    private int max;
    private int min;
    private int[] array;
    private Thread thread;

    public MinMaxSearch(int[] array) {
        this.array = array;
        thread = new Thread(this, "Поток");
        thread.start();
    }

    @Override
    public void run() {
        int max = array[0];
        int min = array[0];
        for (int i = 1; i < array.length; i++) {
            if (max < array[i]) {
                max = array[i];
            }

            if (min > array[i]) {
                min = array[i];
            }
        }
//        this.max = max; // 2 способ, но он проще!
//        this.min = min;
        setMax(max);
        setMin(min);
    }

    public int getMax() {
        return max;
    }

    public void setMax(int max) {
        this.max = max;
    }

    public int getMin() {
        return min;
    }

    public void setMin(int min) {
        this.min = min;
    }

    public Thread getThread() {
        return thread;
    }
}