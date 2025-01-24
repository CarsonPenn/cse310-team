data class Detail(
    val prepTime: Double,
    val cookTime: Double,
    val totalTime: Double,
    val glutenFree: Boolean,
    val vegan: Boolean,
    val servings: Int,
    val rating: Double,
    val author: String,
    val category: String
) {
    companion object {
        private val recipeDetails = mapOf(
            "Spaghetti" to Detail(
                prepTime = 15.0,
                cookTime = 20.0,
                totalTime = 35.0,
                glutenFree = false,
                vegan = false,
                servings = 4,
                rating = 4.5,
                author = "Chef John",
                category = "Main Course"
            ),
            "Pancakes" to Detail(
                prepTime = 10.0,
                cookTime = 15.0,
                totalTime = 25.0,
                glutenFree = false,
                vegan = false,
                servings = 4,
                rating = 4.7,
                author = "Baker Bob",
                category = "Breakfast"
            ),
            "Rachel's Perfectly Easy Chocolate Chip Cookies" to Detail(
                prepTime = 10.0,
                cookTime = 10.0,
                totalTime = 20.0,
                glutenFree = false,
                vegan = false,
                servings = 24,
                rating = 4.9,
                author = "Rachel Farnsworth",
                category = "Dessert"
            ),
            "Mostaccioli" to Detail(
                prepTime = 15.0,
                cookTime = 45.0,
                totalTime = 60.0,
                glutenFree = false,
                vegan = false,
                servings = 12,
                rating = 5.0,
                author = "Val Goodrich",
                category = "Pasta"
            ),
            "Vegetarian Mexican Casserole" to Detail(
                prepTime = 5.0,
                cookTime = 60.0,
                totalTime = 65.0,
                glutenFree = false,
                vegan = false,
                servings = 5,
                rating = 4.1,
                author = "Julia Pacheco",
                category = "Dinner"
            ),
            "Easy Fluffy Biscuits" to Detail(
                prepTime = 15.0,
                cookTime = 15.0,
                totalTime = 30.0,
                glutenFree = false,
                vegan = false,
                servings = 8,
                rating = 4.9,
                author = "Inspired Taste",
                category = "Bread"
            ),
            "The Best Mashed Potatoes" to Detail(
                prepTime = 5.0,
                cookTime = 15.0,
                totalTime = 20.0,
                glutenFree = true,
                vegan = false,
                servings = 12,
                rating = 4.9,
                author = "Christina C.",
                category = "Potato, Side Dish"
            ),
            "Perfectly Easy Homemade Waffle Recipe" to Detail(
                prepTime = 5.0,
                cookTime = 15.0,
                totalTime = 20.0,
                glutenFree = false,
                vegan = false,
                servings = 5,
                rating = 4.94,
                author = "Rachel Farnsworth",
                category = "Breakfast"
            ),
            "Lentil Soup" to Detail(
                prepTime = 30.0,
                cookTime = 45.0,
                totalTime = 75.0,
                glutenFree = false,
                vegan = false,
                servings = 8,
                rating = 5.0,
                author = "Alton Brown",
                category = "Dinner"
            )
        )

        fun getRecipeDetail(recipeName: String): Detail {
            return recipeDetails[recipeName] ?: Detail(
                prepTime = 0.0,
                cookTime = 0.0,
                totalTime = 0.0,
                glutenFree = false,
                vegan = false,
                servings = 0,
                rating = 0.0,
                author = "Unknown",
                category = "Unknown"
            )
        }
    }
}

fun displayRecipeDetails(detail: Detail) {
    println("\nRecipe Details:")
    println("Preparation Time: ${detail.prepTime} minutes")
    println("Cooking Time: ${detail.cookTime} minutes")
    println("Total Time: ${detail.totalTime} minutes")
    println("Gluten Free: ${if (detail.glutenFree) "Yes" else "No"}")
    println("Vegan: ${if (detail.vegan) "Yes" else "No"}")
    println("Servings: ${detail.servings}")
    println("Rating: ${detail.rating}")
    println("Author: ${detail.author}")
    println("Category: ${detail.category}")
}
