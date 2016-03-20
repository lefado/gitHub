/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package question_2;

import java.util.Arrays;

/**
 *
 * @author mason
 */
public class Odd_Occurrences_In_Array {

    public static int solution(int[] A) {

        int[] B = A;
        int count = 1;
        int no = 0;
        Arrays.sort(B);
        for (int i = 0; i < B.length; i++) {
            System.out.println("i=" + i + "->" + B[i]);
        }

        for (int i = 1; i < B.length; i++) {
            if (B[i] == B[i - 1]) {
                count++;
            }
            System.out.println(B[i - 1] + "=" + B[i]);
            if (B[i - 1] != B[i]) {
                if (count % 2 != 0) {
                    no++;
                }
                count = 1;
            }

        }
        if (count % 2 != 0) {
            no++;
        }


        System.out.println("count " + no);

        return count;
    }

    public static void main(String[] args) {
        int[] A = new int[]{0, 1, 1, 2, 1,0,1,2};
        solution(A);
    }
}
