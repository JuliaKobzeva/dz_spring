package sky.pro.dz_spring.controller;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;
import sky.pro.dz_spring.model.Store;
import sky.pro.dz_spring.record.StoreRequest;
import sky.pro.dz_spring.service.StoreService;

import java.util.Collection;

@RestController
public class StoreController {
    private final StoreService storeService;

    public StoreController (StoreService storeService){
        this.storeService = storeService;
    }

    @PostMapping("/order/add")
    public Store createItem(@RequestBody StoreRequest storeRequest){
        return this.storeService.addItem(storeRequest);
    }

    @GetMapping("/order/get")
    public Collection<Store> getAllItems(){
        return this.storeService.getItems();
    }
}
