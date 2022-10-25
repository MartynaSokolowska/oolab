package agh.isc.oop;

public class Animal {
    private MapDirection orientacion= MapDirection.NORTH;
    private Vector2d positionNow = new Vector2d(2,2);
    public String toString(){
        return positionNow.toString() + ' ' + orientacion.toString();
    }
    public boolean isAt(Vector2d position){
        return position.equals(positionNow);
    }
    public void move (MoveDirection direction){
        switch (direction) {
            case LEFT -> orientacion = orientacion.previous();
            case RIGHT -> orientacion = orientacion.next();
            case FORWARD -> {
                Vector2d powiekszony = positionNow.add(orientacion.toUnitVector());
                if (powiekszony.precedes(new Vector2d(4, 4)) && powiekszony.follows(new Vector2d(0, 0)))
                    positionNow = powiekszony;
            }
            case BACKWARD -> {
                Vector2d pomniejszony = positionNow.subtract(orientacion.toUnitVector());
                if (pomniejszony.precedes(new Vector2d(4, 4)) && pomniejszony.follows(new Vector2d(0, 0)))
                    positionNow = pomniejszony;
            }
        }
    }

}
