package com.campusdual.classroom;

import java.util.Stack;

public class Exercise25 {
    public static Stack<String> createStack() {
        Stack<String> pila = new Stack<>();
        pila.push("House");
        pila.push("Peralta");
        pila.push("Montessori");
        pila.push("Smith");



        return pila;
    }

    public static void printAndEmptyStack(Stack<String> stack) {
        System.out.println("contenido "+ stack);
            //stack.pop();
        while (!stack.isEmpty()){
            System.out.println(stack.pop());

        }
    }

    public static void main(String[] args) {
        Stack<String> pila = new Stack<>();
        pila = createStack();
        printAndEmptyStack(pila);
    }



}
