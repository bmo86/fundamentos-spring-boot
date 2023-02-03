package com.fundamentos.fundamentos;

import com.fundamentos.fundamentos.bean.MyBeanWithDependency;
import com.fundamentos.fundamentos.bean.Mybean;
import com.fundamentos.fundamentos.bean.MybeanWithPropeties;
import com.fundamentos.fundamentos.component.ComponentImplementation;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
public class FundamentosApplication implements CommandLineRunner {

	//inyec dependecy ComponentImplementation is ComponentDependecy in example jajajja
	private ComponentImplementation componentImplementation;
	private Mybean myBean;
	private MyBeanWithDependency myBeanWithDependency;
	private MybeanWithPropeties mybeanWithPropeties;
	public FundamentosApplication(@Qualifier("componentTwoImplement") ComponentImplementation componentImplementation, Mybean myBean, MyBeanWithDependency myBeanWithDependency, MybeanWithPropeties mybeanWithPropeties) {
		this.componentImplementation = componentImplementation;
		this.myBean = myBean;
		this.myBeanWithDependency = myBeanWithDependency;
		this.mybeanWithPropeties = mybeanWithPropeties;
	}
	public static void main(String[] args) {
		SpringApplication.run(FundamentosApplication.class, args);
	}


	@Override
	public void run(String... args) throws Exception {
		componentImplementation.SayHello();
		//implementation to Mybean
		myBean.print();
		myBeanWithDependency.printWithDependency();
		System.out.println(mybeanWithPropeties.function());
	}
}
