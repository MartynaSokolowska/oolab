package agh.isc.oop;

public class Vector2d  {
    public final int x;
    public final int y;
    public Vector2d(int x, int y) {
        this.x=x;
        this.y=y;
    }
    public String toString(){
        return "("+x+","+y+")";
    }

    boolean precedes(Vector2d other){
        if (this.x<=other.x && this.y<=other.y){
            return true;
        }
        return false;
    }
    boolean follows(Vector2d other){
        if (this.x>=other.x && this.y>=other.y){
            return true;
        }
        return false;
    }
    Vector2d upperRight(Vector2d other) {
        int wynikx;
        int wyniky;
        wynikx=Math.max(this.x,other.x);
        wyniky=Math.max(this.y,other.y);
        return new Vector2d(wynikx, wyniky);

    }
    Vector2d lowerLeft(Vector2d other){
        int wynikx;
        int wyniky;
        wynikx=Math.min(this.x,other.x);
        wyniky=Math.min(this.y,other.y);
        return new Vector2d(wynikx,wyniky);
    }
    Vector2d add(Vector2d other){
        int wynikx=this.x+other.x;
        int wyniky=this.y+other.y;
        return new Vector2d(wynikx,wyniky);
    }
    Vector2d subtract(Vector2d other){
        int wynikx=this.x-other.x;
        int wyniky=this.y-other.y;
        return new Vector2d(wynikx,wyniky);

    }
    public boolean equals(Object other) {
        if (this == other)
            return true;
        if (!(other instanceof Vector2d))
            return false;
        Vector2d that = (Vector2d) other;

        if (this.x==that.x & this.y==that.y)
            return true;

        return false;
// tutaj przeprowadzane jest faktyczne porównanie
    }
    Vector2d opposite(){
        return new Vector2d(this.y,this.x);
    }
    public static void main(String [] args){
        Vector2d position1 = new Vector2d(1,2);
        System.out.println(position1);
        Vector2d position2 = new Vector2d(-2,1);
        System.out.println(position2);
        System.out.println(position1.add(position2));
    }
}

