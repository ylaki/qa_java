package com.example;

public interface Felidae {
    void getKittens();
}

public class Feline implements Felidae {
    @Override
    public void getKittens(int kittensCount) {
        return kittensCount;
    }
}