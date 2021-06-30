package com.platzi.functional._04_functional;

import java.util.function.Function;
import java.util.function.Predicate;

public class MathFunctions {
    public static void main(String[] args) {
        Function<Integer, Integer> squareFunction =
                new Function<Integer, Integer>() {
                    @Override
                    public Integer apply(Integer x) {
                        return x * x;
                    }
                };
        System.out.println(squareFunction.apply(5));
        System.out.println(squareFunction.apply(25));

        Function<Integer, Boolean> isOdd = x -> x % 2 == 1;  // las funciones reciben un tipo de dato y retornan otro tipo de dato

        Predicate<Integer> isEven = x -> x % 2 == 0; //los predicate sirven para hacer validaciones rapidas
        // pero en palabras formales Un Predicado es un interface funcional que define una condición que un objeto determinado debe cumplir.

        isEven.test(4); //true

        Predicate<Student> isApproved = student -> student.getCalificacion() >= 6.0;

        Student sinuhe = new Student(5.9);
        System.out.println(isApproved.test(sinuhe)); //false
    }

    static class Student {
        private double calificacion;

        public Student(double calificacion){
            this.calificacion = calificacion;
        }

        public double getCalificacion() {
            return calificacion;
        }
    }
}
