//public class LeapYear {
//
//    public static boolean isLeapYear(int year) {
//            if ((year % 4 == 0) && (year % 100 == 0) && (year % 400 == 0)) {
//                System.out.println(year + " = IS indeed a leap year!");
//            } else {
//                System.out.println(year + " is NOT a leap year");
//            }
//        return false;
//    }
//    }

public class LeapYear {
    public static boolean isLeapYear(int year){
        if(year < 1 && year > 9999){
            return false;
        } else if((year % 4 == 0 && year % 100 != 0) &&
                (year >= 1 && year <= 9999)||
                year % 400 == 0 && (year >= 1 && year <= 9999)){
            System.out.println(year + " = IS indeed a leap year!");
        } else {
            System.out.println(year + " is NOT a leap year");
        }
        return false;
    }
}