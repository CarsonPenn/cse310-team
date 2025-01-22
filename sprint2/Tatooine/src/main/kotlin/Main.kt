fun main() {
    var recipesList = RecipesList()
    val recipes = recipesList.getRecipesList()

    var continueProgram = true

    while (continueProgram) {
        println("Welcome to the Recipe Book!")
        println("Choose a recipe by entering the number, or enter 0 to quit:")

        // Display the recipe list
        recipes.forEachIndexed { index, recipe ->
            println("${index + 1}. $recipe")
        }

        // Get user's choice
        val choice = readlnOrNull()?.toIntOrNull()

        if (choice == 0) {
            println("Thank you for using the Recipe Book. Goodbye!")
            continueProgram = false
        } else if (choice in 1..recipes.size) {
            val selectedRecipe = recipes[choice!! - 1]
            var ingredient = Ingredient()
            var instruction = Instructions()
            val ingredients = ingredient.getIngredients(selectedRecipe)
            val instructions = instruction.getInstructions(selectedRecipe)

            println("\nRecipe: $selectedRecipe")
            print("\nDetail:")
            println("\nIngredients:")
            ingredients.forEach {
                println("- ${it.quantity} ${it.unit} of ${it.name}")
            }

            println("\nInstructions:")
            instructions.forEach { println(it) }

            // Prompt to return to the main menu
            println("\nPress Enter to return to the main menu.")
            readlnOrNull() // Wait for the user to press Enter
        } else {
            println("Invalid choice, please try again.")
        }
    }
}
