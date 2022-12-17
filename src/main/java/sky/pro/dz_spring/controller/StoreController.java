package sky.pro.dz_spring.controller;

import org.springframework.web.bind.annotation.*;
import sky.pro.dz_spring.service.StoreService;

import java.util.Collection;
import java.util.List;

@RestController
public class StoreController {
    private final StoreService storeService;

    public StoreController (StoreService storeService){
        this.storeService = storeService;
    }

    @GetMapping("/order/add")
    public void add(@RequestParam("id") List<Integer> ids){
        this.storeService.addToBasket(ids);
    }

    @GetMapping("/order/get")
    public List<Integer> get(){
        return this.storeService.getBusket();
    }
}
