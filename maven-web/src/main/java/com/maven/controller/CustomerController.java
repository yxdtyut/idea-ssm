package com.maven.controller;

import com.maven.domain.Customer;
import com.maven.service.CustomerService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.transaction.annotation.Transactional;
import org.springframework.web.bind.annotation.*;

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
        System.out.println("这是b在分支上进行的操作");
        customerService.addCustomer(customer);
        return "success";
    }

    @GetMapping("/doGet")
    public String getInfo() {
        System.out.println("测试GET");
        return "success";
    }

    @PostMapping("/doPost")
    public String postInfo(Customer customer) {
        System.out.println("测试POST" + customer.toString());
        return "success";
    }

    @PutMapping("/doPut/{id}")
    public String putCustomer(@PathVariable Integer id) {
        System.out.println("put:" + id);
        return "success";
    }

    @DeleteMapping("/doDelete/{id}")
    public String deleteCustomer(@PathVariable Integer id) {
        System.out.println("delete:" + id);
        return "success";
    }

}