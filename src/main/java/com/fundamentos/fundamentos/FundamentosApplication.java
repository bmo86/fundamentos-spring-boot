package com.fundamentos.fundamentos;

import com.fundamentos.fundamentos.bean.MyBeanWithDependency;
import com.fundamentos.fundamentos.bean.Mybean;
import com.fundamentos.fundamentos.bean.MybeanWithPropeties;
import com.fundamentos.fundamentos.component.ComponentImplementation;
import com.fundamentos.fundamentos.pojo.UserPojo;
import org.apache.commons.logging.Log;
import org.apache.commons.logging.LogFactory;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
public class FundamentosApplication implements CommandLineRunner {

	private final Log LOGGER = LogFactory.getLog(FundamentosApplication.class);

	//inyec dependecy ComponentImplementation is ComponentDependecy in example jajajja
	private ComponentImplementation componentImplementation;
	private Mybean myBean;
	private MyBeanWithDependency myBeanWithDependency;
	private MybeanWithPropeties mybeanWithPropeties;
	private UserPojo userPojo;
	public FundamentosApplication(UserPojo userPojo,@Qualifier("componentTwoImplement") ComponentImplementation componentImplementation, Mybean myBean, MyBeanWithDependency myBeanWithDependency, MybeanWithPropeties mybeanWithPropeties) {
		this.componentImplementation = componentImplementation;
		this.myBean = myBean;
		this.myBeanWithDependency = myBeanWithDependency;
		this.mybeanWithPropeties = mybeanWithPropeties;
		this.userPojo = userPojo;
	}
	public static void main(String[] args) {
		SpringApplication.run(FundamentosApplication.class, args);
	}


	@Override
	public void run(String... args) throws Exception {
		myBeanWithDependency.printWithDependency();
		System.out.println(userPojo.getEmail());
		System.out.println(userPojo.getPass());
		System.out.println(userPojo.getAge());
		try {
			int value = 10/0;
			LOGGER.info("Value: "+ value);
		} catch (Exception e) {
			LOGGER.error("error");
		}
	}
}
