package example;

import net.csdn.ServiceFramwork;
import net.csdn.bootstrap.Application;

public class Example extends Application {
    public static void main(String[] args) {
        ServiceFramwork.scanService.setLoader(Example.class);
        Application.main(args);
        System.exit(0);
    }
}
