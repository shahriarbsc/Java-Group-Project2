public interface Shape {


        double calculateArea();
        double calculatePerimeter();
    }

    // Circle class
    class Circle implements Shape {
        private double radius;

        public Circle(double radius) {
            this.radius = radius;
        }

        @Override
        public double calculateArea() {
            return Math.PI * radius * radius;
        }

        @Override
        public double calculatePerimeter() {
            return 2 * Math.PI * radius;
        }
    }

    // Square class
    class Square implements Shape {
        private double side;

        public Square(double side) {
            this.side = side;
        }

        @Override
        public double calculateArea() {
            return side * side;
        }

        @Override
        public double calculatePerimeter() {
            return 4 * side;
        }
    }

    // Testing code
    class ShapeTester {
        public static void main(String[] args) {
            // Creating circle and square objects
            Circle circle = new Circle(5);
            Square square = new Square(7);

            // Testing circle calculations
            System.out.println("Circle area: " + circle.calculateArea());
            System.out.println("Circle perimeter: " + circle.calculatePerimeter());

            // Testing square calculations
            System.out.println("Square area: " + square.calculateArea());
            System.out.println("Square perimeter: " + square.calculatePerimeter());
        }
    }


