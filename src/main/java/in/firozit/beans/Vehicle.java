package in.firozit.beans;

import org.springframework.beans.factory.DisposableBean;
import org.springframework.beans.factory.InitializingBean;
import org.springframework.stereotype.Component;

@Component
public class Vehicle implements InitializingBean, DisposableBean {
    public Vehicle(){
        System.out.println("----------------------- Vehicle :: Constructor Executed  -----------------------");
    }

    @Override
    public void destroy() throws Exception {
        System.out.println(" <<<<<<<<<<<<<<<< destroy() method called from Vehicle Class >>>>>>>>>>>>>>>>>");
    }

    @Override
    public void afterPropertiesSet() throws Exception {
        System.out.println(" <<<<<<<<<<<<<<<< afterPropertiesSet() method called from Vehicle Class >>>>>>>>>>>>>>>>>");
    }
}
