package com.arun.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.ResponseBody;
import com.arun.model.Product;
import org.springframework.web.servlet.ModelAndView;

@Controller
@RequestMapping("/samsung/product")
public class JSONController {

    /*@RequestMapping(value="{name}", method = RequestMethod.GET)
     public @ResponseBody Product getShopInJSON(@PathVariable String name) {
        System.out.println("SSSSSSSSSSSSSSSSS");
        Product product = new Product();
        product.setName(name);
        product.setRange(new String[]{"abcdef", "vwxyz"});

        return product;

    }*/

    @RequestMapping(value = "{name}", method = RequestMethod.GET)
    public ModelAndView hello(@PathVariable("name") String name) {

        ModelAndView model = new ModelAndView();
        model.setViewName("hello");
        model.addObject("msg", name);
        return model;
    }

}