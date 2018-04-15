package com.maven.service.serviceImpl;

import com.maven.domain.Customer;
import com.maven.mapper.CustomerMapper;
import com.maven.service.CustomerService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

/**
 * @Author : yangxudong
 * @Description :
 * @Date : 上午7:54 2018/4/15
 */
@Service
public class CustomerServiceImpl implements CustomerService {

    @Autowired
    private CustomerMapper customerMapper;

    @Override
    public void addCustomer(Customer customer) {
        customerMapper.addCustomer(customer);
    }
}
