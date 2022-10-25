package agh.isc.oop;

public class World {
    public static void main(String [] args){
    System.out.println ("system rozpoczął działanie");
    Animal Reksio = new Animal();
    System.out.println(Reksio);
    String[] tabruchu ={"f","left","f","f","r","r","b"};
    OptionParser tablicaMoveDirection = new OptionParser(tabruchu);
    goReksio(tablicaMoveDirection,Reksio);
    System.out.println(Reksio);
    System.out.println ("System zakończył działanie");
    }
    public static void run(Direction [] args) {
        //System.out.println("zwierzak idzie do przodu");
        for (Direction argument : args) {
            String message = switch (argument) {
                case f -> "zwierzak idzie do przodu";
                case b -> "zwierzak idzie do tyłu";
                case r ->"zwierzak skreca w prawo";
                case l -> "zwierzak skreca w lewo";
            };
            System.out.println(message);
        }
    }
    public static void goReksio(OptionParser tablicakrokow ,Animal zwierzak){
        MoveDirection[] tablicakieronkow =tablicakrokow.parse();
        for (MoveDirection direction : tablicakieronkow) {
            if (direction == MoveDirection.BACKWARD || direction == MoveDirection.LEFT || direction == MoveDirection.FORWARD || direction == MoveDirection.RIGHT)
                zwierzak.move(direction);
        }
    }
}

