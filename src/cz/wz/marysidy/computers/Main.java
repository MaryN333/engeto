package cz.wz.marysidy.computers;

import java.time.LocalDate;
import java.util.ArrayList;
import java.util.List;

public class Main {
    private static <T> void printList(List<T> computerList) {
        int count = 0;
        for(T comp : computerList){
            //            count++;
            count += 1;
            System.out.println(count + ". " + comp);
            System.out.println(" * -".repeat(20));
        }
        System.out.printf("There are  %d items in the %s list%n", count, computerList.get(0).getClass().getName());

    }
    public static void main(String[] args) {
        Computer c1 = new Computer("Acer Nitro 5 Obsidian Black", 15.6, false, 26990);
        Computer c2 = new Computer("MacBook Air 13", 13.6, 29990);
        Computer c3 = new Computer();

        Employee e1 = new Employee("Mary N", LocalDate.of(2002, 10, 17));
        Employee e2 = new Employee("Bob Black", LocalDate.of(1999, 1, 12));

        e1.addComputer(c1);
        e1.addComputer(c2);
        e2.addComputer(c3);

        List<Employee> employeesList= new ArrayList<>();
        employeesList.add(e1);
        employeesList.add(e2);
        printList(employeesList);


        List<Computer> computersList = new ArrayList<>();
        computersList.add(c1);
        computersList.add(c2);
        computersList.add(c3);


        printList(computersList);
        System.out.println(computersList);
//        System.out.println(computersList.size() > 5 ? computersList.get(5) : "Ups");

        e1.removeComputer(c3);  // cz.wz.marysidy.computers.Employee e1 does not have this computer c3
        System.out.println(e1);

        e1.removeComputer(4);  // computersList.size() = 2, so index 4 is`nt exist
        System.out.println(e1);
    }


}
