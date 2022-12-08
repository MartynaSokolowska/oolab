package agh.ics.oop;


public class RectangularMap extends AbstractWorldMap implements IPositionObserve {


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

    @Override
    public void positionChanged(Vector2d oldPosition, Vector2d newPosition, IWorldMap map) {
        IMapElement animal=animals.get(oldPosition);
        animals.remove(oldPosition);
        animals.put(newPosition,animal);
    }
}



