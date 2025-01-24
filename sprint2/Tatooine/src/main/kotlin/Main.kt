fun main() {
    val recipesList = RecipesList()
    val recipes = recipesList.getRecipesList()

    var continueProgram = true

    while (continueProgram) {
        println("Welcome to the Recipe Book!")
        println("Choose a recipe by entering the number, or enter 0 to quit:")

        // Display the recipe list
        recipes.forEachIndexed { index, recipe ->
            println("${index + 1}. ${recipe.name}") // Assuming Recipe has a 'name' property
        }

        // Get user's choice
        val choice = readlnOrNull()?.toIntOrNull()

        if (choice == 0) {
            println("Thank you for using the Recipe Book. Goodbye!")
            continueProgram = false
        } else if (choice in 1..recipes.size) {
            val selectedRecipe = recipes[choice!! - 1]
            val ingredient = Ingredient()
            val instruction = Instructions()
            val ingredients = ingredient.getIngredients(selectedRecipe) // Pass the Recipe object
            val instructions = instruction.getInstructions(selectedRecipe) // Pass the Recipe object

            println("\nRecipe: ${selectedRecipe.name}") // Assuming Recipe has a 'name' property

            // Fetch and display recipe details
            val details = Detail.getRecipeDetail(selectedRecipe.name) // Pass the recipe name as a String
            if (details != null) {
                println("\nDetails:")
                println("- Category: ${details.category}")
                println("- Rating: ${details.rating}")
                println("- Preparation Time: ${details.prepTime} minutes")
                println("- Cooking Time: ${details.cookTime} minutes")
                println("- Total Time: ${details.totalTime} minutes")
                println("- Gluten Free: ${if (details.glutenFree) "Yes" else "No"}")
                println("- Vegan: ${if (details.vegan) "Yes" else "No"}")
            } else {
                println("No details available for this recipe.")
            }

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
