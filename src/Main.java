import java.time.LocalDate;

public class Main {
    public static void main(String[] args) {
        checkIsLeapYaer(2011);
        checkIsLeapYaer(2020);
        checkIsLeapYaer(2022);
        System.out.println();
        appProgramm(1, 2020);
        appProgramm(0,2022);
        System.out.println();
        printDaliveryDays(95);
        System.out.println();
    }

    private static void checkIsLeapYaer(int year) {

        /*for (int year = 2011; year <= 2023; year++) {*/

            if (year % 4 == 0 && year % 100 != 0 || year % 400 == 0) {
                System.out.println(year + "- высокосный год");
            } else {
                System.out.println(year + "- не высокосный год");

            }
        /**/}

    private static void appProgramm(int mobileOs, int mobile) {
        String mobailName;
        switch (mobileOs) {
            case 0:
                mobailName = "Android";
                break;
            case 1:
                mobailName = "iOS";
                break;
            default:
                mobailName = "не тзвестный OC";

        }
        int currentYear = LocalDate.now().getYear();
        if (mobile != currentYear) {
            System.out.println("Для OC " + mobailName + " устонивите lite-версию");
        } else {
            System.out.println("для ОС " + mobailName + " устоновите обычную версию");
        }
    }


    private static int daliveryDays(int distance) {
        int days = -1;

        if (distance <= 20) {
            days = 1;
        } else if (distance <= 60) {
            days = 2;
        } else if (distance <= 100) {
            days = 3;
        }
        return days;


    }
    private static void printDaliveryDays(int distance) {
        int days = daliveryDays(distance);

        if (days == -1) {
            System.out.println("Доставка не осуществляеться");
        } else {
            System.out.println("Потребуеться: "+ days + " дней");
        }
    }

}