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
public class PermCheck {
    public static int solution(int[] A){
    
        int [] B = new int[A.length];
        
        int value = 0;
        
        for (int i = 0; i < A.length; i++) {
            
            value = A[i];
            
            if (value > A.length || value < 1){
                System.out.println("NO PERMUTATION");
                return 1;
            }
            
            if (B[value-1] == 0)
                B[value-1] = 1;
            
            else if (B[value-1] == 1) {
                System.out.println("NO PERMUTATION");
                return 1;
            }
            
        }
        System.out.println("PERMUTATION");
        return 1;
    }
    
    public static void main(String[] args) {
        int[] A = new int[]{4,1,3,2,4};
        solution(A);
    }
}
