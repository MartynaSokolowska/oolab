package agh.ics.oop;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class GrassFieldTest {
    @Test
    void canMoveTo() {
        //given
        IWorldMap map = new GrassField(10);
        Animal animal1=new Animal(map,new Vector2d(2,1));
        map.place(animal1);
        //when
        boolean result1= map.canMoveTo(new Vector2d(2,1));
        boolean result2= map.canMoveTo(new Vector2d(1,1));
        //then
        assertFalse(result1);
        assertTrue(result2);
    }

    @Test
    void place() {
        //given
        String result = "";
        IWorldMap map = new GrassField(10);
        Animal animal2;
        Animal animal1;
        boolean result1 = false;
        boolean result2 = false;
        try {
            animal1 = new Animal(map, new Vector2d(2, 1));
            animal2 = new Animal(map, new Vector2d(2, 1));
            //when
            result1 = map.place(animal1);
            result2 = map.place(animal2);
        } catch (IllegalArgumentException ex) {
            result = String.valueOf(ex);
        }
        //then
        assertTrue(result1);
        assertFalse(result2);
        assertEquals("java.lang.IllegalArgumentException: vector (2,1) is already occupied or cannot be used.", result);
    }

    @Test
    void isOccupied() {
        //give
        IWorldMap map = new GrassField(10);
        Animal animal1=new Animal(map,new Vector2d(2,1));
        map.place(animal1);
        //when
        boolean result1=map.isOccupied(new Vector2d(2,1));
        //then
        assertTrue(result1);
    }

    @Test
    void objectAt() {
        //given
        IWorldMap map = new GrassField(10);
        Animal animal1=new Animal(map,new Vector2d(2,1));
        map.place(animal1);
        //when
        Object result = map.objectAt(new Vector2d(2,1));
        Animal result1= (Animal) result;
        //then
        assertEquals(result1.position,new Vector2d(2,1));
    }
}