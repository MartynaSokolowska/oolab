package agh.ics.oop;

import agh.ics.oop.MapDirection;
import org.junit.jupiter.api.Test;

import static agh.ics.oop.MapDirection.*;
import static org.junit.jupiter.api.Assertions.*;

class MapDirectionTest {

    @Test
    void next() {
        //given:

        //when:
        MapDirection result1 = NORTH.next();
        MapDirection result2 = EAST.next();
        MapDirection result3 = SOUTH.next();
        MapDirection result4 = WEST.next();
        //then:
        assertEquals(result1,EAST);
        assertEquals(result2,SOUTH);
        assertEquals(result3,WEST);
        assertEquals(result4,NORTH);
    }
    @Test
    void previous() {
        //given:

        //when:
        MapDirection result1 = NORTH.previous();
        MapDirection result2 = EAST.previous();
        MapDirection result3 = SOUTH.previous();
        MapDirection result4 = WEST.previous();
        //then:
        assertEquals(result1,WEST);
        assertEquals(result2,NORTH);
        assertEquals(result3,EAST);
        assertEquals(result4,SOUTH);
    }
}