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
class BINARY_GAP {

    /**
     * @param args the command line arguments
     */
    static int Binary_Gap(int N) {

        String num = Integer.toBinaryString(N);
        System.out.println("num " + num);
        int uno = 0;
        int cero = 0;
        int ceros = 0;
        int total = 0;

        for (int i = 0; i < num.length() - 1; i++) {

            if ((num.charAt(i) == '1') && (num.charAt(i + 1) == '0')) {
                uno = i;
            }
            if ((num.charAt(i) == '0') && (num.charAt(i + 1) == '1')) {
                cero = i;
            }
            ceros = cero - uno;
            if (ceros > total) {
                total = ceros;
            }
        }

        System.out.println("TOTAL " + total);

     
        return total;

    }

    public static void main(String[] args) {
        // TODO code application logic here
        Binary_Gap(120);
    }

}
