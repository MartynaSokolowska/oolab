package agh.ics.oop;

import agh.ics.oop.Vector2d;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class Vector2dTest {

    @Test
    void testToString() {
        //given
        Vector2d x = new Vector2d(1,2);
        //when
        String result = x.toString();
        //then
        assertEquals("(1,2)",result);
    }

    @Test
    void precedes() {
        //given
        Vector2d x = new Vector2d(1,2);
        Vector2d otherx = new Vector2d(2,3);
        Vector2d y = new Vector2d(4,2);
        Vector2d othery = new Vector2d(2,3);
        //when
        boolean result = x.precedes(otherx);
        boolean result1=y.precedes(othery);
        //then
        assertTrue(result);
        assertFalse(result1);
    }

    @Test
    void follows() {
        //given
        Vector2d x = new Vector2d(1,2);
        Vector2d otherx = new Vector2d(1,0);
        //when
        boolean result = x.follows(otherx);
        //then
        assertTrue(result);
    }

    @Test
    void upperRight() {
        //given
        Vector2d x = new Vector2d(1,2);
        Vector2d otherx = new Vector2d(1,0);
        //when
        Vector2d result1 = x.upperRight(otherx);
        String result=result1.toString();
        //then
        String dob="(1,2)";
        assertEquals(dob,result);
    }

    @Test
    void lowerLeft() {
        Vector2d x = new Vector2d(1,2);
        Vector2d otherx = new Vector2d(1,0);
        //when
        Vector2d result1 = x.lowerLeft(otherx);
        String result=result1.toString();
        //then
        String dob="(1,0)";
        assertEquals(dob,result);
    }

    @Test
    void add() {
        Vector2d x = new Vector2d(1,2);
        Vector2d otherx = new Vector2d(1,0);
        //when
        Vector2d result1 = x.add(otherx);
        String result=result1.toString();
        //then
        String dob="(2,2)";
        assertEquals(dob,result);
    }

    @Test
    void subtract() {
        Vector2d x = new Vector2d(1,2);
        Vector2d otherx = new Vector2d(1,0);
        //when
        Vector2d result1 = x.subtract(otherx);
        String result=result1.toString();
        //then
        String dob="(0,2)";
        assertEquals(dob,result);
    }

    @Test
    void testEquals() {
        Vector2d x = new Vector2d(1,2);
        Vector2d otherx = new Vector2d(1,2);
        //when
        boolean result1 = x.equals(otherx);
        //then
        assertTrue(result1);
    }

    @Test
    void opposite() {
        Vector2d x = new Vector2d(1,2);
        //when
        Vector2d result1 = x.opposite();
        String result=result1.toString();
        //then
        String dob="(2,1)";
        assertEquals(dob,result);
    }
}