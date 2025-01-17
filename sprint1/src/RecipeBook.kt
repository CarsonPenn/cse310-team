// Data class for individual ingredients
data class Ingredient(
    val name: String,
    val quantity: Double,
    val unit: String // e.g., "grams", "cups", "tablespoons"
)

// Recipe class that contains a list of ingredients
data class Recipe(
    val name: String,
    val detail: String,
    val ingredients: List<Ingredient> // List of ingredients for the recipe
)

fun RecipeBook() {
    // recipes with ingredients and a spot to add details
    val recipes = listOf(
        Recipe(

            name = "Classic Pancakes",
            detail = " yada yada",
            ingredients = listOf(
                Ingredient("Flour", 2.0, "cups"),
                Ingredient("Milk", 1.5, "cups"),
                Ingredient("Eggs", 2.0, "pieces"),
                Ingredient("Sugar", 2.0, "tablespoons"),
                Ingredient("Baking Powder", 1.0, "teaspoon"),
                Ingredient("Salt", 0.5, "teaspoon")
            )
        ),
        Recipe(
            name = "Spaghetti Bolognese",
            detail = " yada yada",
            ingredients = listOf(
                Ingredient("Spaghetti", 500.0, "grams"),
                Ingredient("Ground Beef", 250.0, "grams"),
                Ingredient("Tomato Sauce", 2.0, "cups"),
                Ingredient("Onion", 1.0, "piece"),
                Ingredient("Garlic", 3.0, "cloves"),
                Ingredient("Olive Oil", 2.0, "tablespoons"),
                Ingredient("Salt", 1.0, "teaspoon"),
                Ingredient("Black Pepper", 0.5, "teaspoon")
            )
        )
    )

    // Print the recipes and their ingredients
    for (recipe in recipes) {
        println("Recipe: ${recipe.name}")
        println("Ingredients:")
        for (ingredient in recipe.ingredients) {
            println("- ${ingredient.quantity} ${ingredient.unit} of ${ingredient.name}")
        }
        println()
    }
}



//add a section for details in the recipe