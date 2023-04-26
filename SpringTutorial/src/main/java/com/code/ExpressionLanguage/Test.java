package com.code.ExpressionLanguage;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;
import org.springframework.expression.Expression;
import org.springframework.expression.spel.standard.SpelExpressionParser;

public class Test {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		ApplicationContext con=new ClassPathXmlApplicationContext("com/code/ExpressionLanguage/config.xml");
		Demo d=con.getBean("demo",Demo.class);
		System.out.println(d);
		

		
//		example of spring expression language:-
		
//		SpelExpressionParser temp=new SpelExpressionParser();
//		Expression ex= temp.parseExpression("33*443");
//		System.out.println(ex.getValue());
	}

}
