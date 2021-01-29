package co.com.operation.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

import co.com.operation.services.Calculator;



@RestController
public class ControllerSubstract {
	
	@Autowired
	private Calculator calculator;
	
	
	public ControllerSubstract() {		
		System.out.println("Creando controller substract");	
	}
	
	
	@GetMapping("/restar")
	public String restar() {
		
		int a = 5;
		int b = 10;
		
		//Calculator calculator = new Calculator();
		return "La resta de los numeros: "+a+" y "+b+" es: "+ calculator.substract(a, b);

	}
	
	

}
