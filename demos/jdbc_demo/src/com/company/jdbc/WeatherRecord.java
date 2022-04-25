package com.company.jdbc;

import java.sql.Date;

public class WeatherRecord {

    private Long uni_hour;
    private Date date;
    private Double celsius;
    private Double fahrenheit;
    private String type;
    private Double humidity;
    private Double lat;
    private Double lon;
    private String city;
    private String province_state;
    private String country;

    @Override
    public String toString() {
        return "WeatherRecord{" +
                "uni_hour=" + uni_hour +
                ", date=" + date +
                ", celsius=" + celsius +
                ", fahrenheit=" + fahrenheit +
                ", type='" + type + '\'' +
                ", humidity=" + humidity +
                ", lat=" + lat +
                ", lon=" + lon +
                ", city='" + city + '\'' +
                ", province_state='" + province_state + '\'' +
                ", country='" + country + '\'' +
                '}';
    }

    public Long getUni_hour() {
        return uni_hour;
    }

    public void setUni_hour(Long uni_hour) {
        this.uni_hour = uni_hour;
    }

    public Date getDate() {
        return date;
    }

    public void setDate(Date date) {
        this.date = date;
    }

    public Double getCelsius() {
        return celsius;
    }

    public void setCelsius(Double celsius) {
        this.celsius = celsius;
    }

    public Double getFahrenheit() {
        return fahrenheit;
    }

    public void setFahrenheit(Double fahrenheit) {
        this.fahrenheit = fahrenheit;
    }

    public String getType() {
        return type;
    }

    public void setType(String type) {
        this.type = type;
    }

    public Double getHumidity() {
        return humidity;
    }

    public void setHumidity(Double humidity) {
        this.humidity = humidity;
    }

    public Double getLat() {
        return lat;
    }

    public void setLat(Double lat) {
        this.lat = lat;
    }

    public Double getLon() {
        return lon;
    }

    public void setLon(Double lon) {
        this.lon = lon;
    }

    public String getCity() {
        return city;
    }

    public void setCity(String city) {
        this.city = city;
    }

    public String getProvince_state() {
        return province_state;
    }

    public void setProvince_state(String province_state) {
        this.province_state = province_state;
    }

    public String getCountry() {
        return country;
    }

    public void setCountry(String country) {
        this.country = country;
    }

}
