package ch4_more_OOP.special_classes.enums;

public enum DayOfWeek {
    SATURDAY("Saturday", "SAT"),
    SUNDAY("Sunday","SUN"),
    MONDAY("Monday","MON"),
    TUESDAY("Tuesday", "TUE"),
    WEDNESDAY("Wednesday", "WED"),
    THURSDAY("Thursday","THUR"),
    FRIDAY("Friday","FRI")
    ;
    private final String abbreviation;
    private final String longName;

    DayOfWeek(String longName, String abbreviation){
        this.abbreviation = abbreviation;
        this.longName = longName;
    }

    public String getAbbreviation() {
        return abbreviation;
    }

    public String getLongName() {
        return longName;
    }

    @Override
    public String toString() {
        return name()+"{" +
                "abbreviation='" + abbreviation + '\'' +
                ", longName='" + longName + '\'' +
                '}';
    }
}
