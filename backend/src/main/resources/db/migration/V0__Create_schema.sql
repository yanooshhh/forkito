-- Create tables with UUID primary keys

CREATE TABLE ingredient (
    id UUID PRIMARY KEY,
    name VARCHAR(255) NOT NULL,
    description TEXT,
    emoji VARCHAR(10),
    default_measurement_unit VARCHAR(50) NOT NULL
);

CREATE TABLE recipe (
    id UUID PRIMARY KEY,
    title VARCHAR(255) NOT NULL,
    description TEXT,
    difficulity VARCHAR(50) NOT NULL,
    meal_type VARCHAR(50) NOT NULL,
    instructions JSON NOT NULL
);

CREATE TABLE recipe_ingredient (
    id UUID PRIMARY KEY,
    recipe_id UUID NOT NULL,
    ingredient_id UUID NOT NULL,
    quantity DECIMAL(10,2) NOT NULL,
    measurement_unit VARCHAR(50) NOT NULL,
    FOREIGN KEY (recipe_id) REFERENCES recipe(id) ON DELETE CASCADE,
    FOREIGN KEY (ingredient_id) REFERENCES ingredient(id) ON DELETE CASCADE
);

-- Create indexes for better query performance
CREATE INDEX idx_recipe_ingredient_recipe_id ON recipe_ingredient(recipe_id);
CREATE INDEX idx_recipe_ingredient_ingredient_id ON recipe_ingredient(ingredient_id);
CREATE INDEX idx_recipe_meal_type ON recipe(meal_type);
CREATE INDEX idx_recipe_difficulity ON recipe(difficulity);
