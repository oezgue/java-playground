package codeWars;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class PeteBaker {

    public static int cakes(Map<String, Integer> recipe, Map<String, Integer> available) {
        List<Integer> nums = new ArrayList<>();
        recipe.forEach((ingriedient, amount) ->
        {
            if (available.get(ingriedient) == null){
                nums.add(null);
            } else {
                nums.add(available.get(ingriedient) / amount);
            }
        });
        if (nums.contains(null)){
            return 0;
        }
        return nums.stream().min(Integer::compareTo).get();
    }

    public static void main(String[] args) {
        Map<String, Integer> recipe = new HashMap<>();
        recipe.put("flour", 500);
        recipe.put("sugar", 200);
        recipe.put("eggs", 1);

        Map<String, Integer> available = new HashMap<>();
        available.put("flour", 1200);
        available.put("sugar",1200);
        available.put("eggs", 5);
        available.put("milk", 200);

        System.out.println(cakes(recipe, available));
    }
}
