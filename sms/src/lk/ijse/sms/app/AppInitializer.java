package lk.ijse.sms.app;

import com.netflix.ribbon.api.*;
import com.netflix.zuul.service.*;
public class AppInitializer  {
    public static void main(String[] args) {
        new RibbonService();
        new ApiGateWay();

    }
}
