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
public class PassingCars {
    
    public static int solution(int[] A){
       int uno = 0;
       int sol = 0;
       
        for (int i = A.length-1; i >= 0; i--) {
            
            if (A[i] == 1)
                uno++;
            
            else if (A[i] == 0)
                sol += uno;
            else
                return -1;
            
        }
        System.out.println("sol " + sol);
        return 1;
    }
    
    public static void main(String[] args) {
        int[] A = new int[]{1,0,0,1,0,1,1};
        solution(A);
    }
    
}
