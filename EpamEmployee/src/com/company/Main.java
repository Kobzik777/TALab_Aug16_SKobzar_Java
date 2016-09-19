package com.company;

public class Main {

    public static void main(String[] args) {
	// write your code here
        EpamEmployee employee1 = new EpamEmployee(14,"Kola");
        RDEmployee employee2 = new RDEmployee(14,"Kola", Direction.Front_EndDev);
        EpamEmployee employeeRD1 = new RDEmployee(14,"Vasa", Direction.DevOps);
        RDEmployee employeeRD2 = new RDEmployee(14,"Vasa", Direction.DevOps);
        System.out.println(employee1.equals(employeeRD1));
        System.out.println(employeeRD1.equals(employeeRD2));
        System.out.println(employee1.equals(employee2));
        System.out.println(employee1.hashCode());
        System.out.println(employee2.hashCode());
        System.out.println(employeeRD1.hashCode());
        System.out.println(employeeRD2.hashCode());

    }
}
