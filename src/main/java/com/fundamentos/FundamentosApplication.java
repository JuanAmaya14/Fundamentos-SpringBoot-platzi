package com.fundamentos;

import com.fundamentos.Component.ComponentDependency;
import com.fundamentos.bean.MyBean;
import com.fundamentos.bean.MyBeanWithDependency;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
public class FundamentosApplication implements CommandLineRunner{

    private ComponentDependency componentDependency;
    private MyBean myBean;
    private MyBeanWithDependency mybeanwithdependency;
    
    public FundamentosApplication(ComponentDependency componentDependency, MyBean myBean, MyBeanWithDependency mybeanwithdependency) {
        this.componentDependency = componentDependency;
        this.myBean = myBean;
        this.mybeanwithdependency = mybeanwithdependency;
        
    }   

    public static void main(String[] args) {
        SpringApplication.run(FundamentosApplication.class, args);
    }

    @Override
    public void run(String... args){
        
        componentDependency.saludar();
        myBean.print();
        mybeanwithdependency.printWhitdependency();
        
    }

}
