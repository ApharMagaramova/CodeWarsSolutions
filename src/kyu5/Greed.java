package kyu5;

/**
 * 5 kyu
 * <a href="https://www.codewars.com/kata/5270d0d18625160ada0000e4">...</a>
 * Details:
 * Greed is a die game played with five six-sided dice. Your mission, should you choose to accept it,
 * is to score a throw according to these rules. You will always be given an array with five six-sided dice values.
 */


public class Greed {
    public static int greedy(int[] dice) {
        int[] counts = new int[7];
        int sum = 0;

        for (int die : dice) {
            counts[die]++;
        }

        for (int i = 1; i < counts.length; i++) {
            System.out.println("i = " + i);

            System.out.println("counts " + counts[i]);
            System.out.println("sum " + sum);

            if (counts[i] > 2) {
                if (i == 1) {
                    sum += 1000;
                } else {
                    sum += i * 100;
                }
                counts[i] -= 3;
            }
            if (counts[i] == 2) {
                switch (i) {
                    case 1 -> sum += 2 * 100;
                    case 5 -> sum += 2 * 50;
                }
            }
            if (counts[i] == 1) {
                switch (i) {
                    case 1 -> sum += 100;
                    case 5 -> sum += 50;
                }
            }

        }

        return sum;
    }
}
