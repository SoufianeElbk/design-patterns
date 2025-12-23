import templates.Template;
import templates.TemplateImpl1;
import templates.TemplateImpl2;

public class Main {
    public static void main(String[] args) {
        Template template = new TemplateImpl1();
        System.out.println(template.perform(1,5));

        Template template1 = new TemplateImpl2();
        System.out.println(template1.perform(1,5));
    }
}
