/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package question_2;

/**
 *
 * @author mason
 */
public class frogRiverOne {
    
    static int frogRiverOne(int X, int[] A) {
        
        int sol = -1;
        
        for (int i = 0; i < A.length; i++) {
            if (A[i]==X){
                sol=i;
                System.out.println("sol " + sol);
                return sol;
            }
        }
        
        return sol;
    }
    
    
    public static void main(String[] args) {
        int[] A = new int[]{1,3,1,4,2,3,5,4};
        frogRiverOne(5,A);
    }
    
}
