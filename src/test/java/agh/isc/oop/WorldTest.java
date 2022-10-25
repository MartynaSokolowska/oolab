package agh.isc.oop;

import org.junit.jupiter.api.Test;

import static agh.isc.oop.World.goReksio;
import static org.junit.jupiter.api.Assertions.*;

class WorldTest {

    @Test
    void testgoReksio() {
        //given
        Animal Azor=new Animal();
        String[] tab ={"f","l","f","k","f","r","r","b","b"};
        OptionParser tablica= new OptionParser(tab);
        //when
        goReksio(tablica,Azor);
        //then
        assertEquals("(0,3) Wschód",Azor.toString());
    }
}