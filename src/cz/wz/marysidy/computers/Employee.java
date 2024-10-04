package cz.wz.marysidy.computers;

import java.time.LocalDate;
import java.util.ArrayList;
import java.util.List;

public class Employee {
    private String name;
    private LocalDate birth;
    List<Computer> computers = new ArrayList<>();

    // Constructor
    public Employee(String name, LocalDate birth) {
        this.name = name;
        this.birth = birth;
//        this.computers = new ArrayList<>();
    }

    // Getters and Setters
    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public LocalDate getBirth() {
        return birth;
    }

    public void setBirth(LocalDate birth) {
        this.birth = birth;
    }

    public List<Computer> getComputers() {
        // Vrátíme kopii seznamu.
        // Pokud následně někdo v kopii provede změny, neovlivní tím náš seznam.
        return new ArrayList<>(computers);
    }

    public void addComputer(Computer computer) {
        computers.add(computer);
    }

    public void removeComputer(Computer computer){
        if(!computers.contains(computer)){
            System.out.println("There is nothing to remove");
        } else {
        computers.remove(computer);
        }
    }
    public void removeComputer(int index){
        if(computers.size() >= index){
            computers.remove(index);
        } else{
            System.out.println("There is nothing to remove");
        }
    }

    @Override
    public String toString() {
        return "cz.wz.marysidy.computers.Employee{" +
                "name='" + name + '\'' +
                ", birth=" + birth +
                ", computers=" + computers +
                '}';
    }
}
