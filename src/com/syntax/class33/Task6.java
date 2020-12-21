package com.syntax.class33;

import java.util.HashMap;
import java.util.Iterator;
import java.util.Map;
import java.util.Set;

public class Task6 {
    public static void main(String[] args) {
        Map<String, Double> employeeSalary=new HashMap<>();
        employeeSalary.put("Maria", 120_000.0);
        employeeSalary.put("Mike", 160_000.0);
        employeeSalary.put("Veronika", 130_000.0);
        employeeSalary.put("Burju", 180_000.0);
        employeeSalary.put("Qasim", 100_000.0);

        Set<Map.Entry<String, Double>> employeeSalarySet= employeeSalary.entrySet();
        Iterator<Map.Entry<String, Double>> iterator= employeeSalarySet.iterator();

        Double salary=0.0;
        String name="";

        while(iterator.hasNext()){
            Map.Entry<String, Double>next= iterator.next();
            Double salary1=next.getValue();
            if(salary1>salary){
                salary=salary1;
                name= next.getKey();
            }
        }

        System.out.println("The highest salary belongs to "+name+" and is equal to "+salary);
        System.out.println(name+"="+salary);


    }
}
