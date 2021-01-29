package co.com.operation.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

import co.com.operation.services.Calculator;



@RestController
public class ControllerAdd {
	
	
	@Autowired
	private Calculator calculator;
	
	
	public ControllerAdd() {
		
		System.out.println("Controller add");
		
		
	}
	
	
	
	@GetMapping("/sumar")
	public String sumar() {
		
		
		int a = 5;
		int b = 10;
		
	//	Calculator calculator = new Calculator();
		return "La suma de los numeros: "+a+" y "+b+" es: "+ calculator.add(a, b);

	}
	
	
	
	
}
