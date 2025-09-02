
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

import com.nt.management.Shipment;

public class TestApp {
    public static void main(String[] args) {
        ApplicationContext context = new ClassPathXmlApplicationContext("com/nt/cfgs/ApplicationContext.xml");

        Shipment shipment = (Shipment) context.getBean("shipment");
        System.out.println(shipment);
    }
}
