package hello;

import java.io.IOException;
import java.io.InputStream;
import java.io.InputStreamReader;
import java.net.HttpURLConnection;
import java.net.URL;
import java.util.Date;
import java.util.concurrent.atomic.AtomicLong;

import com.google.gson.JsonElement;
import com.google.gson.JsonObject;
import com.google.gson.JsonParser;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.context.annotation.Bean;
import org.springframework.scheduling.annotation.Scheduled;
import org.springframework.web.bind.annotation.*;

@RestController

public class GreetingController {
    @Autowired // This means to get the bean called userRepository
            CustomerRepository customerRepository;
    private  final String template = "Hello, %s!";
    private final AtomicLong counter = new AtomicLong();


    //@RequestMapping("/greeting")
    private static final Logger log = LoggerFactory.getLogger(Application.class);

    @Scheduled(cron = "0 0 * ? * * *")
    @Bean
    public void  get() {
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
            String cord = rootobj.get("coord").toString();
            String weather = rootobj.get("weather").toString();
            String base = rootobj.get("base").toString();
            String main = rootobj.get("main").toString();
            String wind = rootobj.get("wind").toString();
            String clouds = rootobj.get("clouds").toString();
            String dt = rootobj.get("dt").toString();
            String sys = rootobj.get("sys").toString();
            String time = rootobj.get("timezone").toString();
            String idd = rootobj.get("id").toString();
            String name = rootobj.get("name").toString();
            String code = rootobj.get("cod").toString();
            Date date = new Date();
            customerRepository.save(new Customer(cord,weather,base,main,wind,clouds,dt,sys,time,idd,name,code,date));
        }
        catch (IOException e){
            System.out.println("error");
        }

            // save a couple of customers  cord,weather, base,main,wind,clouds,dt,sys,idd,name,code










        }


    @RequestMapping("/greeting")
    public @ResponseBody
    Iterable<Customer> getAllUsers() {
        // This returns a JSON or XML with the users
        return customerRepository.findAll();
    }


}