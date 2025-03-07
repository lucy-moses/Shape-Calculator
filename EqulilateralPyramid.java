class EquilateralPyramid extends Shape implements Volume {
    private double baseEdge;
    private double height;

    public EquilateralPyramid(double baseEdge, double height) {
        super("Equilateral Pyramid (Square Base)");
        this.baseEdge = baseEdge;
        this.height = height;
    }

    public void calculateShape() {
        double baseArea = baseEdge * baseEdge;
        double slantHeight = Math.sqrt(Math.pow(height, 2) + Math.pow(baseEdge / 2, 2));
        double lateralArea = 2 * baseEdge * slantHeight;
        double totalSurfaceArea = baseArea + lateralArea;
        System.out.println("Total Surface Area of Pyramid: " + totalSurfaceArea);
    }

    public void calculatePerimeter() {
        System.out.println("Perimeter not applicable for Pyramid.");
    }

    public void calculateVolume() {
        double volume = (1.0 / 3.0) * baseEdge * baseEdge * height;
        System.out.println("Volume of Pyramid: " + volume);
    }
}
