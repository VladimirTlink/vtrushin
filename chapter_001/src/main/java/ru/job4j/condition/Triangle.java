package ru.job4j.condition;
/**

public class Triangle {
    private Point a;
    private Point b;
    private Point c;

    public Triangle(Point a, Point b, Point c) {
        this.a = a;
        this.b = b;
        this.c = c;
    }
    public double period(double ab, double ac, double bc) {
        return -1;
    }
    public double area() {
        double rsl = -1;
        double ab = this.a.distanceTo(this.b);
        double ac = this.a.distanceTo(this.c);
        double bc = this.b.distanceTo(this.c);
        double p = this.period(ab, ac, bc);
        if (this.exist(ab, ac, bc)) {
            rsl = (a + b + c) / 2;
            return Math.sqrt(p * (p - a) * (p - b) * (p - c));
            rsl = (((a+b+c)/2)*((a+b+c)/2-a)*((a+b+c)/2-b)*((a+b+c)/2-c));
            return Math.sqrt(rsl);
        }
        return rsl;
    }
}
*/