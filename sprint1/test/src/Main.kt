//
//
////Data class for ingredients, includes name, quantity and unit if applicable
////This to line 9 might go away once we merge files together
//data class Ingredient(
//    val name: String,
//    val quantity: Double,
//    val unit: String
//)
//
////Basic recipe
//class Recipe(val name: String) {
//    private val ingredients = mutableListOf<Ingredient>()
//    //    add ingredient
//    fun addIngredient(name: String, quantity: Double, unit: String) {
//        ingredients.add(Ingredient(name, quantity, unit))
//    }
//    fun listIngredients() {
//        println("Ingredients for $name: ")
//        for ((index, ingredient) in ingredients.withIndex()) {
//            println("${index + 1}. ${ingredient.quantity} ${ingredient.unit} of ${ingredient.name}")
//        }
//    }
//}
//
//fun main() {
//    val recipe = Recipe("Butternut Squash Pasta")
//    recipe.addIngredient("Butternut Squash", 2.0, "Pound")
//    recipe.addIngredient("Apple Chicken Sausage", .75, "Pound")
//    recipe.addIngredient("Fettecuinne Pasta", 1.0, "Pound")
//    recipe.addIngredient("Half and Half", 1.0, "Cup")
//    recipe.addIngredient("Parmesean", 0.75, "Cup")
//    recipe.addIngredient("Pepper", 1.0, "Teaspoon")
//    recipe.addIngredient("Paprika", 1.5, "Teaspoon")
//
////    recipe.addIngredient("", , "")
//    recipe.listIngredients()
//}