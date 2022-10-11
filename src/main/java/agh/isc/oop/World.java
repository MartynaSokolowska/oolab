package agh.isc.oop;

import static agh.isc.oop.Direction.*;

public class World {
    public static void main(String[] args){
    System.out.println ("system rozpoczął działanie");
    // Direction [] tablica = {f, f, f, r, l, r};
    // run(tablica);
    System.out.println ("System zakończył działanie");
    }
    public static void run(Direction [] args) {
        int n=args.length;
        //System.out.println("zwierzak idzie do przodu");
        for (int i=0; i<n; i++) {
            switch (args[i]) {
                case f:
                    System.out.println("zwierzak idzie do przodu");
                    break;
                case b:
                    System.out.println("zwierzak idzie do tyłu");
                    break;
                case r:
                    System.out.println("zwierzak skreca w prawo");
                    break;
                case l:
                    System.out.println("zwierzak skreca w lewo");
                    break;
            }
        }
    }
}

