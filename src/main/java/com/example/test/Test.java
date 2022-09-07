package com.example.test;

public class Test {
    public static void main(String[] args) {
        int a[][][] = new int[3][3][3];
        for (int i = 0; i < a.length; i++) {
            for (int j = 0; j < a[i].length; j++) {
                for (int k = 0; k < a[i][j].length; k++) {
                    a[i][j][k] = 100 * i + 10 * j + k;
                }
            }
        }

    }
}
