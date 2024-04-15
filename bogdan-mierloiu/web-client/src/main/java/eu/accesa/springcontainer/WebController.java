package eu.accesa.springcontainer;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.boot.web.client.RestTemplateBuilder;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.client.RestTemplate;

@Controller
public class WebController {

    @Value("${container.number}")
    String containerNumber;

    String url = "http://api-service:8081";

    @GetMapping
    public String index(Model model) {
        model.addAttribute("containerNumber", containerNumber);
        return "index";
    }

    @GetMapping("/api")
    public String api(Model model) {
        RestTemplate restTemplate = new RestTemplateBuilder().build();
        ResponseEntity<String> exchange = restTemplate.exchange(url, org.springframework.http.HttpMethod.GET, null, String.class);
        model.addAttribute("response", exchange.getBody());
        model.addAttribute("containerNumber", containerNumber);
        return "index";
    }
}
