package com.maven.controller;

import com.maven.domain.Customer;
import com.maven.service.CustomerService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.transaction.annotation.Transactional;
import org.springframework.web.bind.annotation.RequestMapping;

/**
 * @Author : yangxudong
 * @Description :
 * @Date : 上午8:24 2018/4/15
 */
@Controller
@Transactional
public class CustomerController {

    @Autowired
    private CustomerService customerService;

    @RequestMapping("/toAdd")
    public String toAdd() {
        return "add";
    }

    @RequestMapping("/addCustomer")
    public String addCustomer(Customer customer) {
        System.out.println("这是b提交的");
        customerService.addCustomer(customer);
        return "success";
    }
}
