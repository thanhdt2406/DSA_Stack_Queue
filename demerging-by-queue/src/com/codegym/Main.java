package com.codegym;

import java.util.LinkedList;
import java.util.Queue;

public class Main {

    public static void main(String[] args) {
        Queue<Employee> queueMale = new LinkedList<>();
        Queue<Employee> queueFemale = new LinkedList<>();
        Employee[] listEmployee = new Employee[6];
        listEmployee[0] = new Employee("Nguyễn Văn A", true, "1/1/1998");
        listEmployee[1] = new Employee("Nguyễn Thị B", false, "1/2/1987");
        listEmployee[2] = new Employee("Nguyễn Nam C", true, "12/6/1970");
        listEmployee[3] = new Employee("Nguyễn Ngọc D", false, "31/12/2006");
        listEmployee[4] = new Employee("Nguyễn Minh E", true, "4/4/1991");
        listEmployee[5] = new Employee("Nguyễn Hoa F", false, "17/6/1992");

        for (int i = 0; i < listEmployee.length; i++) {
            if (listEmployee[i].isMale()) {
                queueMale.offer(listEmployee[i]);
            } else {
                queueFemale.offer(listEmployee[i]);
            }
        }

        for (int i = 0; i < listEmployee.length; i++) {
            if (!queueFemale.isEmpty()) {
                listEmployee[i] = queueFemale.remove();
                continue;
            }
            listEmployee[i] = queueMale.remove();
        }

        System.out.printf("%-15s   %10s   %20s\n", "Name", "Gender", "Date of birth");
        for (int i = 0; i < listEmployee.length; i++) {
            System.out.printf("%-15s   %10s   %20s\n", listEmployee[i].getName(), listEmployee[i].isMale() ? "Male" : "Female", listEmployee[i].getDoB());
        }
    }
}
