package com.example;

import java.util.List;

public class Lion {

    boolean hasMane;

    public Lion(String sex) throws Exception {
        private Felidae felidae;
        public Lion(Felidae felidae) {
            this.felidae = felidae; // объект попадает в переменную класса
        }
        public void getKittens() {
            felidae.getKittens();
        }

        if ("Самец".equals(sex)) {
            hasMane = true;
        } else if ("Самка".equals(sex)) {
            hasMane = false;
        } else {
            throw new Exception("Используйте допустимые значения пола животного - самей или самка");
        }
    }

    Feline feline = new Feline();

    public boolean doesHaveMane() {
        return hasMane;
    }

    public List<String> getFood() throws Exception {
        return feline.getFood("Хищник");
    }
}