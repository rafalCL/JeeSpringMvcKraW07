package pl.coderslab.jeespringmvc.model;

import org.springframework.context.annotation.Scope;
import org.springframework.context.annotation.ScopedProxyMode;
import org.springframework.stereotype.Component;
import org.springframework.web.context.WebApplicationContext;

import java.util.ArrayList;
import java.util.List;

@Component
@Scope(value = WebApplicationContext.SCOPE_SESSION, proxyMode = ScopedProxyMode.TARGET_CLASS)
public class Cart {
    private List<CartItem> cartItems = new ArrayList<>();

    public void addToCart(CartItem item){
        this.cartItems.add(item);
    }

    public List<CartItem> getCartItems() {
        return cartItems;
    }
}