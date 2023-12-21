import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;

public class App {
    public static void main(String[] args) {
        ApplicationContext applicationContext =
                new AnnotationConfigApplicationContext(AppConfig.class);
        HelloWorld bean =
                (HelloWorld) applicationContext.getBean("helloworld");
        System.out.println(bean.getMessage());
        HelloWorld cat =
                (HelloWorld) applicationContext.getBean("helloworld");
        Cat dog = (Cat) applicationContext.getBean("cat");
        Cat snake = (Cat) applicationContext.getBean("cat");
        System.out.println(bean == cat);
        System.out.println(dog == snake);
    }
}