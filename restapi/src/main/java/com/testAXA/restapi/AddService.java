package com.testAXA.restapi;
import org.springframework.stereotype.Service;
@Service
public class AddService{

    public Integer add(Integer a, Integer b){
        return a+b;
    }
    public Integer mult(Integer a, Integer b){
        return a*b;
    }
    public String concat(String a, String b){
        return a+b;
    }
}