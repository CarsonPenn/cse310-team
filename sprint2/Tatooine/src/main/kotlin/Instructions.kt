class Instructions {
    fun getInstructions(recipe: Recipe): List<String> {
        return when (recipe.name) {
            "Spaghetti" -> listOf(
                "1. Boil water and cook the spaghetti.",
                "2. In a pan, sauté garlic in olive oil.",
                "3. Add tomato sauce and simmer.",
                "4. Toss cooked spaghetti in the sauce."
            )

            "Pancakes" -> listOf(
                "1. Mix all ingredients in a bowl.",
                "2. Heat a skillet over medium heat.",
                "3. Pour batter into the skillet.",
                "4. Flip when bubbles form and cook until golden brown."
            )

            "Rachel's Perfectly Easy Chocolate Chip Cookies" -> listOf(
                "1. Preheat oven to 350 degrees. Lightly grease two baking sheets with nonstick cooking spray or line with parchment paper.",
                "2. In a large bowl, use a hand mixer to cream together butter, brown sugar, and white sugar.",
                "3. Add in eggs and vanilla and beat until smooth.",
                "4. Stir in baking soda, salt, and flour and mix until it forms a nice dough. Stir in chocolate chips with a spoon.",
                "5. Take two tablespoons of dough and use your hands to quickly shape into a dough ball and place on the prepared cookie sheets, twelve cookies per pan. This recipe makes 24 cookies.",
                "6. Bake in the preheated oven for 10-12 minutes, until just kissed with brown. Do not over bake.",
                "7. Remove pan from oven and let the cookies cool on the pan for 3 to 5 minutes, then transfer to a wire rack to cool completely. Once cooled store in an airtight container."
            )

            "Mostaccioli" -> listOf(
                "1. Cook pasta according to package directions; drain. Crumble sausage into a Dutch oven. Cook over medium heat until no longer pink; drain. Stir in spaghetti sauce and pasta. In a large bowl, combine egg, ricotta cheese and mozzarella cheese.",
                "2. Spoon half the pasta mixture into a greased shallow 3-qt. baking dish; layer with cheese mixture and remaining pasta mixture. ",
                "3. Cover and bake at 375° for 40 minutes or until a thermometer reads 160°. Uncover; top with Romano cheese. Bake 5 minutes longer or until heated through."
            )

            "Vegetarian Mexican Casserole" -> listOf(
                "1. Preheat oven to 375℉.",
                "2. Grease a 9×13 baking dish with non-stick spray.",
                "3. Directly into the baking dish, add the rice, black beans, salsa, vegetable broth, taco seasoning and 1/2 cup of cheese.",
                "4. Stir to combine the ingredients and cover with foil. Bake for 50 minutes. Remove from the oven, discard the foil, and stir the ingredients around in the baking dish. Top with the remaining cheese. Bake for an additional 12 minutes, uncovered, or until the cheese is melted. Top with your favorite toppings and enjoy!"
            )

            "Easy Fluffy Biscuits" -> listOf(
                "1. Heat the oven to 425°F (218°C) and set aside an oven-safe 10-inch or 12-inch skillet like a cast iron pan or, if you do not have one, set aside a baking sheet instead.",
                "2. Combine the flour, baking powder, baking soda, sugar, and salt in the bowl of a food processor. Pulse three to four times so that it is mixed. Cut the cold butter into cubes or thin slices, then scatter it over the flour in the food processor. Pulse 5 to 7 times or until the butter turns into tiny bits.",
                "3. Empty the butter-flour mixture into a large bowl. Make a well in the middle, and then pour in the milk (or buttermilk). Stir until a shaggy dough forms.",
                "4. Transfer the dough onto a lightly floured work surface. Sprinkle a little flour on top, and then bring the dough together with your hands. It might be a bit sticky, so add flour as needed.",
                "5. Without working the dough too much, pat it down into a rectangle about 3/4 inch thick. Fold the dough into thirds, like a letter. Rotate the rectangle 90 degrees, and then repeat this process two more times.",
                "6. Pat the dough into a rectangle between 1/2 inch and 3/4 inch thick. Then use a biscuit cutter to cut out your biscuits — we use a 3-inch round cutter. Do not twist the cutter, as this will seal the edges of the biscuits and prevent them from rising.",
                "7. Place the cut-out biscuits into the skillet (or onto a baking sheet). Keeping them close to each other helps them rise.",
                "8. Gently press together the scraps and use them to make more biscuits, but be careful not to overwork the dough, or else they will be tough.",
                "9. Bake the biscuits until golden brown and have risen, 10 to 15 minutes. Serve warm."
            )

            "The Best Mashed Potatoes" -> listOf(
                "1. Gather all ingredients.",
                "2. Peel and quarter potatoes; place in a large pot. Cover with salted water and bring to a boil. Cook until tender but still firm, about 15 minutes.\n",
                "3. Drain and return potatoes to the pot over low heat to dry for 1 to 2 minutes.",
                "4. Add Parmesan cheese, cream cheese, chives, butter, garlic, salt, and pepper.",
                "5. Use a potato masher to mash until smooth and serve.",
                "6. Serve hot and enjoy."
            )

            "Perfectly Easy Homemade Waffle Recipe" -> listOf(
                "1. Reheat a waffle iron.",
                "2. In a large bowl, combine the flour, sugar, baking powder, and salt. Stir.",
                "3. Add the buttermilk, eggs, vanilla extract, and melted butter. Stir until well combined.",
                "4. Add 1/2 cup of the batter to the preheated waffle maker for a Belgian-style waffle or add 1/3 cup of the batter to the waffle maker for an American-style waffle. The amount of batter you use will vary based on the size of the waffle iron.",
                "5. Serve the waffles hot topped with warm syrup or fresh berries and whipped cream"
            )

            "Lentil Soup" -> listOf(
                "1. Place the olive oil into a large 6-quart Dutch oven and set over medium heat.",
                "2. Once hot, add the onion, carrot, celery and salt and sweat until the onions are translucent, approximately 6 to 7 minutes.",
                "3. Add the lentils, tomatoes, broth, coriander, cumin and grains of paradise and stir to combine.",
                "4. Increase the heat to high and bring just to a boil. Reduce the heat to low, cover and cook at a low simmer until the lentils are tender, approximately 35 to 40 minutes.",
                "5. Using a stick blender, puree to your preferred consistency. Serve immediately.",
            )
            else -> listOf("Instructions not available.")
        }
    }
}
