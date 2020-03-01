package kz.idrissov.pizzeria.action;

import kz.idrissov.pizzeria.entity.Pizza;
import kz.idrissov.pizzeria.valid.PizzaValidator;

public class PizzaAction {
    public void addNewIngredient(Pizza pz, String ingredient) {
        PizzaValidator isValid = new PizzaValidator();
        if(!isValid.checkIngredients(ingredient, pz)) {
            throw new IllegalArgumentException("Such ingredient cannot be added!");
        }

        String[] pizzaIngredients = pz.getIngredients();
        String[] newIngredients = new String[pizzaIngredients.length+1];
        System.arraycopy(pizzaIngredients, 0, newIngredients, 0, pizzaIngredients.length);
        newIngredients[pizzaIngredients.length] = ingredient;
        pz.setIngredients(newIngredients);
    }

    public void addNewPizza(Pizza pz, String name, String type, int amount, int clientId, int pizzaId) {
        PizzaValidator isValid = new PizzaValidator();

        if(!isValid.checkAmount(amount)) {
            throw new IllegalArgumentException("Not valid amount for " + name);
        }

        if(isValid.checkName(name)) {
            pz.setName(name);
        } else {
            pz.setName(clientId + "_" + pizzaId);
        }

        pz.setType(type);
        pz.setAmount(amount);

        Margarita whatPizza = new Margarita();
        pz.setIngredients(whatPizza.defaultIngredients(pz.getName()));
    }
}
