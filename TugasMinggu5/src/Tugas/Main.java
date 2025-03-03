/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Tugas;

/**
 *
 * @author Hp
 */
public class Main {
    public static void main(String[] args) {
        Animal animal = new Animal();
        animal.makeNoise(); // Output: talk

        Dog dog = new Dog();
        dog.makeNoise(); // Output: Bark

        Animal animaldog = new Dog();
        animaldog.makeNoise(); // Output: Bark (karena method di-*override*)

        // Pengecekan instance
        if (animal instanceof Animal) {
            System.out.println("animal is Animal");
        }

        if (dog instanceof Animal) {
            System.out.println("dog is Animal");
        }

        if (animaldog instanceof Animal) {
            System.out.println("animaldog is Animal");
        }

        if (animal instanceof Dog) {  // Ini tidak akan pernah true karena animal adalah objek Animal, bukan Dog
            System.out.println("animal is Dog");
        }
    }
}

