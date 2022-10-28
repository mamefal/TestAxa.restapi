package com.testAXA.restapi;
import org.springframework.stereotype.Service;
@Service
public class AddService{

    public Response add(Integer a, Integer b){
        return new Response(a+b);
    }
    public Response mult(Integer a, Integer b){
        return new Response(a*b);
    }
    public String concat(String a, String b){
        return a+b;
    }
}