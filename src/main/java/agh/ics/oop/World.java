package agh.ics.oop;


public class World {
    public static void main(String [] args) {
        System.out.println("system rozpoczął działanie");
        try {
            String[] arguments = {"f", "b", "r", "l", "f", "f", "r", "r", "f", "f", "f", "f", "f", "f", "f", "f"};
            MoveDirection[] directions = new OptionParser().parse(arguments);
            IWorldMap map = new GrassField(10);
            Vector2d[] positions = {new Vector2d(2, 2), new Vector2d(2, 2)};
            IEngine engine = new SimulationEngine(directions, map, positions);
            engine.run();
            System.out.println(map);
            System.out.println("System zakończył działanie");
        } catch (IllegalArgumentException ex) {
            System.out.println(ex);
        }
    }
}

