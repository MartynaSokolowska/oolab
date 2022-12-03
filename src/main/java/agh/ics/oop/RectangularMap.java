package agh.ics.oop;

import java.util.ArrayList;
import java.util.List;

public class RectangularMap extends AbstractWorldMap {


        protected static List<Animal> animals = new ArrayList<>();

        public RectangularMap(int width1, int height1) {

            if (width1 < 0 || height1 < 0) {
                boundaries.width = 0;
                boundaries.height = 0;
            } else {
                boundaries.width = width1;
                boundaries.height = height1;
            }
            boundaries.lowerendx=0;
            boundaries.lowerendy=0;
        }
        @Override
        public boolean canMoveTo(Vector2d position) {
            return super.canMoveTo (position) && (boundaries.width >= position.x && boundaries.height >= position.y) && (position.x>=0 && position.y>=0);
        }

}



