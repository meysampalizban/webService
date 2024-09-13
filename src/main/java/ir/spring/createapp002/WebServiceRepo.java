package ir.spring.createapp002;


import java.math.BigInteger;
import java.util.HashMap;
import java.util.Map;

import org.springframework.stereotype.Component;

import ir.spring.createapp002.object.Car;
import jakarta.annotation.PostConstruct;


@Component
public class WebServiceRepo {

	public static final Map<String, Car> cars = new HashMap<>();
	
	@PostConstruct
	public void initData() {

		Car bmv=new Car();
		bmv.setName("s500");
		bmv.setColor("red");
		bmv.setPrice(BigInteger.valueOf(10000));
		bmv.setSpeed(BigInteger.valueOf(100));
		
		cars.put("s500", bmv);
		
	}
	
	public Car findCar(String name) {
		return cars.get(name);
		
	}
	
}
