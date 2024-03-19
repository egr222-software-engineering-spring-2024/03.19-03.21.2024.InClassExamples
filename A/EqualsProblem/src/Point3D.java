public class Point3D extends Point {
    private int z;
    public Point3D(int x, int y, int z) {
        super(x,y);
        this.z = z;
    }

    @Override
    public boolean equals(Object obj) {
        if (obj != null && getClass() == obj.getClass()) {
            Point3D other = (Point3D) obj;
            return super.equals(obj) && z == other.z;
        } else {
            return false;
        }
    }
}