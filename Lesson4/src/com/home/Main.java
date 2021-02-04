package com.home;

import com.home.model.Address;
import com.home.model.Person;


public class Main {


    public static void main(String[] args) {
        PersonRegistry registry;


        Person konstantin = new Person(25, "Konstantin", 179, 'm',
                "Повышенное давление, Склероз 2 ст.");
        Address konstantinsAddress = new Address("Belarus", "Vitebsk");
        konstantin.setAddress(konstantinsAddress);

        Person gleb = new Person(27, "Gleb", 190, 'm', "Отклонений не выявлено");
        Address glebsAddress = new Address("Belarus", "Vitebsk");
        gleb.setAddress(glebsAddress);

        Person vadim = new Person(17, "Vadim", 180, 'm', "Не годен по возрасту");
        Address vadimsAddress = new Address("Belarus", "Vitebsk");
        vadim.setAddress(vadimsAddress);

        Person oleg = new Person(20, "Oleg", 188, 'm', "Отклонений не выявлено");
        Address olegsAddress = new Address("Belarus", "Minsk");
        oleg.setAddress(olegsAddress);

        Person vito = new Person(24, "Vitaliy", 192, 'm',
                "Нарушения сердечного ритма 1 ст, повышенное давление");
        Address vitoAddress = new Address("Belarus", "Minsk");
        vito.setAddress(vitoAddress);

        Person sasha = new Person(33, "Aleksandr", 193, 'm', "Не годен по возрасту");
        Address sashaAddress = new Address("Belarus", "Minsk");
        sasha.setAddress(sashaAddress);

        Person elvira = new Person(23, "Elvira", 170, 'f', "Девочка");
        Address elviraAddress = new Address("Russia", "Pyatigorsk");
        elvira.setAddress(elviraAddress);

        Person alena = new Person(22, "Alena", 174, 'f', "Девочка");
        Address alenaAddress = new Address("Belarus", "Polotsk");
        alena.setAddress(alenaAddress);

        Person vlad = new Person(23, "Vlad", 174, 'm', "Ожирение 2 ст.");
        Address vladAddress = new Address("Belarus", "Minsk");
        vlad.setAddress(vladAddress);

        Person michael = new Person(37, "Mihail", 190, 'm', "Не годен по возрасту");
        Address michaelsAddress = new Address("Belarus", "Vitebsk");
        michael.setAddress(michaelsAddress);

        registry = new PersonRegistry(new Person[]{gleb, konstantin, oleg, vadim,
                vito, sasha, elvira, alena, vlad, michael});

        RecruitOffice office = new RecruitOffice(registry);

        office.gotoarmy();
    }

}