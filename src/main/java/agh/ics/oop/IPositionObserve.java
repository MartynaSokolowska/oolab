package agh.ics.oop;

public interface IPositionObserve {
    void positionChanged(Vector2d oldPosition, Vector2d newPosition,IWorldMap map);
}
