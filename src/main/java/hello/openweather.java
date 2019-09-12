package hello;

import javax.print.DocFlavor;
import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStream;
import java.io.InputStreamReader;
import java.net.HttpURLConnection;
import java.net.URL;
import java.net.URLConnection;


import com.google.gson.*;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

import org.springframework.boot.CommandLineRunner;
import org.springframework.context.annotation.Bean;
import org.springframework.scheduling.annotation.Scheduled;
import org.springframework.stereotype.Component;

public class openweather {



    public static String gedCoord() {
        String API_KEY = "a1f6d8b723c126a1e135e62c135042c9";
        String Location = "London,UK";
        String urlString = "https://api.openweathermap.org/data/2.5/weather?q=" + Location + "&appid=" + API_KEY ;
        String coord = "";




        // Connect to the URL using java native library
        try{
            URL url = new URL(urlString);
            HttpURLConnection request = (HttpURLConnection) url.openConnection();
            request.connect();

            // Convert to a JSON object to print data
            JsonParser jp = new JsonParser(); //from gson
            JsonElement root = jp.parse(new InputStreamReader((InputStream) request.getContent())); //Convert the input stream to a json element
            JsonObject rootobj = root.getAsJsonObject(); //May be an array, may be an object.
            coord = rootobj.get("coord").toString(); //just grab the zipcode

        }
        catch (IOException e){
            System.out.println("error");
        }


        return coord;
    }
    public static String gedWeather() {
        String API_KEY = "a1f6d8b723c126a1e135e62c135042c9";
        String Location = "London,UK";
        String urlString = "https://api.openweathermap.org/data/2.5/weather?q=" + Location + "&appid=" + API_KEY ;
        String weather = "";


        // Connect to the URL using java native library
        try{
            URL url = new URL(urlString);
            HttpURLConnection request = (HttpURLConnection) url.openConnection();
            request.connect();

            // Convert to a JSON object to print data
            JsonParser jp = new JsonParser(); //from gson
            JsonElement root = jp.parse(new InputStreamReader((InputStream) request.getContent())); //Convert the input stream to a json element
            JsonObject rootobj = root.getAsJsonObject(); //May be an array, may be an object.
            weather = rootobj.get("weather").toString(); //just grab the zipcode

        }
        catch (IOException e){
            System.out.println("error");
        }


        return weather;
    }
    public static String gedBase() {
        String API_KEY = "a1f6d8b723c126a1e135e62c135042c9";
        String Location = "London,UK";
        String urlString = "https://api.openweathermap.org/data/2.5/weather?q=" + Location + "&appid=" + API_KEY ;
        String base = "";


        // Connect to the URL using java native library
        try{
            URL url = new URL(urlString);
            HttpURLConnection request = (HttpURLConnection) url.openConnection();
            request.connect();

            // Convert to a JSON object to print data
            JsonParser jp = new JsonParser(); //from gson
            JsonElement root = jp.parse(new InputStreamReader((InputStream) request.getContent())); //Convert the input stream to a json element
            JsonObject rootobj = root.getAsJsonObject(); //May be an array, may be an object.
            base = rootobj.get("base").toString(); //just grab the zipcode

        }
        catch (IOException e){
            System.out.println("error");
        }


        return base;
    }
    public static String gedMain() {
        String API_KEY = "a1f6d8b723c126a1e135e62c135042c9";
        String Location = "London,UK";
        String urlString = "https://api.openweathermap.org/data/2.5/weather?q=" + Location + "&appid=" + API_KEY ;
        String main = "";


        // Connect to the URL using java native library
        try{
            URL url = new URL(urlString);
            HttpURLConnection request = (HttpURLConnection) url.openConnection();
            request.connect();

            // Convert to a JSON object to print data
            JsonParser jp = new JsonParser(); //from gson
            JsonElement root = jp.parse(new InputStreamReader((InputStream) request.getContent())); //Convert the input stream to a json element
            JsonObject rootobj = root.getAsJsonObject(); //May be an array, may be an object.
            main = rootobj.get("main").toString(); //just grab the zipcode

        }
        catch (IOException e){
            System.out.println("error");
        }


        return main;
    }
    public static String gedWind() {
        String API_KEY = "a1f6d8b723c126a1e135e62c135042c9";
        String Location = "London,UK";
        String urlString = "https://api.openweathermap.org/data/2.5/weather?q=" + Location + "&appid=" + API_KEY ;
        String wind = "";


        // Connect to the URL using java native library
        try{
            URL url = new URL(urlString);
            HttpURLConnection request = (HttpURLConnection) url.openConnection();
            request.connect();

            // Convert to a JSON object to print data
            JsonParser jp = new JsonParser(); //from gson
            JsonElement root = jp.parse(new InputStreamReader((InputStream) request.getContent())); //Convert the input stream to a json element
            JsonObject rootobj = root.getAsJsonObject(); //May be an array, may be an object.
            wind = rootobj.get("wind").toString(); //just grab the zipcode

        }
        catch (IOException e){
            System.out.println("error");
        }


        return wind;
    }
    public static String gedClouds() {
        String API_KEY = "a1f6d8b723c126a1e135e62c135042c9";
        String Location = "London,UK";
        String urlString = "https://api.openweathermap.org/data/2.5/weather?q=" + Location + "&appid=" + API_KEY ;
        String clouds = "";


        // Connect to the URL using java native library
        try{
            URL url = new URL(urlString);
            HttpURLConnection request = (HttpURLConnection) url.openConnection();
            request.connect();

            // Convert to a JSON object to print data
            JsonParser jp = new JsonParser(); //from gson
            JsonElement root = jp.parse(new InputStreamReader((InputStream) request.getContent())); //Convert the input stream to a json element
            JsonObject rootobj = root.getAsJsonObject(); //May be an array, may be an object.
            clouds = rootobj.get("clouds").toString(); //just grab the zipcode

        }
        catch (IOException e){
            System.out.println("error");
        }


        return clouds;
    }
    public static String gedDt() {
        String API_KEY = "a1f6d8b723c126a1e135e62c135042c9";
        String Location = "London,UK";
        String urlString = "https://api.openweathermap.org/data/2.5/weather?q=" + Location + "&appid=" + API_KEY ;
        String dt = "";


        // Connect to the URL using java native library
        try{
            URL url = new URL(urlString);
            HttpURLConnection request = (HttpURLConnection) url.openConnection();
            request.connect();

            // Convert to a JSON object to print data
            JsonParser jp = new JsonParser(); //from gson
            JsonElement root = jp.parse(new InputStreamReader((InputStream) request.getContent())); //Convert the input stream to a json element
            JsonObject rootobj = root.getAsJsonObject(); //May be an array, may be an object.
            dt = rootobj.get("dt").toString(); //just grab the zipcode

        }
        catch (IOException e){
            System.out.println("error");
        }


        return dt;
    }
    public static String gedSys() {
        String API_KEY = "a1f6d8b723c126a1e135e62c135042c9";
        String Location = "London,UK";
        String urlString = "https://api.openweathermap.org/data/2.5/weather?q=" + Location + "&appid=" + API_KEY ;
        String sys = "";


        // Connect to the URL using java native library
        try{
            URL url = new URL(urlString);
            HttpURLConnection request = (HttpURLConnection) url.openConnection();
            request.connect();

            // Convert to a JSON object to print data
            JsonParser jp = new JsonParser(); //from gson
            JsonElement root = jp.parse(new InputStreamReader((InputStream) request.getContent())); //Convert the input stream to a json element
            JsonObject rootobj = root.getAsJsonObject(); //May be an array, may be an object.
            sys = rootobj.get("sys").toString(); //just grab the zipcode

        }
        catch (IOException e){
            System.out.println("error");
        }


        return sys;
    }

