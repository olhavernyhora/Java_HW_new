/*
 * @Task2.java 1.1 2019/03/01
 *
 * This software is the confidential and proprietary information of
 * Olha Vernyhora("Confidential Information").
 * You shall not disclose such Confidential Information.
 */

package homework3;

/**
 * This class builds right triangle (with 90 degrees corner in top right side).
 *
 * @version 1.1 1 Mar 2019
 * @author Olha Vernyhora
 */
public class Task2 {
    public static void main(String[] args) {
        int rows = 10;
        int i = 0;
        int j = 0;
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
