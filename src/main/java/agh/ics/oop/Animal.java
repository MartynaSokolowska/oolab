package agh.ics.oop;

public class Animal {
    public MapDirection orientacion = MapDirection.NORTH;
    public Vector2d position;
    final private IWorldMap map;
    Animal(IWorldMap map, Vector2d initialPosition){
        this.map=map;
        position=initialPosition;
    }

    public String toString() {
        return switch (orientacion) {
            case NORTH ->  "^";
            case WEST -> "<";
            case EAST -> ">";
            case SOUTH -> "v";
        };
    }

    public boolean isAt(Vector2d position) {
        return position.equals(this.position);
    }

    public void move(MoveDirection direction) {
        switch (direction) {
            case LEFT -> orientacion = orientacion.previous();
            case RIGHT -> orientacion = orientacion.next();
            case FORWARD -> {
                Vector2d powiekszony = position.add(orientacion.toUnitVector());
                if (this.map.canMoveTo(powiekszony))
                    position = powiekszony;
            }
            case BACKWARD -> {
                Vector2d pomniejszony = position.subtract(orientacion.toUnitVector());
                if (this.map.canMoveTo(pomniejszony)) {
                    position = pomniejszony;
                }
            }
        }
    }

}