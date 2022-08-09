package Day2;

class Holiday {
    private String Name;
    private int Day;
    private String Month;

    Holiday(String Name, int Day, String Month) {
        this.Name = Name;
        this.Day = Day;
        this.Month = Month;
    }

    public static boolean inSameMonth(Holiday holiday1,Holiday holiday2) {
        return holiday1.Month.equals(holiday2.Month);
    }

    public static double avgDate(Holiday[] holiday) {
        int total = 0;
        for (int i = 0; i < holiday.length; i++) {
            total += holiday[i].Day;
        }
        return (double) total / holiday.length;
    }

}
public class HolidayOrNot{
    public static void main(String[] args){
        Holiday object1 = new Holiday("Independence Day", 4 ,"July" );
        Holiday object2 = new Holiday("Holi",9,"March");
        System.out.println(Holiday.inSameMonth(object1,object2));
    }
}
