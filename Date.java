/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package date;

/**
 *
 * @author Leandro
 */
public class Date {
    
    private int month;
    private int day;
    private int year;
    
    public Date(int theMonth, int theDay, int theYear){
        month = checkMonth(theMonth);
        year = theYear;
        day = checkDay(theDay);
        
        System.out.printf("Date object constructor for date %s\n", this);
    }
    private int checkMonth(int testMonth){
        if(testMonth > 0 && testMonth <= 12){
            return testMonth;
        }else{
            System.out.printf("Invalid month (%d) set to 1.", testMonth);
            return 1;
        }
    }
    
    private int checkDay(int testDay){
        int[] daysPerMonth = {0, 31, 28, 31, 30, 31, 30, 31, 31, 30, 31, 30, 31};
        
        if (testDay > 0 && testDay <= daysPerMonth[month]){
            return testDay;
        }
        if(month == 2 && testDay <= daysPerMonth[month])
            return testDay;
        System.out.printf("Invalid day (%d) set to 1.", testDay);
        return 1;
    }
    public String toString(){
        return String.format("%d/%d/%d", month, day, year);
        
    }
}
