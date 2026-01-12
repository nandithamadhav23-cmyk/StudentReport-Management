package project3;

import java.util.Scanner;

public abstract class User extends Employee {
    int perf;
    User(Scanner sc)
    {   super(sc);//calls the Employee(immediate parent class) constructor
        System.out.println("Provide the rating for Employee based on Performance:");
        System.out.println("1.Poor\n2.Average\n3.Good\n4.Excellent");
        perf = sc.nextInt();
    }
    public abstract void empPerformance();
}
