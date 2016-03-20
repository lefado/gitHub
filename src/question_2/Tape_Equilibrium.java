/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package question_2;

import static question_2.Odd_Occurrences_In_Array.solution;

/**
 *
 * @author mason
 */
public class Tape_Equilibrium {

    static int solution(int[] A)
    {
        int N=A.length;
        long[] pre = new long[N-1];
        long[] post = new long[N-1];
        
        long sum = 0;
        for (int i = 0; i < A.length-1; i++) {
            sum += A[i];
            pre[i] = sum;
        }
        
        sum=0;
        for (int i = A.length-1; i > 0.; i--) {
            sum += A[i];
            post[i-1] = sum;
        }
        
        for (int i = 0; i < pre.length; i++) {
            System.out.println("i "+i+" pre " +pre[i]+ "post "+post[i]);
        }
        
        
        return 1;
    }
    
    public static void main(String[] args) {
        int[] A = new int[]{3,1,2,4,3};
        solution(A);
    }

}
