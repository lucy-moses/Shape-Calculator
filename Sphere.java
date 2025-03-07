class Sphere extends Shape implements Volume {
    private double radius;

    public Sphere(double radius) {
        super("Sphere");
        this.radius = radius;
    }

    
    public void calculateShape() {
        double surfaceArea = 4 * Math.PI * radius * radius;
        System.out.println("Surface Area of Sphere: " + surfaceArea);
    }

    
    public void calculatePerimeter() {
        System.out.println("Perimeter not applicable for Sphere.");
    }

    
    public void calculateVolume() {
        double volume = (4.0 / 3.0) * Math.PI * Math.pow(radius, 3);
        System.out.println("Volume of Sphere: " + volume);
    }
}