package com.raddox7.praktikumpbo.pertemuan3.animal;


public class Main {
    // 'main' + [Tab]
    public static void main(String[] args) {
        // Membuat object dari class Animal
        Animal cat = new Animal("Miyu", 3, "Black");
        Animal dog = new Animal("Cheddar", 2, "Brown");
        Animal rabbit = new Animal();
        
        // Memanggil method
        cat.showProfile();
        dog.showProfile();
        rabbit.showProfile();
        
        // Demo Getter & Setter
        System.out.println("Dog's name (before): " + dog.getName());
        dog.setName("Blacky");
        System.out.println("Dog's name (after) : " + dog.getName());
    }
}
