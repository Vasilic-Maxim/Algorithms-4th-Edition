package chapter1.section1;

import edu.princeton.cs.algs4.StdOut;

public class Exercise_8 {
    public static void main(String[] args) {
        // Just prints the char value
        StdOut.println('b');

        // To do Math operations Char values are converted to int values.
        // What is the int representation of a char? The answer is char's
        // position in the ASCII table. For instance, 'b' = 98 and 'c' =
        // 99 respectively.
        StdOut.println('b' + 'c');

        // The only difference from the second case is that the int value
        // is casted back to char. By casting it to char you get a symbol
        // from ASCII table at a specified position.
        StdOut.println((char) ('a' + 4));
    }
}
