/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package chapter_03;

import java.util.LinkedList;

/**
 *
 * @author ugurdonmez
 */
class AnimalShelter {
    
    LinkedList<Dog> dogs;
    LinkedList<Cat> cats;
    
    int number = 0;
    
    public AnimalShelter() {
        dogs = new LinkedList<>();
        cats = new LinkedList<>();
    }
    
    public void enqueue(String name, int type) {
        number++;
        if (type == 1) {
            dogs.offer(new Dog(name, number));
        } else {
            cats.offer(new Cat(name, number));
        }
    }
    
    public Cat dequeueCat() {
        return cats.poll();
    }
    
    public Dog dequeueDog() {
        return dogs.poll();
    }
    
    public Animal dequeu() {
        if ( cats.peek().number < dogs.peek().number ) {
            return cats.poll();
        } else {
            return dogs.poll();
        }
    }
    
}

class Cat extends Animal{
    
    public Cat(String name, int number) {
        super(name, number);
    }
    
}

class Dog extends Animal{

    public Dog(String name, int number) {
        super(name, number);
    }
    
}

class Animal {
    String name;
    int number;

    public Animal(String name, int number) {
        this.name = name;
        this.number = number;
    }
}


public class Solution_06 {
    
}
