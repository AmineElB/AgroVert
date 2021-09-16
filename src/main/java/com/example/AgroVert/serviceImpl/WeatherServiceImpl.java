package com.example.AgroVert.serviceImpl;

import java.util.Date;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.example.AgroVert.model.Weather;
import com.example.AgroVert.repository.UserMasterRepository;
import com.example.AgroVert.repository.WeatherRepository;
import com.example.AgroVert.service.UserLoginService;
import com.example.AgroVert.service.WeatherService;

@Service
public class WeatherServiceImpl implements WeatherService{

	@Autowired
	private  WeatherRepository weatherRepository;
	
	@Override
	public void save(Weather weather) {
		weatherRepository.save(weather);
		
	}

	@Override
	public Weather getWeatherByMaxId() {
		// TODO Auto-generated method stub
		try {
			Weather weather = weatherRepository.getWeatherByMaxId();
			return weather;
		} catch (Exception c) {
			return null;
		}
	}

	@Override
	public Weather getWeatherByDate(Date date) {
		// TODO Auto-generated method stub
		return weatherRepository.findWeatherByDate(date);
	}

	@Override
	public Optional<Weather> findById(Long id) {
		return weatherRepository.findById(id);
	}


}
