/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Food;

import java.util.*;
import java.lang.*;
import java.io.*;

/**
 *
 * @author alistan
 */
class FoodFactory {

    public Food getFood(String food) {

        if ("Fastfood".equals(food)) {
            return new Fastfood();
        } else if ("Fruits".equals(food)) {
            return new Fruits();
        }
        throw new IllegalArgumentException("No food found with name " + food);
    }

}

class Fastfood extends Food {
}

class Fruits extends Food {
}

class Food {

    public void servesFood() {
        System.out.println("I'm serving " + getClass().getSimpleName());
    }
}

public class Solution {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) throws java.lang.Exception {
        FoodFactory myFoods = new FoodFactory();
        Food food1 = myFoods.getFood("Fastfood");
        Food food2 = myFoods.getFood("Fruits");
        System.out.println("My name is: " + food1.getClass().getSimpleName());
        System.out.println("My name is: " + food2.getClass().getSimpleName());
        System.out.println("Our superclass is: " + food1.getClass().getSuperclass().getSimpleName());
        food1.servesFood();
        food2.servesFood();

    }

}
