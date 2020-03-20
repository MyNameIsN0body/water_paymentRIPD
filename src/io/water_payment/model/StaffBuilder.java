package io.water_payment.model;

public class StaffBuilder {
    private String name;
    private String surname;
    private String patronymic;
    private double balance;

    public StaffBuilder name(final String name) {
        this.name = name;
        return this;
    }
    public StaffBuilder surname(final String surname){
        this.surname = surname;
        return this;
    }
    public StaffBuilder patronymic(final String patronymic) {
        this.patronymic = patronymic;
        return this;
    }
    public StaffBuilder balance(final double balance){
        this.balance = balance;
        return this;
    }
    public Staff build(){
        return new Staff(this);
    }

    public String getName() {
        return name;
    }

    public String getSurname() {
        return surname;
    }

    public String getPatronymic() {
        return patronymic;
    }

    public double getBalance() {
        return balance;
    }
}

