package in.firozit.beans;

import org.springframework.beans.factory.DisposableBean;
import org.springframework.beans.factory.InitializingBean;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

@Component
public class Motor implements InitializingBean, DisposableBean {
//    @Autowired
//    private Vehicle vehicle;

    public Motor(){
        System.out.println("----------------------- Motor :: Constructor Executed  -----------------------");
    }

    @Override
    public void destroy() throws Exception {
        System.out.println(" <<<<<<<<<<<<<<<< destroy() method called from Motor Class >>>>>>>>>>>>>>>>>");
    }

    @Override
    public void afterPropertiesSet() throws Exception {
//        vehicle.vehicleInfo();
        System.out.println(" <<<<<<<<<<<<<<<< afterPropertiesSet() method called from Motor Class >>>>>>>>>>>>>>>>>");
    }

    public void motorSpecifications(){
        System.out.println(" This Method is for Motor Specifications !..........");
    }
}
