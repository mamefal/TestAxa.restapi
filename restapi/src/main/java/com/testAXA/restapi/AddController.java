package com.testAXA.restapi;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.http.MediaType;
@RestController
public class AddController {

    private AddService addService;


    public AddController(AddService addService) {
        this.addService = addService;
    }

    @GetMapping("/hello-world")
    public String HelloWorld(){
        return "Hello World";
    }

    @GetMapping(value="/add/{a}/{b}",produces = MediaType.APPLICATION_JSON_VALUE)
    public Response add(@PathVariable Integer a, @PathVariable Integer b){
        return this.addService.add(a,b);
    }
    @GetMapping("/concatName/{a}/{b}")
    public String concat(@PathVariable String a, @PathVariable String b){
        return this.addService.concat(a,b);
    }
    @GetMapping("/mult/{a}/{b}")
    public Response mult(@PathVariable Integer a, @PathVariable Integer b){
        return this.addService.mult(a,b); 
    } 
}
