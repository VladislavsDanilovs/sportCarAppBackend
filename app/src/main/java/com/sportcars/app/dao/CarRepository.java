package com.sportcars.app.dao;

import com.sportcars.app.entity.Car;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.Pageable;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;
import org.springframework.web.bind.annotation.RequestParam;

@Repository
public interface CarRepository extends JpaRepository<Car, Long> {
    Page<Car> findByModelContaining(@RequestParam("model") String model, Pageable pageable);

    Page<Car> findByColor(@RequestParam("color") String color, Pageable pageable);
}
