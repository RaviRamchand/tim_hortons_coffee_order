package ca.sheridan.ramchrav.controllers;

import ca.sheridan.ramchrav.beans.Orders;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PostMapping;

@Controller
public class MainController {

    @GetMapping("/")
    public String getIndex(Model model){
        model.addAttribute("order", new Orders());
        return "index";
    }

    @PostMapping("/getOrder")
    public String getOrder(@ModelAttribute Orders orders){
        System.out.println(orders.getQuantity());
        System.out.println(orders.getSize());
        System.out.println(orders.getCoffeeType());
        return "orders";
    }

}
