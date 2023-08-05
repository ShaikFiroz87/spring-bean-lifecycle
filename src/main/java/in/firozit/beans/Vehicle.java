package in.firozit.beans;

import org.springframework.beans.factory.DisposableBean;
import org.springframework.beans.factory.InitializingBean;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

@Component
public class Vehicle implements InitializingBean, DisposableBean {

    @Autowired
    private Motor motor;
    public Vehicle(){
        System.out.println("----------------------- Vehicle :: Constructor Executed  -----------------------");
    }

    @Override
    public void destroy() throws Exception {
        System.out.println(" <<<<<<<<<<<<<<<< destroy() method called from Vehicle Class >>>>>>>>>>>>>>>>>");
    }

    @Override
    public void afterPropertiesSet() throws Exception {
        motor.motorSpecifications();
        System.out.println(" <<<<<<<<<<<<<<<< afterPropertiesSet() method called from Vehicle Class >>>>>>>>>>>>>>>>>");
    }

//    public void vehicleInfo(){
//        System.out.println("This is for Vehicle Info .................................................................");
//    }
}
