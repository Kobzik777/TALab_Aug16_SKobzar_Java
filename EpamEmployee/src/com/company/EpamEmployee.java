package com.company;

/**
 * Created by Serhii_Kobzar on 9/19/2016.
 */
public class EpamEmployee {
    protected int age;
    protected String name;

    public EpamEmployee(int age, String name){
        this.age = age;
        this.name = name;
    }

    public EpamEmployee() {
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (!(o instanceof EpamEmployee)) return false;

        EpamEmployee that = (EpamEmployee) o;

        if (age != that.age) return false;
        return name.equals(that.name);

    }

    @Override
    public int hashCode() {
        int result = age;
        result = 31 * result + name.hashCode();
        return result;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }
}
