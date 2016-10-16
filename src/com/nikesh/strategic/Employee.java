package com.nikesh.strategic;

/**
 * Created by Nikesh 10/22/15.
 */
public abstract class Employee {

    public IWork iwork;

   abstract void doWork();

    public void setWork(IWork iwork)
    {
        this.iwork = iwork;
    }

    public IWork getWork()
    {
        return this.iwork;
    }

}
