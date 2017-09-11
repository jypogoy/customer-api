package com.yogop.customerapi.service;

import com.yogop.customerapi.model.Customer;
import org.springframework.stereotype.Service;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

/**
 * @author Jeffrey Y. Pogoy
 * @created 11 Sep 2017 5:49 PM
 */
@Service
public class CustomerService {

    List<Customer> customers = new ArrayList<>(Arrays.asList(
        new Customer(1, "Customer 1", "An address for Customer 1", null),
        new Customer(2, "Customer 2", "An address for Customer 2", null),
        new Customer(3, "Customer 3", "An address for Customer 3", null),
        new Customer(4, "Customer 4", "An address for Customer 4", null)
    ));

    public List<Customer> getAllCustomers() {
        return customers;
    }

    public Customer getCustomer(long id) {
        return customers.stream().filter(c -> c.getId() == id).findFirst().get();
    }

    public void addCustomer(Customer customer) {
        customers.add(customer);
    }

    public void updateCustomer(long id, Customer customer) {
        for (int i = 0; i < customers.size(); i++) {
            Customer c = customers.get(i);
            if (c.getId() == id) {
                customers.set(i, customer);
                return;
            }
        }
    }

    public void deleteCustomer(long id) {
        customers.removeIf(c -> c.getId() == id);
    }
}
