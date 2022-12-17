package sky.pro.dz_spring.service;

import org.springframework.context.annotation.Scope;
import org.springframework.stereotype.Service;
import sky.pro.dz_spring.repository.Basket;

import java.util.Collection;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

@Service
public class StoreService {
    private final Basket basket;

    public StoreService (Basket basket){
        this.basket = basket;
    }

    public void addToBasket(List<Integer> ids){
        this.basket.addToBasket(ids);
    }

    public List<Integer> getBusket(){
        return this.basket.getBusket();
    }
}
