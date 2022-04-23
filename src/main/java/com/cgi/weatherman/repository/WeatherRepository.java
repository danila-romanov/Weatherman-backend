package com.cgi.weatherman.repository;

import com.cgi.weatherman.model.Weather;
import com.cgi.weatherman.model.WeatherComparison;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository
public interface WeatherRepository extends JpaRepository<WeatherComparison, Long> {
    @Query("select u from WeatherComparison u where 1 = 1")
    List<Weather> getAllWeathers();
}