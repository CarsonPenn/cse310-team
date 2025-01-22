data class Detail(
    val prepTime: String,
    val cookTime: String,
    val totalTime: String,
    val glutenFree: Boolean,
    val vegan: Boolean
) {
    fun displayRecipeDetails(detail: Detail) {
        println("\nRecipe Details:")
        println("Preparation Time: ${detail.prepTime}")
        println("Cooking Time: ${detail.cookTime}")
        println("Total Time: ${detail.totalTime}")
        println("Gluten Free: ${if (detail.glutenFree) "Yes" else "No"}")
        println("Vegan: ${if (detail.vegan) "Yes" else "No"}")
    }
}
