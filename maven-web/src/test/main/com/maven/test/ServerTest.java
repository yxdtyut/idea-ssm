package com.maven.test;

import com.maven.domain.Customer;
import com.maven.mapper.CustomerMapper;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.test.context.ContextConfiguration;
import org.springframework.test.context.junit4.SpringJUnit4ClassRunner;
/**
 * @Author : yangxudong
 * @Description :
 * @Date : 下午9:45 2018/4/14
 */
@RunWith(SpringJUnit4ClassRunner.class)
@ContextConfiguration("classpath:applicationContext.xml")
public class ServerTest {

    @Autowired
    private CustomerMapper customerMapper;

    @Test
    public void add() {
        Customer customer = new Customer();
        customer.setName("李白");
        customer.setSex("男");
        customer.setAge(11);
        customerMapper.addCustomer(customer);
    }


}
