'use client';

import { useState } from 'react';

interface Recipe {
  id: number;
  title: string;
  description: string;
  category: string;
  time: string;
  servings: number;
  difficulty: string;
  ingredients: string[];
  instructions: string[];
  image?: string;
}

const recipes: Recipe[] = [
  {
    id: 1,
    title: "Spaghetti Bolognese",
    description: "Classic Italian recipe for spaghetti with meat sauce.",
    category: "Italian",
    time: "45 min",
    servings: 4,
    difficulty: "Medium",
    ingredients: [
      "400g spaghetti pasta",
      "500g ground beef",
      "1 large onion, diced",
      "2 carrots, diced",
      "2 celery stalks, diced",
      "3 garlic cloves, minced",
      "400g canned tomatoes",
      "2 tbsp tomato paste",
      "1 cup red wine",
      "2 bay leaves",
      "Fresh basil",
      "Parmesan cheese",
      "Salt and pepper to taste"
    ],
    instructions: [
      "Heat olive oil in a large pan over medium heat.",
      "Add onion, carrots, and celery. Cook for 5 minutes until softened.",
      "Add garlic and cook for another minute.",
      "Add ground beef and cook until browned, breaking it up with a spoon.",
      "Pour in red wine and let it simmer for 2 minutes.",
      "Add canned tomatoes, tomato paste, and bay leaves.",
      "Season with salt and pepper. Simmer for 30 minutes.",
      "Meanwhile, cook spaghetti according to package instructions.",
      "Serve the sauce over pasta, garnished with fresh basil and Parmesan."
    ]
  },
  {
    id: 2,
    title: "Pork Schnitzel",
    description: "Traditional Polish schnitzel with potatoes and coleslaw.",
    category: "Polish",
    time: "30 min",
    servings: 2,
    difficulty: "Easy",
    ingredients: [
      "2 pork tenderloin cutlets",
      "2 eggs, beaten",
      "1 cup breadcrumbs",
      "1/2 cup flour",
      "4 medium potatoes",
      "1 small cabbage",
      "2 carrots",
      "Mayonnaise",
      "Vegetable oil for frying",
      "Salt and pepper"
    ],
    instructions: [
      "Pound the pork cutlets until thin and season with salt and pepper.",
      "Set up breading station: flour, beaten eggs, and breadcrumbs.",
      "Coat each cutlet in flour, then egg, then breadcrumbs.",
      "Heat oil in a large pan over medium-high heat.",
      "Fry schnitzels for 3-4 minutes on each side until golden brown.",
      "Boil potatoes until tender, about 20 minutes.",
      "Prepare coleslaw by shredding cabbage and carrots, mix with mayonnaise.",
      "Serve schnitzel with boiled potatoes and coleslaw."
    ]
  },
  {
    id: 3,
    title: "Caesar Salad",
    description: "Fresh lettuce with chicken and caesar dressing.",
    category: "Salad",
    time: "15 min",
    servings: 2,
    difficulty: "Easy",
    ingredients: [
      "1 large romaine lettuce head",
      "2 chicken breasts, grilled",
      "1/2 cup croutons",
      "1/4 cup Parmesan cheese, grated",
      "3 tbsp mayonnaise",
      "1 tbsp lemon juice",
      "1 tsp Worcestershire sauce",
      "1 garlic clove, minced",
      "2 anchovy fillets (optional)",
      "Black pepper"
    ],
    instructions: [
      "Wash and chop romaine lettuce into bite-sized pieces.",
      "Season and grill chicken breasts until cooked through. Slice thinly.",
      "Make dressing: mix mayonnaise, lemon juice, Worcestershire sauce, minced garlic, and anchovies.",
      "In a large bowl, toss lettuce with dressing.",
      "Add sliced chicken and croutons.",
      "Top with grated Parmesan cheese and black pepper.",
      "Serve immediately."
    ]
  }
];

