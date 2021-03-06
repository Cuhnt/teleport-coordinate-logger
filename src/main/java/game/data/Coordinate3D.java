package game.data;

public class Coordinate3D extends Coordinate2D {
    private int y;

    public Coordinate3D(double x, double y, double z) {
        this((int) x, (int) y, (int) z);
    }

    public Coordinate3D(int x, int y, int z) {
        super(x, z);
        this.y = y;
    }

    public int getY() {
        return y;
    }

    @Override
    public String toString() {
        return "(" + x + ", " + y + ", " + z + ")";
    }

    public void setX(int i) {
        this.x = i;
    }
    public void setY(int i) {
        this.y = i;
    }
    public void setZ(int i) {
        this.z = i;
    }
}
