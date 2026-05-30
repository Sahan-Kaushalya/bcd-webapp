package lk.kaushalya.web.servlet;

import jakarta.ejb.Stateless;

@Stateless
public class Cal {
    public void getResult(int i1,int i2){
        System.out.println("Result is "+(i1+i2));
    }
}
