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
        daliveryDays(5);
        daliveryDays(25);
        daliveryDays(200);
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


    private static void daliveryDays(int distance) {
        int days = -1;

        if (distance <= 20) {
            days = 1;
            System.out.println("Потребуеться дней: " + days);
        } else if (distance <= 60) {
            days = 2;
            System.out.println("Потребуеться дней: " + days);
        } else if (distance <= 100) {
            days = 3;
            System.out.println("Потребуеться дней: " + days);
        } else if (distance > 100) {
            System.out.println("Доставка не осуществляеться");
        }


    }

}