package templates;

public class TemplateImpl2 extends Template {
    @Override
    protected int param1() {
        return 10;
    }

    @Override
    protected double compute(int a, int b) {
        return (double) ((a * 3 + b + 2) + (a + b * 2)) / (a+b);
    }
}
