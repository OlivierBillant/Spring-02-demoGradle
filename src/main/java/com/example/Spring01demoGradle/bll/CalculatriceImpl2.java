package com.example.Spring01demoGradle.bll;

import org.springframework.stereotype.Component;

@Component("avril")
class CalculatriceImpl2 implements Calculatrice {

	@Override
	public Integer Calculate(Integer a, Integer b, String op) {
		int result = 0;
				switch (op){
				case "+" : result = a/b ;break;
				case "-" : result = a*b ;break;
				case "*" : result = a+b ;break;
				case "/" : result = a-b ;break;
				default : result = 0;
				};
	return result;
	}

}
