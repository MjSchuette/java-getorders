package com.matthewschuette.javaorders.Repositories;

import com.matthewschuette.javaorders.Models.Customers;
import org.springframework.data.repository.CrudRepository;

public interface CustomersRepo extends CrudRepository<Customers, Long> {
}
