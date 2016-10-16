package com.nikesh.strategic;

/**
 * Created by Nikesh on 10/22/15.
 */
public class DemoMain {

    public static void main(String[] args)
    {
        Employee employee = new EmployeeA();
        employee.setWork(new Coding());

        employee.getWork().doAssingMent();
    }
}
