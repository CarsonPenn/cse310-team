class Detail (
    private val author: String,
    private val instructions: List<String>,
    private val prepTime: String,
    private val cookTime: String,
    private val rating: Int = 0
) {
    fun displayRecipe() {
        println(
            "$author\n" +
            "$instructions\n" +
            "$prepTime\n" +
            "$cookTime\n" +
            "$rating"
        )
    }

}