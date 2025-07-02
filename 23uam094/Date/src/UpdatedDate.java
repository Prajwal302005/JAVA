public class UpdatedDate {
    public static void main(String[] args) {
        CurrentDate myDate = new CurrentDate(3, 5, 2020); 

        System.out.print("currrent date: ");
        myDate.displayDate();

        myDate.setMonth(6);
        myDate.setDay(27);
        myDate.setYear(2025);

        System.out.print("Updated date: ");
        myDate.displayDate();
    }
}