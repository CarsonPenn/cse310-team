//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
class Recipe {
    var name: String = "Recipe Name"
    var directions: String = "These are directions"
}
class UserInterface(var recipe: Recipe) {
    var recipeName: String = recipe.name;
    var recipeDirections: String = recipe.directions;
//    var recipe = Recipe()

    // display a single recipe
    fun displayRecipe() {
        println("Recipe Name: $recipeName")
        println("Recipe Directions: $recipeDirections")
    }
    // display the names of all the recipes
    fun displayAllRecipeNames() {

    }
    // search for a given recipe
    fun search() {

    }
}
fun main() {
    var recipe = Recipe()
    var userInterface = UserInterface(recipe)
    userInterface.displayRecipe()
}