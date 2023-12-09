package fib;

import java.util.HashMap;

public class Main {
    public static void main(String[] args) {
        long startTime = System.nanoTime();

        HashMap<Integer, Integer> memo = new HashMap<>();
        System.out.println(fiboMemoization(8, memo));
//        System.out.println(fibo(19));

        long endTime = System.nanoTime();

        long executionTime = endTime - startTime;
        System.out.println("Execution time: " + executionTime + " nanoseconds");
    }

    public static int fibo(int n) {
        if (n == 1 || n == 2) return 1;
        return fibo(n - 1) + fibo(n - 2);
    }

    public static int fiboMemoization(int n, HashMap<Integer, Integer> memo) {
        if (memo.get(n) != null) {
            return memo.get(n);
        }
        if (n == 1 || n == 2) return 1;
        int result = fiboMemoization(n - 1, memo) + fiboMemoization(n - 2, memo);
        memo.put(n, result);
        return result;
    }
}