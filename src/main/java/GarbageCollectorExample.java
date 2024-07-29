import java.util.ArrayList;
import java.util.Date;
import java.util.List;

public class GarbageCollectorExample {

    public static void main(String[] args) {
        Runtime runtime = Runtime.getRuntime();
        System.out.println("before total memory : " + runtime.totalMemory());
        System.out.println("before free memory : " + runtime.freeMemory());

        int i = 0;
        List<Date> dateList = new ArrayList<>();
        while (i < 100000000) {
            Date date = new Date();
            dateList.add(date);
            date = null;
            i++;
        }

        System.out.println("after total memory : " + runtime.totalMemory());
        System.out.println("after free memory : " + runtime.freeMemory());
        // запуск сборщика мусора
        System.gc();
        System.out.println("after total memory gc : " + runtime.totalMemory());
        System.out.println("after free memory gc : " + runtime.freeMemory());
    }

    private static Date method() {
        Date date = new Date();
        Date date2 = date;
        System.out.println(date);
        return date;
    }

    private static void method2() {

    }

}
