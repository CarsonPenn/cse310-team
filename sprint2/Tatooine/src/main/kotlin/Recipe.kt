data class Recipe(val name: String)

class RecipesList {
    fun getRecipesList(): List<Recipe> {
        return listOf(
            Recipe("Spaghetti"),
            Recipe("Pancakes"),
            Recipe("Rachel's Perfectly Easy Chocolate Chip Cookies"),
            Recipe("Mostaccioli"),
            Recipe("Vegetarian Mexican Casserole"),
            Recipe("Easy Fluffy Biscuits"),
            Recipe("The Best Mashed Potatoes"),
            Recipe("Perfectly Easy Homemade Waffle Recipe"),
            Recipe("Lentil Soup")
        )
    }
}
