package io.water_payment;

import java.util.List;
import java.util.ArrayList;
import java.util.Collections;

import io.water_payment.model.Account;
import io.water_payment.model.Staff;
import io.water_payment.model.StaffBuilder;

public class Main {
    public static void main(String[] args) {
        final Staff Anton = new StaffBuilder().name("Anton").surname("Petrov").patronymic("Petrovich").balance(800).build();
        final Staff Pavel = new StaffBuilder().name("Pavel").surname("Ivanov").patronymic("Petrovich").balance(545).build();
        final Staff Salih = new StaffBuilder().name("Salih").surname("Semenov").patronymic("Semenovich").balance(550).build();
        final Staff Alex = new StaffBuilder().name("Alex").surname("Bim").patronymic("Mihailovich").balance(550).build();
        final Staff Andrey = new StaffBuilder().name("Andrey").surname("Bim").patronymic("Mihailovich").balance(550).build();


        List listStaff = new ArrayList();
        listStaff.add(Anton);
        listStaff.add(Pavel);
        listStaff.add(Salih);
        listStaff.add(Alex);
        listStaff.add(Andrey);

        for (Object s: listStaff) {
            System.out.println(s);
        }

        Collections.sort(listStaff, Staff.COMPARATOR_BY_BALACE);

        System.out.println("+++=============================+++");
        for (Object s: listStaff) {
            System.out.println(s);
        }
        Account myAcc = new Account(45);
        System.out.println(myAcc.getBalance());
        myAcc.deposit(100);
        System.out.println(myAcc.getBalance());
        myAcc.withdraw(146);
        System.out.println(myAcc.getBalance());
    }

}