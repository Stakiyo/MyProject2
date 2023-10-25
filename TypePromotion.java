package com.javaprograms;
public class TypePromotion {
    void disp(byte b) {
        System.out.println("byte value=" + b);
    }

    void disp(short b) {

        System.out.println("short value=" + b);
    }

    void disp(int b) {
        System.out.println("int value=" + b);
    }

    void disp(long b) {
        System.out.println("long value=" + b);
    }

    void disp(float b) {

        System.out.println("float value=" + b);
    }

    void disp(double b) {

        System.out.println("double value=" + b);
    }

    void disp(char b) {
        System.out.println("char value=" + b);
    }

    void disp(boolean b) {
        System.out.println("boolean value=" + b);
    }

    public static void main(String args[])
    {
        TypePromotion t = new TypePromotion();
        t.disp(12L);
    }
}