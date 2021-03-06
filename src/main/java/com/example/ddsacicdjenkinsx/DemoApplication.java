package com.example.ddsacicdjenkinsx;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

import java.util.Arrays;
import java.util.List;

@SpringBootApplication
public class DemoApplication {

	public static void main(String[] args) {
		SpringApplication.run(DemoApplication.class, args);
	}
}

@RestController
@RequestMapping
class BCPRestController {
	@RequestMapping(value = "/cuentas", method = RequestMethod.GET)
	public List<String> getTipoCuenta(){
		return Arrays.asList("Ahorros", "Corriente");
	}
}