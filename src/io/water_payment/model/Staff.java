package io.water_payment.model;

import java.util.Comparator;

public class Staff {
    private final String name;
    private final String surname;
    private final String patronymic;
    private final double balance;

    public Staff(final StaffBuilder staffBuilder) {
        this.name = staffBuilder.getName();
        this.surname = staffBuilder.getSurname();
        this.patronymic = staffBuilder.getPatronymic();
        this.balance = staffBuilder.getBalance();
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

    @Override
    public String toString() {

        return getSurname() + " " + getName() + " " + getPatronymic() + " внёс: " + getBalance() + " рублей";
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Staff staff = (Staff) o;
        return Double.compare(staff.balance, balance) == 0;
    }

    public static final Comparator<Staff> COMPARATOR_BY_BALACE = new Comparator<Staff>() {
        @Override
        public int compare(Staff o1, Staff o2) {
            return (int) (o1.getBalance() - o2.getBalance());
        }
    };

}