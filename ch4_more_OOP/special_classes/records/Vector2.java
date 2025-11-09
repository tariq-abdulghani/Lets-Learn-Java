package ch4_more_OOP.special_classes.records;

public record Vector2(float x, float y) {

    public Vector2 add(Vector2 o){
        return new Vector2(x+o.x, y+o.y);
    }
    
    public Vector2 scale(float m){
        return new Vector2(m *x, m*y);
    }

    static Vector2 of(float x, float y){
        return new Vector2(x,y);
    }
}
