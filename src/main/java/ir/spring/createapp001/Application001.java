package ir.spring.createapp001;


import java.sql.SQLDataException;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.function.BiConsumer;
import java.util.function.BiFunction;
import java.util.function.Consumer;
import java.util.function.IntFunction;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.autoconfigure.domain.EntityScan;
import org.springframework.context.ConfigurableApplicationContext;
import org.springframework.context.annotation.ComponentScan;


//@SpringBootApplication
//@EntityScan(basePackages = "ir.spring.createApp001.model")
//@ComponentScan(basePackages = "ir.spring.createApp001.controller")
public class Application001 {
	public static void main(String[] args) throws SQLDataException ,Exception{
//	ConfigurableApplicationContext context=	SpringApplication.run(CreateApp001Application.class, args);

	

	Map<Integer, String> map=new HashMap<>();

	map.put(1, "meisam");
	map.put(2, "ali");
	map.put(3, "sara");
	

//	Consumer<String> metho=(n)->{System.out.println(n);};
//BiFunction<Integer, String, String> bimetho=(A,B)->{ return A+"->"+B;};
//
//map.forEach((A, B) -> System.out.print(A+"->"+B) );
	
List<Integer> list=new ArrayList<>();
list.add(20);
list.add(40);

IntFunction<Integer> u=(n)-> {return n*2;};

u.apply(20);



System.out.println(u);
	
	
	
	
	}
}
