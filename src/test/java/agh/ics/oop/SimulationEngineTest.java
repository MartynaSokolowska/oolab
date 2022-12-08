package agh.ics.oop;

import org.junit.jupiter.api.Test;
import java.util.Map;

import static org.junit.jupiter.api.Assertions.assertEquals;

class SimulationEngineTest {
    @Test
    void run() {
        //given
        String [] arguments={"f", "b", "r" ,"l" };
        MoveDirection[] directions = new OptionParser().parse(arguments);
        IWorldMap map = new RectangularMap(10, 5);
        Vector2d[] positions = { new Vector2d(2,2), new Vector2d(3,4) };
        Runnable engine = new SimulationEngine(directions, map, positions);
        //when
        engine.run();
        //then
        Map<Vector2d, IMapElement> animals = RectangularMap.animals;
        assertEquals(animals.get(new Vector2d(2,2)).position,new Vector2d(2,3));
        assertEquals(animals.get(new Vector2d(2,2)).orient,MapDirection.EAST);
        assertEquals(animals.get( new Vector2d(3,4)).position,new Vector2d(3,3));
        assertEquals(animals.get( new Vector2d(3,4)).orient,MapDirection.WEST);

    }
}