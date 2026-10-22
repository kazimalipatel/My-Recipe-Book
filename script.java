// Recipe Data

const recipes = {

    paneer: {
        title: "Paneer Butter Masala",

        description:
            "Tender paneer in a creamy tomato gravy, delicious with roti or naan.",

        time: "30 min",
        servings: "3 servings",
        difficulty: "Easy",

        image:
            "https://images.unsplash.com/photo-1631452180519-c014fe946bc7?auto=format&fit=crop&w=1200&q=85",

        ingredients: [
            ["250 g", "Paneer, cubed"],
            ["2", "Tomatoes"],
            ["1", "Onion, finely chopped"],
            ["1 tbsp", "Ginger-garlic paste"],
            ["2 tbsp", "Butter"],
            ["2 tbsp", "Cream"],
            ["1 tsp", "Garam masala"],
            ["To taste", "Salt and dried fenugreek"]
        ],

        instructions: [
            "Cook tomatoes and onion until soft, then blend into a smooth puree.",
            "Heat butter in a pan and saute the ginger-garlic paste.",
            "Add tomato puree, spices and salt. Cook for 8-10 minutes.",
            "Add paneer and a little water. Simmer for 4-5 minutes.",
            "Add cream and dried fenugreek.",
            "Serve hot with roti or naan."
        ],

        tip:
            "Crush dried fenugreek between your palms before adding it to release its aroma."
    },


    pulao: {
        title: "Vegetable Pulao",

        description:
            "A quick one-pot rice dish with colorful vegetables and fragrant spices.",

        time: "25 min",
        servings: "2-3 servings",
        difficulty: "Easy",

        image:
            "https://images.unsplash.com/photo-1596797038530-2c107229654b?auto=format&fit=crop&w=1200&q=85",

        ingredients: [
            ["1 cup", "Basmati rice"],
            ["1 cup", "Mixed vegetables"],
            ["1", "Onion, sliced"],
            ["1 tsp", "Cumin seeds"],
            ["1", "Bay leaf"],
            ["1 tbsp", "Ghee or oil"],
            ["2 cups", "Water"],
            ["To taste", "Salt and pulao spices"]
        ],

        instructions: [
            "Rinse the rice and soak it for 15 minutes.",
            "Heat ghee in a pan and add cumin and bay leaf.",
            "Add sliced onion and cook until golden.",
            "Add vegetables and spices.",
            "Add rice, water and salt.",
            "Cover and cook until the rice is tender.",
            "Fluff the rice and serve with raita."
        ],

        tip:
            "Soaking rice before cooking helps the grains become long and separate."
    },


    dosa: {
        title: "Masala Dosa",

        description:
            "Crispy dosa filled with spicy potatoes, served with chutney and sambar.",

        time: "35 min",
        servings: "3 dosas",
        difficulty: "Medium",

        image:
            "https://images.unsplash.com/photo-1668236543090-82eba5ee5976?auto=format&fit=crop&w=1200&q=85",

        ingredients: [
            ["2 cups", "Dosa batter"],
            ["3", "Boiled potatoes"],
            ["1", "Onion"],
            ["1 tsp", "Mustard seeds"],
            ["8-10", "Curry leaves"],
            ["1", "Green chili"],
            ["1/2 tsp", "Turmeric"],
            ["As needed", "Oil and salt"]
        ],

        instructions: [
            "Boil and mash the potatoes.",
            "Heat oil and crackle mustard seeds and curry leaves.",
            "Add onion, green chili, turmeric and potatoes.",
            "Cook the potato filling for a few minutes.",
            "Spread dosa batter on a hot pan.",
            "Cook until golden and crispy.",
            "Add potato filling, fold and serve with chutney."
        ],

        tip:
            "Keep the pan at medium-high heat so the dosa spreads easily and becomes crispy."
    },


    chole: {
        title: "Chole Masala",

        description:
            "Punjabi-style chickpeas cooked in a rich onion and tomato gravy.",

        time: "40 min",
        servings: "4 servings",
        difficulty: "Medium",

        image:
            "https://images.unsplash.com/photo-1626132647523-66f5bf380027?auto=format&fit=crop&w=1200&q=85",

        ingredients: [
            ["1.5 cups", "Cooked chickpeas"],
            ["2", "Tomatoes"],
            ["1", "Onion"],
            ["1 tbsp", "Ginger-garlic paste"],
            ["2 tsp", "Chole masala"],
            ["1/2 tsp", "Turmeric"],
            ["2 tbsp", "Oil"],
            ["To taste", "Salt and coriander"]
        ],

        instructions: [
            "Boil chickpeas until they are soft.",
            "Heat oil and saute onion until golden.",
            "Add ginger-garlic paste and cook for one minute.",
            "Add tomato puree and spices.",
            "Cook until the oil separates.",
            "Add chickpeas and a little water.",
            "Simmer for 15 minutes and garnish with coriander."
        ],

        tip:
            "Mash a few chickpeas into the gravy to make it naturally thicker."
    },


    paratha: {
        title: "Aloo Paratha",

        description:
            "Golden flatbread stuffed with seasoned potatoes and served with yogurt.",

        time: "30 min",
        servings: "4 parathas",
        difficulty: "Easy",

        image:
            "https://images.unsplash.com/photo-1601050690597-df0568f70950?auto=format&fit=crop&w=1200&q=85",

        ingredients: [
            ["2 cups", "Whole wheat flour"],
            ["3", "Boiled potatoes"],
            ["1", "Green chili"],
            ["2 tbsp", "Fresh coriander"],
            ["1/2 tsp", "Carom seeds"],
            ["1/2 tsp", "Red chili powder"],
            ["As needed", "Water"],
            ["As needed", "Ghee and salt"]
        ],

        instructions: [
            "Prepare a soft dough using wheat flour and water.",
            "Mash potatoes and mix with spices and coriander.",
            "Place potato filling inside a dough ball.",
            "Seal and roll into a round paratha.",
            "Cook on a hot tawa with ghee.",
            "Cook both sides until golden and crispy.",
            "Serve with yogurt or pickle."
        ],

        tip:
            "Keep the potato filling dry so the paratha is easier to roll."
    },


    dal: {
        title: "Dal Tadka",

        description:
            "Yellow lentils finished with aromatic garlic, cumin and chili tempering.",

        time: "30 min",
        servings: "3 servings",
        difficulty: "Easy",

        image:
            "https://images.unsplash.com/photo-1546833999-b9f581a1996d?auto=format&fit=crop&w=1200&q=85",

        ingredients: [
            ["1 cup", "Toor or moong dal"],
            ["1/2 tsp", "Turmeric"],
            ["1", "Tomato"],
            ["1 tsp", "Cumin seeds"],
            ["3 cloves", "Garlic"],
            ["2", "Dried red chilies"],
            ["1 tbsp", "Ghee"],
            ["To taste", "Salt and coriander"]
        ],

        instructions: [
            "Wash the dal and cook with turmeric, salt and water.",
            "Mash the cooked dal lightly.",
            "Add water to get your preferred consistency.",
            "Heat ghee in a small pan.",
            "Add cumin, garlic and dried chilies.",
            "Add tomato and cook until soft.",
            "Pour the tempering over the dal.",
            "Garnish with coriander and serve."
        ],

        tip:
            "Add the tempering just before serving to keep the garlic and cumin aroma fresh."
    }

};


