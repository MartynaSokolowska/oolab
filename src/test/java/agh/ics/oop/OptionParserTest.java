package agh.ics.oop;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class OptionParserTest {
    @Test
    void parse() {
        //given
        String[] arguments = {"f", "b", "r", "l"};
        String[] arguments2 = {"g"};
        //when
        String result = "";
        MoveDirection[] directions = new MoveDirection[0];
        try {
            directions = new OptionParser().parse(arguments);
            MoveDirection[] directions2 = new OptionParser().parse(arguments2);
        } catch (IllegalArgumentException ex) {
            result = String.valueOf(ex);
        }
        //then
        assertEquals(directions[0], MoveDirection.FORWARD);
        assertEquals(directions[1], MoveDirection.BACKWARD);
        assertEquals(directions[2], MoveDirection.RIGHT);
        assertEquals(directions[3], MoveDirection.LEFT);
        assertEquals(result, "java.lang.IllegalArgumentException: g is not legal move specification");
    }
}