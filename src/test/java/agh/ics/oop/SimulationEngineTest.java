package agh.ics.oop;

import org.junit.jupiter.api.Test;

import java.util.List;

import static org.junit.jupiter.api.Assertions.assertEquals;

class SimulationEngineTest {
    @Test
    void run() {
        //given
        String [] arguments={"f", "b", "r" ,"l" };
        MoveDirection[] directions = new OptionParser().parse(arguments);
        IWorldMap map = new RectangularMap(10, 5);
        Vector2d[] positions = { new Vector2d(2,2), new Vector2d(3,4) };
        IEngine engine = new SimulationEngine(directions, map, positions);
        //when
        engine.run();
        //then
        List<Animal> animals = RectangularMap.animals;
        assertEquals(animals.get(0).position,new Vector2d(2,3));
        assertEquals(animals.get(0).orientacion,MapDirection.EAST);
        assertEquals(animals.get(1).position,new Vector2d(3,3));
        assertEquals(animals.get(1).orientacion,MapDirection.WEST);

    }
}