// Open Recipe

function openRecipe(recipeName) {

    const recipe = recipes[recipeName];

    document.getElementById("recipeDetail").style.display = "block";

    document.getElementById("recipes").style.display = "none";

    document.getElementById("home").style.display = "none";

    document.getElementById("about").style.display = "none";

    document.getElementById("contact").style.display = "none";


    document.getElementById("detailImage").src =
        recipe.image;

    document.getElementById("detailTitle").textContent =
        recipe.title;

    document.getElementById("detailDescription").textContent =
        recipe.description;


    document.getElementById("detailMeta").textContent =
        "◷ " + recipe.time +
        "   |   ♜ " + recipe.servings +
        "   |   " + recipe.difficulty;


    const ingredientList =
        document.getElementById("ingredientsList");

    ingredientList.innerHTML = "";


    recipe.ingredients.forEach(function(item) {

        const li = document.createElement("li");

        li.innerHTML =
            "<strong>" + item[0] + "</strong>" +
            item[1];

        ingredientList.appendChild(li);

    });


    const instructionList =
        document.getElementById("instructionsList");

    instructionList.innerHTML = "";


    recipe.instructions.forEach(function(step) {

        const li = document.createElement("li");

        li.textContent = step;

        instructionList.appendChild(li);

    });


    document.getElementById("kitchenTip").textContent =
        recipe.tip;


    window.scrollTo({
        top: 0,
        behavior: "smooth"
    });
}


// Close Recipe

function closeRecipe() {

    document.getElementById("recipeDetail").style.display = "none";

    document.getElementById("recipes").style.display = "block";

    document.getElementById("home").style.display = "flex";

    document.getElementById("about").style.display = "block";

    document.getElementById("contact").style.display = "block";

    window.scrollTo({
        top: 0,
        behavior: "smooth"
    });
}


// Search Recipes

document
    .getElementById("searchInput")
    .addEventListener("input", function() {

        const searchValue =
            this.value.toLowerCase().trim();

        const cards =
            document.querySelectorAll(".recipe-card");

        let visibleRecipes = 0;


        cards.forEach(function(card) {

            const recipeName =
                card.querySelector("h3")
                    .textContent
                    .toLowerCase();

            const recipeDescription =
                card.querySelector("p")
                    .textContent
                    .toLowerCase();


            if (
                recipeName.includes(searchValue) ||
                recipeDescription.includes(searchValue)
            ) {

                card.style.display = "block";

                visibleRecipes++;

            } else {

                card.style.display = "none";

            }

        });


        document.getElementById("recipeCount")
            .textContent =
            visibleRecipes + " recipes";


        if (visibleRecipes === 0) {

            document.getElementById("noResults")
                .style.display = "block";

        } else {

            document.getElementById("noResults")
                .style.display = "none";

        }

    });


// Smooth Navigation

document.querySelectorAll("nav a").forEach(function(link) {

    link.addEventListener("click", function(event) {

        const targetId =
            this.getAttribute("href");

        if (targetId === "#home") {

            event.preventDefault();

            closeRecipe();

            document.getElementById("home")
                .scrollIntoView({
                    behavior: "smooth"
                });

        }

    });

});