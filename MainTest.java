package com.example.test;

import com.example.demo.Anello;
import com.example.demo.Figura;
import com.example.demo.Rettangolo;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.*;

public class MainTest {
    public static void main(String[] args) {
       /*  Vincolante sul tipo , in questo caso Rettangolo x via di IMPORT
        ApplicationContext context = new ClassPathXmlApplicationContext("beans.xml");
        Rettangolo r = (Rettangolo) context.getBean("Figura01");
        System.out.println(r);

        Rettangolo r1 = (Rettangolo) context.getBean("Figura01");
        r.setColore("Rosso ");
        System.out.println(r1);
        System.out.println(r);
        */
        ApplicationContext context = new ClassPathXmlApplicationContext("beans.xml");
        Anello a = (Anello) context.getBean("anello");
        System.out.println(a.area());



    }
}
