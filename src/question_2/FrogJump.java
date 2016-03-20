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
public class FrogJump {
    
    public static int solution(int X, int Y, int D){
        
        
        double s= 0;
 
        s = Math.ceil(((double)Y-(double)X)/(double)D);
        
        
        System.out.println("aa"+s);
        return (int)s;
    }
    
    public static void main(String[] args) {
        solution(10, 85, 30);
    }
}
