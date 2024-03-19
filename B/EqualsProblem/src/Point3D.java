public class Point3D extends Point {
    private int z;
    public Point3D(int x, int y, int z) {
        super(x,y);
        this.z = z;
    }

    @Override
    public boolean equals(Object other) {
        if (other != null && getClass() == other.getClass()) {
            Point3D o = (Point3D) other;
            return super.equals(o) && z == o.z;
        } else {
            return false;
        }
    }
}