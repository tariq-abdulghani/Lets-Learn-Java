package ch4_more_OOP.special_classes.enums;

import java.util.Arrays;
import java.util.EnumSet;

public class EnumsDemo {
    public static void main(String[] args) {
        System.out.println("List all Marital Status");
        for (var status: MaritalStatus.values()){
            System.out.printf("name: %s, ordinal: %s%n", status.name(), status.ordinal());
        }
        final String enumString = "married";
        try {
            System.out.printf("Trying to get the enum based on string value `%s`%n", enumString);
            System.out.println(MaritalStatus.valueOf(enumString));
        }catch (IllegalArgumentException e){
            System.out.printf("`%s` doesn't match enum name, it must be one of %s%n", enumString,  Arrays.toString(MaritalStatus.values()));
        }

        System.out.println("List all Days of week");
        for (var day: DayOfWeek.values()){
            System.out.println(day + " ordinal: "+ day.ordinal());
        }
        final String saturdayString = "SATURDAY";
        try {
            System.out.printf("Trying to get the enum based on string value `%s`%n", saturdayString);
            System.out.println(DayOfWeek.valueOf(saturdayString));
        } catch (IllegalArgumentException e) {
            System.out.printf("`%s` doesn't match enum name, it must be one of %s%n", saturdayString,  Arrays.toString(DayOfWeek.values()));
        }

        EnumSet<DayOfWeek> offDays = EnumSet.of(DayOfWeek.SATURDAY, DayOfWeek.FRIDAY);
        System.out.println("Checking is day is Off in Egypt?");
        for (var day: DayOfWeek.values()){
            System.out.println("Is "+ day.name()+" vacation ? "+ (offDays.contains(day)? "Yes": "No"));
        }
    }
}
