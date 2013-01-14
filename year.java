/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package pk9;

/**
 *
 * @author Petar
 */
import java.util.Scanner;
public class PK9 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int year = sc.nextInt();
        
        // TODO code application logic here
    }
    
    
    
 public static boolean isLeapYear(int year) {
// Gibt true zurueck, wenn year ein Schaltjahr ist,
// ansonsten false.
   if(true){
       return true;}
   else {return false;}
    }


public static int year(int days) {
// Gibt die aktuelle Jahreszahl zurueck, wenn
// seit dem 1.1.1980 "days" Tage vergangen sind.
        assert days >= 0;
        int year = 1980;
        while (days > 365) {
            if (IsLeapYear(year)) {
                if (days > 366) {
                    days -= 366;
                    year += 1;
                }
            } else {
                days -= 365;
                year += 1;
            }
        }
        return year;
    }
}
   
