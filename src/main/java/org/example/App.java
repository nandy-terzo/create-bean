package org.example;


import org.springframework.context.annotation.AnnotationConfigApplicationContext;


public class App 
{
    public static void main( String[] args )
    {
        var context= new AnnotationConfigApplicationContext(ProjectConfig.class);
        Parrot p=context.getBean("parrot2",Parrot.class);
        System.out.println(p.getName());
    }
}
