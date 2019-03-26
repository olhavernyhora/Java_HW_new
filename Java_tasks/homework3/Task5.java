/*
 * @Task5.java 1.1 2019/03/01
 *
 * This software is the confidential and proprietary information of
 * Olha Vernyhora("Confidential Information").
 * You shall not disclose such Confidential Information.
 */

package homework3;

/**
 * This class builds two triangles.
 *
 * @version 1.1 1 Mar 2019
 * @author Olha Vernyhora
 */
public class Task5 {
    public static void main(String[] args) {
        int cycle = 0;
        while (cycle < 2) {
            int row = 1;
            int spaces = 5;
            int star = 1;

            while (row <= 5) {
                while (spaces >= row){
                    System.out.print(" ");
                    spaces--;
                }
                while (star <= (2*row - 1)) {
                    System.out.print("*");
                    star++;
                }

                row++;
                spaces = 5;
                star = 1;
                System.out.println();
            }
            cycle++;
        }
    }
}
