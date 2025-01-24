data class Ingredient(
    val name: String = "",
    val quantity: Double = 0.0,
    val unit: String = ""
) {
    fun getIngredients(recipe: Recipe): List<Ingredient> {
        return when (recipe.name) {
            "Spaghetti" -> listOf(
                Ingredient("Spaghetti noodles", 200.0, "grams"),
                Ingredient("Tomato sauce", 250.0, "ml"),
                Ingredient("Garlic", 2.0, "cloves"),
                Ingredient("Olive oil", 2.0, "tbsp"),
                Ingredient("Salt", 1.0, "tsp")
            )

            "Pancakes" -> listOf(
                Ingredient("Flour", 1.5, "cups"),
                Ingredient("Eggs", 2.0, "pieces"),
                Ingredient("Milk", 1.0, "cup"),
                Ingredient("Butter", 2.0, "tbsp"),
                Ingredient("Baking powder", 2.0, "tsp")
            )

            "Rachel's Perfectly Easy Chocolate Chip Cookies" -> listOf(
                Ingredient("Salted Softened Butter", 1.0, "cup"),
                Ingredient("Brown Sugar", 1.0, "cup"),
                Ingredient("Granulated Sugar", 0.5, "cup"),
                Ingredient("Eggs", 2.0, "pieces"),
                Ingredient("Vanilla extract", 2.0, "tsp"),
                Ingredient("Baking soda", 1.0, "tsp"),
                Ingredient("Salt", 0.5, "tsp"),
                Ingredient("All-purpose flour", 2.5, "cups"),
                Ingredient("Chocolate chips", 2.0, "cups")
            )

            "Mostaccioli" -> listOf(
                Ingredient("Uncooked mostaccioli", 1.0, "pound"),
                Ingredient("Bulk Italian sausage", 1.5, "pounds"),
                Ingredient("Meatless spaghetti sauce", 28.0, "ounces"),
                Ingredient("Egg", 1.0, "piece"),
                Ingredient("Ricotta cheese", 15.0, "ounces"),
                Ingredient("Shredded part-skim mozzarella cheese", 2.0, "cups"),
                Ingredient("Grated Romano cheese", 0.5, "cup")
            )

            "Vegetarian Mexican Casserole" -> listOf(
                Ingredient("Uncooked jasmine rice or white rice", 1.0, "cup"),
                Ingredient("Corn (can)", 15.0, "ounces"),
                Ingredient("Black beans (can)", 15.0, "ounces"),
                Ingredient("Salsa", 1.5, "cups"),
                Ingredient("Vegetable broth", 2.0, "cups"),
                Ingredient("Taco seasoning", 1.0, "tbsp"),
                Ingredient("Mexican style cheese", 1.5, "cups")
            )

            "Easy Fluffy Biscuits" -> listOf(
                Ingredient("All-purpose flour", 2.0, "cups"),
                Ingredient("Baking powder", 5.0, "tsp"),
                Ingredient("Baking soda", 0.25, "tsp"),
                Ingredient("Sugar", 1.0, "tbsp"),
                Ingredient("Fine sea salt", 1.0, "tsp"),
                Ingredient("Cold butter", 6.0, "tbsp"),
                Ingredient("Whole milk or buttermilk", 0.75, "cup"),
                Ingredient("Whole milk or buttermilk", 2.0, "tbsp")
            )

            "The Best Mashed Potatoes" -> listOf(
                Ingredient("Yukon Gold potatoes", 5.0, "pounds"),
                Ingredient("Parmesan cheese", 2.0, "cups"),
                Ingredient("Cream cheese", 1.5, "cups"),
                Ingredient("Chopped fresh chives", 1.0, "cup"),
                Ingredient("Butter", 0.5, "cup"),
                Ingredient("Garlic", 0.5, "head"),
                Ingredient("Salt", 1.0, "pinch"),
                Ingredient("Pepper", 1.0, "to taste")
            )

            "Perfectly Easy Homemade Waffle Recipe" -> listOf(
                Ingredient("All-purpose flour", 2.0, "cups"),
                Ingredient("Granulated sugar", 1.0, "tbsp"),
                Ingredient("Baking powder", 1.0, "tbsp"),
                Ingredient("Salt", 0.25, "tsp"),
                Ingredient("Buttermilk", 1.75, "cups"),
                Ingredient("Eggs", 2.0, "pieces"),
                Ingredient("Vanilla extract", 0.5, "tsp"),
                Ingredient("Melted butter", 0.5, "cup")
            )

            "Lentil Soup" -> listOf(
                Ingredient("Olive oil", 2.0, "tbsp"),
                Ingredient("Chopped onion", 1.0, "cup"),
                Ingredient("Chopped carrot", 0.5, "cup"),
                Ingredient("Chopped celery", 0.5, "cup"),
                Ingredient("Kosher salt", 2.0, "tsp"),
                Ingredient("Lentils (picked and rinsed)", 1.0, "pound"),
                Ingredient("Peeled and chopped tomatoes", 1.0, "cup"),
                Ingredient("Chicken or vegetable broth", 2.0, "quarts"),
                Ingredient("Freshly ground coriander", 0.5, "tsp"),
                Ingredient("Freshly ground toasted cumin", 0.5, "tsp"),
                Ingredient("Freshly ground grains of paradise", 0.5, "tsp")
            )
            else -> emptyList()
        }
    }
}
