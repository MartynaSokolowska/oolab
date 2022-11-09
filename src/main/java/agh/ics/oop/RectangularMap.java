package agh.ics.oop;

import java.util.ArrayList;
import java.util.List;

public class RectangularMap implements IWorldMap {

        final private int height;
        final private int width;
        public static List<Animal> animals = new ArrayList<>();

        public RectangularMap(int width1, int height1) {

            if (width1 < 0 || height1 < 0) {
                width = 0;
                height = 0;
            } else {
                width = width1;
                height = height1;
            }
        }

        @Override
        public boolean canMoveTo(Vector2d position) {
            if (this.isOccupied(position))
                return false;
            return (width > position.x && height > position.y) && (position.x>=0 && position.y>=0);
        }


        @Override
        public boolean place(Animal animal) {
            if (canMoveTo(animal.position)) {
                animals.add(animal);
                return true;
            }
            return false;
        }

        @Override
        public boolean isOccupied(Vector2d position) {
            for (Animal animal: animals) {
                if (animal.position.equals(position))
                    return true;
            }
            return false;
        }
        @Override
        public Object objectAt(Vector2d position){
            for (Animal animal: animals) {
                if (animal.position.equals(position))
                    return animal;
            }
            return null;
        }

        public String toString() {
            return new MapVisualiser(this).draw(new Vector2d(0, 0), new Vector2d(width-1, height-1));
        }
}



