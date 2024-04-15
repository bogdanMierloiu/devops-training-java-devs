package eu.accesa.springcontainer;

import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;

@org.springframework.web.bind.annotation.RestController
@RequestMapping
@CrossOrigin(origins = "*")
public class RestController {

    @GetMapping
    public String testRequest() {
        return"Hello from the container!";
    }
}
