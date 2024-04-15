package eu.accesa.springcontainer;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;

@Controller
public class WebController {

    @Value("${container.number}")
    String containerNumber;

    @GetMapping
    public String index(Model model) {
        model.addAttribute("containerNumber", containerNumber);
        return "index";
    }
}