export default function RecipeBasePage() {
  const [selectedRecipe, setSelectedRecipe] = useState<Recipe | null>(null);

  const openRecipe = (recipe: Recipe) => {
    setSelectedRecipe(recipe);
  };

  const closeRecipe = () => {
    setSelectedRecipe(null);
  };

  return (
    <div className="p-6">
      <h1 className="text-2xl font-bold text-gray-900 mb-4">Recipe base</h1>
      <p className="text-gray-600 mb-6">
        Manage your recipes, add new ones and organize them into categories.
      </p>
      
      <div className="grid grid-cols-1 md:grid-cols-2 lg:grid-cols-3 gap-4">
        {recipes.map((recipe) => (
          <div 
            key={recipe.id}
            onClick={() => openRecipe(recipe)}
            className="bg-white border border-gray-200 rounded-lg p-4 shadow-sm hover:shadow-md transition-shadow cursor-pointer"
          >
            <h3 className="font-semibold text-gray-900 mb-2">{recipe.title}</h3>
            <p className="text-gray-600 text-sm mb-3">{recipe.description}</p>
            <div className="flex gap-2">
              <span className="px-2 py-1 bg-teal-100 text-teal-800 text-xs rounded">{recipe.category}</span>
              <span className="px-2 py-1 bg-gray-100 text-gray-800 text-xs rounded">{recipe.time}</span>
            </div>
          </div>
        ))}
      </div>
      
      <button className="mt-6 bg-teal-600 text-white px-4 py-2 rounded-lg hover:bg-teal-700 transition-colors">
        Add new recipe
      </button>

      {/* Pop-up Modal */}
      {selectedRecipe && (
        <div 
          className="fixed inset-0 bg-black bg-opacity-40 backdrop-blur-sm flex items-center justify-center p-4 z-50"
          onClick={closeRecipe}
        >
          <div 
            className="bg-white rounded-xl max-w-2xl w-full max-h-[90vh] overflow-y-auto shadow-2xl border border-gray-200"
            onClick={(e) => e.stopPropagation()}
          >
            <div className="p-6">
              {/* Header */}
              <div className="flex justify-between items-start mb-4">
                <h2 className="text-2xl font-bold text-gray-900">{selectedRecipe.title}</h2>
                <button
                  onClick={closeRecipe}
                  className="text-gray-400 hover:text-gray-600 hover:bg-gray-100 rounded-full p-2 transition-colors"
                  title="Close"
                >
                  <svg className="w-5 h-5" fill="none" stroke="currentColor" viewBox="0 0 24 24">
                    <path strokeLinecap="round" strokeLinejoin="round" strokeWidth={2} d="M6 18L18 6M6 6l12 12" />
                  </svg>
                </button>
              </div>

              {/* Recipe Info */}
              <div className="grid grid-cols-2 md:grid-cols-4 gap-4 mb-6">
                <div className="text-center">
                  <div className="text-sm text-gray-600">Category</div>
                  <div className="font-semibold">{selectedRecipe.category}</div>
                </div>
                <div className="text-center">
                  <div className="text-sm text-gray-600">Time</div>
                  <div className="font-semibold">{selectedRecipe.time}</div>
                </div>
                <div className="text-center">
                  <div className="text-sm text-gray-600">Servings</div>
                  <div className="font-semibold">{selectedRecipe.servings}</div>
                </div>
                <div className="text-center">
                  <div className="text-sm text-gray-600">Difficulty</div>
                  <div className="font-semibold">{selectedRecipe.difficulty}</div>
                </div>
              </div>

              <p className="text-gray-600 mb-6">{selectedRecipe.description}</p>

              {/* Ingredients */}
              <div className="mb-6">
                <h3 className="text-lg font-semibold text-gray-900 mb-3">Ingredients</h3>
                <ul className="space-y-2">
                  {selectedRecipe.ingredients.map((ingredient, index) => (
                    <li key={index} className="flex items-center">
                      <span className="w-2 h-2 bg-teal-500 rounded-full mr-3"></span>
                      {ingredient}
                    </li>
                  ))}
                </ul>
              </div>

              {/* Instructions */}
              <div>
                <h3 className="text-lg font-semibold text-gray-900 mb-3">Instructions</h3>
                <ol className="space-y-3">
                  {selectedRecipe.instructions.map((instruction, index) => (
                    <li key={index} className="flex">
                      <span className="flex-shrink-0 w-6 h-6 bg-teal-500 text-white text-sm rounded-full flex items-center justify-center mr-3 mt-0.5">
                        {index + 1}
                      </span>
                      <span>{instruction}</span>
                    </li>
                  ))}
                </ol>
              </div>

              {/* Action Buttons */}
              <div className="flex gap-3 mt-6 pt-6 border-t">
                <button className="flex-1 bg-teal-600 text-white py-2 px-4 rounded-lg hover:bg-teal-700 transition-colors">
                  Add to Meal Plan
                </button>
                <button className="flex-1 bg-gray-200 text-gray-800 py-2 px-4 rounded-lg hover:bg-gray-300 transition-colors">
                  Edit Recipe
                </button>
                <button 
                  onClick={closeRecipe}
                  className="px-6 py-2 border border-gray-300 text-gray-700 rounded-lg hover:bg-gray-50 transition-colors"
                >
                  Close
                </button>
              </div>
            </div>
          </div>
        </div>
      )}
    </div>
  );
}
