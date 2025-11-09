import ch4_more_OOP.special_classes.records.Vector2;

public class RecordDemo {
    public static void main(String[] args) {
        Vector2 originPoint = new Vector2(0,0);
        Vector2 direction = new Vector2(1,1);

        System.out.println(originPoint.add(new Vector2(1,0)));

        System.out.println(direction.scale(5));
    }
}
