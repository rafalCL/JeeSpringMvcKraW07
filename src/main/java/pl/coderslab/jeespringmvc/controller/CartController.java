package pl.coderslab.jeespringmvc.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;
import pl.coderslab.jeespringmvc.model.Cart;
import pl.coderslab.jeespringmvc.model.CartItem;
import pl.coderslab.jeespringmvc.model.Product;

import javax.servlet.http.HttpSession;
import java.time.LocalDateTime;
import java.util.Random;

@Controller
public class CartController {
    private Cart cart;

    @Autowired
    public CartController(Cart cart) {
        this.cart = cart;
    }

    @GetMapping("/addtocart")
    @ResponseBody
    public String addtocart() {
        Random rand = new Random();
        cart.addToCart(new CartItem(1, new Product("prod" + rand.nextInt(10), rand.nextDouble())));

        return "addtocart";
    }

    @GetMapping("/cart")
    @ResponseBody
    public String cart(){
        String html = "";
        for(CartItem ci : this.cart.getCartItems()){
            html += String.format("<div>%s - %s</div>", ci.getProduct().getName(), ci.getQuantity());
        }

        return html;
    }
}
