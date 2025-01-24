fun main() {
    val recipesList = RecipesList()
    val recipes = recipesList.getRecipesList()

    var continueProgram = true

    while (continueProgram) {
        println("Welcome to the Recipe Book!")
        println("Choose a recipe by entering the number, or enter 0 to quit:")

        // Display the recipe list
        recipes.forEachIndexed { index, recipe ->
            println("${index + 1}. ${recipe.name}")
        }

        // Get user's choice
        val choice = readlnOrNull()?.toIntOrNull()

        if (choice == 0) {
            println("Thank you for using the Recipe Book. Goodbye!")
            continueProgram = false
        } else if (choice != null && choice in 1..recipes.size) {
            val selectedRecipe = recipes[choice - 1]
            val ingredients = Ingredient().getIngredients(selectedRecipe)
            val instructions = Instructions().getInstructions(selectedRecipe)

            println("\nRecipe: ${selectedRecipe.name}")

            // Fetch and display recipe details
            val details = Detail.getRecipeDetail(selectedRecipe.name)
            println("\nDetails:")
            println("- Category: ${details.category}")
            println("- Rating: ${details.rating}")
            println("- Preparation Time: ${details.prepTime} minutes")
            println("- Cooking Time: ${details.cookTime} minutes")
            println("- Total Time: ${details.totalTime} minutes")
            println("- Gluten Free: ${if (details.glutenFree) "Yes" else "No"}")
            println("- Vegan: ${if (details.vegan) "Yes" else "No"}")

            println("\nIngredients:")
            ingredients.forEach {
                println("- ${it.quantity} ${it.unit} of ${it.name}")
            }

            println("\nInstructions:")
            instructions.forEach { println(it) }

            println("\nPress Enter to return to the main menu.")
            readlnOrNull()
        } else {
            println("Invalid choice, please try again.")
        }
    }
}


//
