class Recipe(
        private val name: String,
//        private val ingredient: Ingredient = Ingredient(),
//        private val Detail: Detail = Detail(),
        private val isGlutenFree: Boolean,
        private val isVegan: Boolean,

        ) {
    fun displayRecipe(){
            println("$name\n" +
//                    "$details\n" +
//                    "$ingredient\n" +
                    "$isGlutenFree\n" +
                    "$isVegan")
        }
}