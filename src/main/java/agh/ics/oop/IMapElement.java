package agh.ics.oop;


public class IMapElement {
    Vector2d position;
    MapDirection orient;
    String source;
    Object object;
    public IMapElement(Object object){
        this.object=object;
        if (object.getClass()== Grass.class){
            Grass grass=(Grass) object;
            source="src/main/resources/grass.png";
            this.position=grass.getPosition();
        }
        if (object.getClass()== Animal.class) {
            Animal animal =(Animal) object;
            position = (animal.position);
            this.orient = (animal.orientacion);
            if (orient.equals(MapDirection.NORTH)) {
                source = "src/main/resources/up.png";
            }
            if (orient.equals(MapDirection.EAST)) {
                source = "src/main/resources/right.png";
            }
            if (orient.equals(MapDirection.WEST)) {
                source = "src/main/resources/left.png";
            }
            if (orient.equals(MapDirection.SOUTH)) {
                source = "src/main/resources/down.png";
            }
        }
    }
}
