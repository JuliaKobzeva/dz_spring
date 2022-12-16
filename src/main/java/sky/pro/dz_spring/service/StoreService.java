package sky.pro.dz_spring.service;

import org.springframework.stereotype.Service;
import org.springframework.web.bind.annotation.RequestBody;
import sky.pro.dz_spring.model.Store;
import sky.pro.dz_spring.record.StoreRequest;

import java.util.HashMap;
import java.util.Map;

@Service
public class StoreService {
    private final Map<Integer, Store> items = new HashMap<>();

    public Store addItem(StoreRequest storeRequest){
        Store store = new Store(storeRequest.getItem());

        this.items.put(store.getId(), store);
        return store;
    }

}
