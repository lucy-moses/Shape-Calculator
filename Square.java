class Square extends Shape {
    private double side;

    public Square(double side) {
        super("Square");
        this.side = side;
    }

    public void calculateShape() {
        double area = side * side;
        System.out.println("Area of Square: " + area);
    }

    public void calculatePerimeter() {
        double perimeter = 4 * side;
        System.out.println("Perimeter of Square: " + perimeter);
    }
}