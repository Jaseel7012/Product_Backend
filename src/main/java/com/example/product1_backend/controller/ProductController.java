package com.example.product1_backend.controller;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class ProductController {
    @GetMapping("/")
public String HomePage(){
    return  "Product app";
}
@GetMapping("/view")
public String ViewPage(){
        return "view page";
}
@PostMapping("/add")
public  String AddProduct(){
        return  "Add product page";
}

@PostMapping("/delete")
public String DeleteProduct(){
        return  "delete product page";
    }
    @PostMapping("/edit")
    public String EditProduct(){
        return  "edit page";
    }
@PostMapping("/search")
public  String SearchProduct(){
        return  "search Product";
}

}


