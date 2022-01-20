package com.fundamentos.bean;

public class MyBeanWithDependencyImplement implements MyBeanWithDependency{
    
    private MyOperation myOperation;

    public MyBeanWithDependencyImplement(MyOperation myOperation) {
        this.myOperation = myOperation;
    }
    
    
    
    

    @Override
    public void printWhitdependency() {
        
        int number = 1;
        System.out.println(myOperation.sum(number));
        System.out.println("Hola mundo desde Bean con depencencias");
        
    }
    
}
