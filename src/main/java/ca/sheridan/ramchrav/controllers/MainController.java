package ca.sheridan.ramchrav.controllers;

import ca.sheridan.ramchrav.beans.Orders;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PostMapping;

import java.util.List;
import java.util.concurrent.CopyOnWriteArrayList;

@Controller
public class MainController {
    List<Orders> oList = new CopyOnWriteArrayList<Orders>();

    @GetMapping("/")
    public String getIndex(Model model){
        oList.clear();
        model.addAttribute("order", new Orders());
        return "index";
    }

    @PostMapping("/getOrder")
    public String getOrder(Model model, @ModelAttribute Orders orders){
        oList.add(orders);
        model.addAttribute("oList", oList);
        model.addAttribute("order", orders);
        return "orders";
    }
}
