package com.campusdual.classroom;

import java.util.Stack;

public class Exercise25 {
    public static Stack<String> createStack() {
        Stack<String> pila = new Stack<>();
        pila.push("Smith");
        pila.push("Montessori");
        pila.push("Peralta");
        pila.push("House");
        return pila;
    }

    public static void printAndEmptyStack(Stack<String> stack) {
            //stack.pop();
        for (int i = stack.size()-1; i > -1 ; i--) {
            System.out.print(stack.pop());
        }
    }

    public static void main(String[] args) {
        Stack<String> pila = new Stack<>();
        pila = createStack();
        printAndEmptyStack(pila);
    }



}
