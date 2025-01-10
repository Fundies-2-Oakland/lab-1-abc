class Vector3D {
    private double x;
    private double y;
    private double z;

    Vector3D(double x, double y, double z) {
        this.x = x;
        this.y = y;
        this.z = z;
    }

    public double getX() {
        return x;
    }

    public double getY() {
        return y;
    }

    public double getZ() {
        return z;
    }

    @Override
    public String toString() {
        return String.format("(%.2f, %.2f, %.2f)", x, y, z);
    }

    public double getMagnitude() {
        return Math.sqrt(Math.pow(x, 2) + Math.pow(y, 2) + Math.pow(z, 2));
    }

    public Vector3D normalize() {
        double magnitude = getMagnitude();
        if (magnitude == 0.0) {
            throw new IllegalStateException("Vector normalized with zero magnitude");
        }
        return new Vector3D(x / magnitude, y / magnitude, z / magnitude);
    }

    public void add(Vector3D vector) {
        this.x += vector.getX();
        this.y += vector.getY();
        this.z += vector.getZ();
    }

    public void multiply(double scalar) {
        this.x *= scalar;
        this.y *= scalar;
        this.z *= scalar;
    }
}