package sky.pro.dz_spring.controller;

import org.springframework.web.bind.annotation.RestController;
import sky.pro.dz_spring.service.StoreService;

@RestController
public class StoreController {
    private StoreService storeService;

    public StoreController (StoreService storeService){
        this.storeService = storeService;
    }

}
