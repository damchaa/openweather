package hello;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.xml.crypto.Data;
import java.util.Date;

@Entity
public class Customer {

    @Id
    @GeneratedValue(strategy=GenerationType.AUTO)
    private Long id;
    private String cord;
    private String weather;
    private String base;
    private String main;
    private String wind;
    private String clouds;
    private String dt;
    private String sys;
    private String timezone;
    private String idd;
    private String name;
    private String code;
    private Date date;

    public Customer(String cord,String weather, String base, String main, String wind, String clouds, String dt, String sys, String timezone, String idd, String name, String code, Date date) {
        this.cord = cord;
        this.weather = weather;
        this.base = base;
        this.main = main;
        this.wind = wind;
        this.clouds = clouds;
        this.dt = dt;
        this.sys = sys;
        this.timezone = timezone;
        this.idd = idd;
        this.name = name;
        this.code = code;
        this.date = date;
    }

    protected Customer() {}

    public Long getId() {
        return id;
    }

    public String getCord() {
        return cord;
    }

    public String getWeather() {
        return weather;
    }

    public String getBase() {
        return base;
    }

    public String getMain() {
        return main;
    }

    public String getWind() {
        return wind;
    }

    public String getClouds() {
        return clouds;
    }

    public String getDt() {
        return dt;
    }

    public String getSys() {
        return sys;
    }

    public String getTimezone() {
        return timezone;
    }

    public String getIdd() {
        return idd;
    }

    public String getName() {
        return name;
    }

    public String getCode() {
        return code;
    }


    @Override
    public String toString() {
        return String.format(
                "Customer[id=%d , cord ='%s' ,weather ='%s', base='%s' ,main='%s',wind='%s',clouds='%s',dt='%s',sys='%s',idd='%s',name='%s',code='%s',date='%s']",
                id, cord,weather, base,main,wind,clouds,dt,sys,idd,name,code,date);
    }

}