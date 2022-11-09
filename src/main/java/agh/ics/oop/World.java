package agh.ics.oop;


public class World {
    public static void main(String [] args){
    System.out.println ("system rozpoczął działanie");

        String [] arguments={"f", "b", "r" ,"l" ,"f" ,"f", "r", "r" ,"f", "f", "f" ,"f", "f", "f" ,"f", "f"};
        MoveDirection[] directions = new OptionParser(arguments).parse();
        IWorldMap map = new RectangularMap(10, 5);
        Vector2d[] positions = { new Vector2d(2,2), new Vector2d(3,4) };
        IEngine engine = new SimulationEngine(directions, map, positions);
        engine.run();
        System.out.println(map);

        System.out.println ("System zakończył działanie");
    }

}

