package com.example.snippet.Classes;

import java.util.ArrayList;
import java.util.List;
import java.util.Objects;

import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/api/customers")
public class CustomerController {
    List<Customer> customer = new ArrayList<>(); 

    @GetMapping(value="/")
    public List<Customer> getAll(){
        return customer;
    }
    @PostMapping(value="/")
    public Customer persist(@RequestBody Customer custo){
           Customer cus = new Customer(custo.custname,custo.custemail,custo.custphone,custo.custcity);
           customer.add(cus);
           return cus;
    }
    @PutMapping(value="/info/{id}")
    public Customer put(@PathVariable Long id,@RequestBody Customer custo){
        for(int i=0;i<customer.size();i++){
            if(Objects.equals(customer.get(i).id,id)){
                    Customer updatedata = custo;
                    updatedata.id = id;
                    customer.set(i, updatedata);
            }
        }
        return custo;
    }

    @DeleteMapping(value="/del/{id}")
    public String delete(@PathVariable Long id){
        for(int i=0;i<customer.size();i++){
            if(Objects.equals(customer.get(i).id, id)){
                 customer.remove(i);
                 return "Mission accomplished";
            }
        }
        return "solii mudinchu";
        //return a forward msg to client
    }
}
