class Cylinder extends Shape implements Volume {
    private double radius;
    private double height;

    public Cylinder(double radius, double height) {
        super("Cylinder");
        this.radius = radius;
        this.height = height;
    }

    public void calculateShape() {
        double surfaceArea = 2 * Math.PI * radius * (radius + height);
        System.out.println("Surface Area of Cylinder: " + surfaceArea);
    }

    public void calculatePerimeter() {
        System.out.println("Perimeter not applicable for Cylinder.");
    }

    public void calculateVolume() {
        double volume = Math.PI * radius * radius * height;
        System.out.println("Volume of Cylinder: " + volume);
    }
}