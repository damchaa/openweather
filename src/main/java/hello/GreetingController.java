package hello;

import java.util.concurrent.atomic.AtomicLong;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.context.annotation.Bean;
import org.springframework.web.bind.annotation.*;

@RestController

public class GreetingController {
    @Autowired // This means to get the bean called userRepository
            CustomerRepository customerRepository;
    private  final String template = "Hello, %s!";
    private final AtomicLong counter = new AtomicLong();


    //@RequestMapping("/greeting")
    private static final Logger log = LoggerFactory.getLogger(Application.class);


    @Bean
    public CommandLineRunner  demo(CustomerRepository repository) {
        return (args) -> {

            // save a couple of customers  cord,weather, base,main,wind,clouds,dt,sys,idd,name,code
            String cord = openweather.gedCoord();
            String weather = openweather.gedWeather();
            String base = openweather.gedBase();
            String main = openweather.gedMain();
            String wind = openweather.gedClouds();
            String clouds = openweather.gedClouds();
            String dt = openweather.gedDt();
            String sys = openweather.gedSys();
            String time = openweather.gedTimezone();
            String idd = openweather.gedIdd();
            String name = openweather.gedName();
            String code = openweather.gedCode();


            repository.save(new Customer(cord,weather,base,main,wind,clouds,dt,sys,time,idd,name,code));
            log.info("Customers found with findAll():");
            log.info("-------------------------------");
            for (Customer customer : repository.findAll()) {
                log.info(customer.toString());
            }
            log.info("");


        };
    }

    @RequestMapping("/greeting")
    public @ResponseBody
    Iterable<Customer> getAllUsers() {
        // This returns a JSON or XML with the users
        return customerRepository.findAll();
    }


}