package com.boot.rest.repo;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;
import com.boot.rest.pojo.Routes;

@Repository
public interface CityRoutes extends JpaRepository<Routes, Long> {

}
