package agh.ics.oop;

import java.util.ArrayList;
import java.util.List;

import static java.lang.Math.max;
import static java.lang.Math.min;

public class MapBoundary extends AbstractWorldMap {
    protected int lowerendx;
    protected int width;
    protected int lowerendy;
    protected int height;
    protected IWorldMap map;
    List<Animal> animals = new ArrayList<>();

    void positionChanged(Vector2d oldPosition,Vector2d position,IWorldMap map){

        int flag=0;
        if (lowerendx == oldPosition.x) {
            if (position.x > oldPosition.x){
                for (int i = lowerendy; i < height + 1; i++) {
                    if (map.isOccupied(new Vector2d(oldPosition.x, i))) {
                        flag=1;
                    }
                }
                if (flag==0) {
                    lowerendx = position.x;
                }
            }
        }
        if (lowerendy == oldPosition.y) {
            if (position.y > oldPosition.y) {
                for (int i = lowerendx; i < width + 1; i++) {
                    if (map.isOccupied(new Vector2d(i,oldPosition.y))) {
                        flag = 1;
                    }
                }
                if (flag == 0) {
                    lowerendy = position.y;
                }
            }
        }
        if (width == oldPosition.x) {
            if (position.x < oldPosition.x) {
                for (int i = lowerendy; i < height + 1; i++) {
                    if (map.isOccupied(new Vector2d(oldPosition.x,i))){
                        flag = 1;
                    }
                }
                if (flag == 0) {
                    width = position.x;
                }
            }
        }
        if (height == oldPosition.y) {
            if (position.y < oldPosition.y) {
                for (int i = lowerendx; i < width + 1; i++) {
                    if (map.isOccupied(new Vector2d(oldPosition.x,i))) {
                        flag = 1;
                    }
                }
                if (flag == 0) {
                    height = position.y;
                }
            }
        }
        lowerendy=min(position.y,lowerendy);
        lowerendx=min(position.x,lowerendx);
        width=max(position.x,width);
        height=max(position.y,height);

    }
}
