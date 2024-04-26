package net.hamdi.customerservice.repository;

import net.hamdi.customerservice.entities.Customer;
import org.springframework.data.jpa.repository.JpaRepository;

import java.util.List;
import java.util.Optional;


public interface CustomerRepository extends JpaRepository<Customer,Long> {
     Optional<Customer> findCustomerByEmail(String email);
     List<Customer> findByFirstNameContainsIgnoreCase(String keyword);
}
