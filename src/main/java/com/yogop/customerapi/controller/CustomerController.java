package com.yogop.customerapi.controller;

import com.yogop.customerapi.model.Customer;
import com.yogop.customerapi.service.CustomerService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

/**
 * @author Jeffrey Y. Pogoy
 * @created 11 Sep 2017 5:58 PM
 */
@RestController
@RequestMapping("/api/customers")
public class CustomerController {

    @Autowired
    private CustomerService customerService;

    @RequestMapping(value = "")
    public List<Customer> getAllCustomers() {
        return customerService.getAllCustomers();
    }

    @RequestMapping(value = "{id}")
    public Customer getCustomer(@PathVariable long id) {
        return customerService.getCustomer(id);
    }

    @RequestMapping(value = "", method = RequestMethod.POST)
    public void addCustomer(@RequestBody Customer customer) {
        customerService.addCustomer(customer);
    }

    @RequestMapping(value = "{id}", method = RequestMethod.PUT)
    public void updateCustomer(@PathVariable long id, @RequestBody Customer customer) {
        customerService.updateCustomer(id, customer);
    }

    @RequestMapping(value = "{id}", method = RequestMethod.DELETE)
    public void deleteCustomer(@PathVariable long id) {
        customerService.deleteCustomer(id);
    }
}
