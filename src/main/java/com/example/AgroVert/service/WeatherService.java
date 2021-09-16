package com.example.AgroVert.service;


import java.util.Date;
import java.util.Optional;

import com.example.AgroVert.model.Weather;

public interface WeatherService {

	public void save(Weather weather);
	
	public Weather getWeatherByMaxId();
	
	public Optional<Weather> findById(Long id);
	
	public Weather getWeatherByDate(Date date);
}
