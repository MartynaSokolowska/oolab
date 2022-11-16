package agh.ics.oop;

import java.util.ArrayList;
import java.util.List;

public class RectangularMap extends AbstractWorldMap {


        protected static List<Animal> animals = new ArrayList<>();

        public RectangularMap(int width1, int height1) {

            if (width1 < 0 || height1 < 0) {
                width = 0;
                height = 0;
            } else {
                width = width1;
                height = height1;
            }
            lowerendx=0;
            lowerendy=0;
        }
        @Override
        public boolean canMoveTo(Vector2d position) {
            return super.canMoveTo (position) && (width >= position.x && height >= position.y) && (position.x>=0 && position.y>=0);
        }

}