    public static String gedTimezone() {
        String API_KEY = "a1f6d8b723c126a1e135e62c135042c9";
        String Location = "London,UK";
        String urlString = "https://api.openweathermap.org/data/2.5/weather?q=" + Location + "&appid=" + API_KEY ;
        String time = "";


        // Connect to the URL using java native library
        try{
            URL url = new URL(urlString);
            HttpURLConnection request = (HttpURLConnection) url.openConnection();
            request.connect();

            // Convert to a JSON object to print data
            JsonParser jp = new JsonParser(); //from gson
            JsonElement root = jp.parse(new InputStreamReader((InputStream) request.getContent())); //Convert the input stream to a json element
            JsonObject rootobj = root.getAsJsonObject(); //May be an array, may be an object.
            time = rootobj.get("timezone").toString(); //just grab the zipcode

        }
        catch (IOException e){
            System.out.println("error");
        }


        return time;
    }
    public static String gedIdd() {
        String API_KEY = "a1f6d8b723c126a1e135e62c135042c9";
        String Location = "London,UK";
        String urlString = "https://api.openweathermap.org/data/2.5/weather?q=" + Location + "&appid=" + API_KEY ;
        String idd = "";


        // Connect to the URL using java native library
        try{
            URL url = new URL(urlString);
            HttpURLConnection request = (HttpURLConnection) url.openConnection();
            request.connect();

            // Convert to a JSON object to print data
            JsonParser jp = new JsonParser(); //from gson
            JsonElement root = jp.parse(new InputStreamReader((InputStream) request.getContent())); //Convert the input stream to a json element
            JsonObject rootobj = root.getAsJsonObject(); //May be an array, may be an object.
            idd = rootobj.get("id").toString(); //just grab the zipcode

        }
        catch (IOException e){
            System.out.println("error");
        }


        return idd;
    }
    public static String gedName() {
        String API_KEY = "a1f6d8b723c126a1e135e62c135042c9";
        String Location = "London,UK";
        String urlString = "https://api.openweathermap.org/data/2.5/weather?q=" + Location + "&appid=" + API_KEY ;
        String name = "";


        // Connect to the URL using java native library
        try{
            URL url = new URL(urlString);
            HttpURLConnection request = (HttpURLConnection) url.openConnection();
            request.connect();

            // Convert to a JSON object to print data
            JsonParser jp = new JsonParser(); //from gson
            JsonElement root = jp.parse(new InputStreamReader((InputStream) request.getContent())); //Convert the input stream to a json element
            JsonObject rootobj = root.getAsJsonObject(); //May be an array, may be an object.
            name = rootobj.get("name").toString(); //just grab the zipcode

        }
        catch (IOException e){
            System.out.println("error");
        }


        return name;
    }
    public static String gedCode() {
        String API_KEY = "a1f6d8b723c126a1e135e62c135042c9";
        String Location = "London,UK";
        String urlString = "https://api.openweathermap.org/data/2.5/weather?q=" + Location + "&appid=" + API_KEY ;
        String cod = "";


        // Connect to the URL using java native library
        try{
            URL url = new URL(urlString);
            HttpURLConnection request = (HttpURLConnection) url.openConnection();
            request.connect();

            // Convert to a JSON object to print data
            JsonParser jp = new JsonParser(); //from gson
            JsonElement root = jp.parse(new InputStreamReader((InputStream) request.getContent())); //Convert the input stream to a json element
            JsonObject rootobj = root.getAsJsonObject(); //May be an array, may be an object.
            cod = rootobj.get("cod").toString(); //just grab the zipcode

        }
        catch (IOException e){
            System.out.println("error");
        }


        return cod;
    }
}
