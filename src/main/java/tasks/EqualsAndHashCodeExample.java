package tasks;

import lombok.EqualsAndHashCode;

@EqualsAndHashCode
public class EqualsAndHashCodeExample {
    private String name = "Peter";
    private int age;
    @EqualsAndHashCode.Exclude
    private int id = 2103;
    @EqualsAndHashCode.Exclude
    private Shape shape;

    public EqualsAndHashCodeExample(double w, double h, int age) {
        this.age = age;
        shape = new Square(w, h);
    }

    public String getName() {
        return name;
    }

    public class Shape {
        private double area = 0;

        public double calcArea() {
            return area;
        }
    }

    @EqualsAndHashCode(callSuper = true)
    public class Square extends Shape {
        private final double w, h;

        public Square(double w, double h) {
            this.w = w;
            this.h = h;
        }
    }
}
