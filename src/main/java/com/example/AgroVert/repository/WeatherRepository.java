package com.example.AgroVert.repository;

import java.util.Date;
import java.util.Optional;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.stereotype.Repository;

import com.example.AgroVert.model.Weather;

@Repository
public interface WeatherRepository extends JpaRepository<Weather, Long>{

	@Query(value="select * from Weather where id=(select max(id) from Weather)",nativeQuery=true)
	 Weather getWeatherByMaxId();

	@Query(value="SELECT AVG(humidity) from weather w2 where w2.`date` >= '2021-01-01' and w2.`date` <= '2022-01-01'",nativeQuery=true)
	Double getAvg2021();

	@Query(value="SELECT AVG(humidity) from weather w2 where w2.`date` >= '2020-01-01' and w2.`date` <= '2021-01-01'",nativeQuery=true)
	Double getAvg2020();

	@Query(value="SELECT AVG(humidity) from weather w2 where w2.`date` >= '2019-01-01' and w2.`date` <= '2020-01-01'",nativeQuery=true)
	Double getAvg2029();

	Weather findWeatherByDate(Date date);
}
