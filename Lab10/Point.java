public class Point {

    protected int xc, yc;

    public Point(int x, int y) {
        xc = x;
        yc = y;
    }

    public int getX() {
        return xc;
    }

    public int getY() {
        return yc;
    }

    @Override
    public String toString() {
        return "(" + this.xc + "," + this.yc + ")";
    }

}
