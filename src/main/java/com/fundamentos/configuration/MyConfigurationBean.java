package com.fundamentos.configuration;

import com.fundamentos.bean.MyBean;
import com.fundamentos.bean.MyBean2Implement;
import com.fundamentos.bean.MyBeanImplement;
import com.fundamentos.bean.MyBeanWithDependency;
import com.fundamentos.bean.MyBeanWithDependencyImplement;
import com.fundamentos.bean.MyOperation;
import com.fundamentos.bean.MyOperationImplement;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

@Configuration
public class MyConfigurationBean {

    @Bean
    public MyBean beanOperation() {
        return new MyBean2Implement();
    }

    @Bean
    public MyOperation beanOperationOperation() {
        return new MyOperationImplement();
    }

    @Bean
    public MyBeanWithDependency beanOperationOperationWithDependency(MyOperation myoperation) {
        return new MyBeanWithDependencyImplement(myoperation);
    }

}
