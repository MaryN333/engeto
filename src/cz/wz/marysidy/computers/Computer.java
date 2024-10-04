package cz.wz.marysidy.computers;

public class Computer {
    private String model;
    private double monitorDiagonal;
    private boolean isCompanyComputer;
    private double price;

    // Constructors
    public Computer(String model, double monitorDiagonal, boolean isCompanyComputer, double price) {
        this.model = model;
        this.monitorDiagonal = monitorDiagonal;
        this.isCompanyComputer = isCompanyComputer;
        this.price = price;
    }

    public Computer(String model, double monitorDiagonal, double price){
        this(model, monitorDiagonal,true,price);
    }

    public Computer(){
        this("MacBook Pro 14", 14.2, true, 59990);
    }

    // Getters and setters
    public String getModel() {
        return model;
    }

    public void setModel(String model) {
        this.model = model;
    }

    public double getMonitorDiagonal() {
        return monitorDiagonal;
    }

    public void setMonitorDiagonal(double monitorDiagonal) {
        this.monitorDiagonal = monitorDiagonal;
    }

    public boolean isCompanyComputer() {
        return isCompanyComputer;
    }

    public void setCompanyComputer(boolean companyComputer) {
        isCompanyComputer = companyComputer;
    }

    public double getPrice() {
        return price;
    }

    public void setPrice(double price) {
        this.price = price;
    }

    @Override
    public String toString() {
        return "cz.wz.marysidy.computers.Computer{" +
                "model='" + model + '\'' +
                ", monitorDiagonal=" + monitorDiagonal +
                ", isCompanyComputer=" + isCompanyComputer +
                ", price=" + price +
                '}';
    }
}
