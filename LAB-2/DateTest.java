class Date {

    int month;
    int day;
    int year;

    //CONSTRUCTOR.
    public Date(int month, int day, int year) {
        this.month = month;
        this.day = day;
        this.year = year;
    }

    
    int getDay() {
        return day;
    }
    void setDay(int day) {
        this.day = day;
    }

    int getMonth() {
        return month;
    }
    void setMonth(int month) {
        this.month = month;
    }

    int getYear() {
        return year;
    }
    void setYear(int year) {
        this.year = year;
    }

    void displayDate() {
        System.out.println(day+ "/" +month+ "/" +year);
    }
}

public class DateTest {

    public static void main(String[] args) {

        
        Date date = new Date(1, 20, 2026);

        System.out.print("Initial Date: ");
        date.displayDate();

        // date.setMonth(8);
        // date.setDay(11);
        // date.setYear(2007);

        // // Display updated date
        // System.out.print("Updated Date: ");
        // date.displayDate();
    }
}
