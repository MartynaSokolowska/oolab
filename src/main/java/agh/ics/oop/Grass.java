package agh.ics.oop;

public class Grass {
    protected final Vector2d position;
    protected Grass(Vector2d vector){
        position=vector;
    }
    public Vector2d getPosition(){
        return position;
    }
    public String toString(){
        return "*";
    }

}
