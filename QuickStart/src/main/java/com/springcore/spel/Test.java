package com.springcore.spel;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;
import org.springframework.expression.Expression;
import org.springframework.expression.spel.standard.SpelExpressionParser;

public class Test {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		ApplicationContext context = new ClassPathXmlApplicationContext("com/springcore/spel/spel-config.xml");
        Demo d1=context.getBean("demo",Demo.class);
		System.out.println(d1);
		
		/*SpelExpressionParser spel=new SpelExpressionParser();
		Expression expression=spel.parseExpression("45+60");
		System.out.println(expression.getValue());*/
	}

}
