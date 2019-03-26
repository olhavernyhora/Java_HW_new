/*
 * @Task4.java 1.1 2019/03/01
 *
 * This software is the confidential and proprietary information of
 * Olha Vernyhora("Confidential Information").
 * You shall not disclose such Confidential Information.
 */

package homework3;

/**
 * This class builds two right triangles facing left.
 *
 * @version 1.1 1 Mar 2019
 * @author Olha Vernyhora
 */
public class Task4 {
    public static void main(String[] args) {
        int rows = 1;
        int i = 10;
        int j = 1;
        while (i > rows) {
            while (j <= 10) {
                if (j >= i) {
                    System.out.print("*");
                } else {
                    System.out.print(" ");
                }
                j++;
            }
            System.out.println("");
            i--;
            j = 1;
        }

        rows = 10; i = 0; j = 0;
        while (i < rows) {
            while (j < rows){
                if (j >= i) {
                    System.out.print("*");
                } else {
                    System.out.print(" ");
                }
                j++;
            }
            System.out.println("");
            i++;
            j = 0;
        }
    }
}
