/*
 * @Task1ForPositiveNumbers.java 1.1 2019/03/01
 *
 * This software is the confidential and proprietary information of
 * Olha Vernyhora("Confidential Information").
 * You shall not disclose such Confidential Information.
 */

package homework3;

/**
 * This class builds two right triangles.
 *
 * @version 1.1 1 Mar 2019
 * @author Olha Vernyhora
 */
public class Task1 {
    public static void main(String[] args) {
        int rows = 10;
        int i = 0;
        int j = 0;
        while (i <= rows) {
            while (j <= i) {
                System.out.print("*");
                j++;
            }
            System.out.println("");
            i++;
            j = 0;
        }

        rows = 9; i = 0;  j =9;
        while (i <= rows) {
            while (j >= i) {
                System.out.print("*");
                j--;
            }
            System.out.println("");
            i++;
            j = 9;
        }

    }
}
