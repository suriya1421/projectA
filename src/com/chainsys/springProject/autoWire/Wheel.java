package com.chainsys.springproject.autoWire;

public class Wheel {
    public void rotate() {
        System.out.println("Wheel rotating "+ hashCode());
    }
    public Wheel() {
        System.out.println("Wheel Object created "+ hashCode());
    }
}