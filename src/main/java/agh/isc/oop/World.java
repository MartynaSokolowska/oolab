package agh.isc.oop;

import static agh.isc.oop.Direction.*;

public class World {
    public static void main(String[] args){
    System.out.println ("system rozpoczął działanie");
    Direction [] tablica = {f, f, f, r, l, r};
    run(tablica);
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
}

