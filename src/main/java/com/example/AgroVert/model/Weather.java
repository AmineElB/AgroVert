package com.example.AgroVert.model;

import java.util.Date;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;

@Entity
public class Weather {

	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private Long id;
	
	private Date date;
	private double temperature;
	private double min_temperature;
	private double max_temperature;
	private double temp_rosee;
	
	public double getTemp_rosee() {
		return temp_rosee;
	}
	public void setTemp_rosee(double temp_rosee) {
		this.temp_rosee = temp_rosee;
	}
	private double humidity;
	private double min_humidity;
	private double max_humidity;
	
	public Date getDate() {
		return date;
	}
	public void setDate(Date date) {
		this.date = date;
	}
	private double wind_speed;
	private double wind_direction;
	
	private double rayo;
	private double rain;
	private double evapo;
	public Long getId() {
		return id;
	}
	public void setId(Long id) {
		this.id = id;
	}
	public double getTemperature() {
		return temperature;
	}
	public void setTemperature(double temperature) {
		this.temperature = temperature;
	}
	public double getMin_temperature() {
		return min_temperature;
	}
	public void setMin_temperature(double min_temperature) {
		this.min_temperature = min_temperature;
	}
	public double getMax_temperature() {
		return max_temperature;
	}
	public void setMax_temperature(double max_temperature) {
		this.max_temperature = max_temperature;
	}
	public double getHumidity() {
		return humidity;
	}
	public void setHumidity(double humidity) {
		this.humidity = humidity;
	}
	public double getMin_humidity() {
		return min_humidity;
	}
	public void setMin_humidity(double min_humidity) {
		this.min_humidity = min_humidity;
	}
	public double getMax_humidity() {
		return max_humidity;
	}
	public void setMax_humidity(double max_humidity) {
		this.max_humidity = max_humidity;
	}
	public double getWind_speed() {
		return wind_speed;
	}
	public void setWind_speed(double wind_speed) {
		this.wind_speed = wind_speed;
	}
	public double getWind_direction() {
		return wind_direction;
	}
	public void setWind_direction(double wind_direction) {
		this.wind_direction = wind_direction;
	}
	public double getRayo() {
		return rayo;
	}
	public void setRayo(double rayo) {
		this.rayo = rayo;
	}
	public double getRain() {
		return rain;
	}
	public void setRain(double rain) {
		this.rain = rain;
	}
	public double getEvapo() {
		return evapo;
	}
	public void setEvapo(double evapo) {
		this.evapo = evapo;
	}
	
	
}
