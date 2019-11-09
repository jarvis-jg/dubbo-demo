import org.springframework.context.support.ClassPathXmlApplicationContext;

import java.io.IOException;

/**
 * dubbo : PACKAGE_NAME
 *
 * @author jarvis
 * @create 2019-11-03 16:54
 */
public class MainApplication {

    public static void main(String[] args) throws IOException {
        ClassPathXmlApplicationContext ioc = new ClassPathXmlApplicationContext("provider.xml");

        ioc.start();

        System.in.read();
    }
}
