-- Insert test ingredients with proper UUID v4
INSERT INTO ingredient (id, name, description, emoji, default_measurement_unit) VALUES
('8f7e6d5c-4b3a-4829-9e8d-7c6b5a493827', 'Wheat flour', 'All-purpose wheat flour type 500', '🌾', 'GRAMS'),
('a3b7c9e1-2f4d-4856-b7c9-e1a3b7c9e1a3', 'Eggs', 'Fresh chicken eggs', '🥚', 'PIECES'),
('f4a8b2c6-9d7e-4123-a5f8-b2c6d9e7f4a8', 'Milk', 'Whole milk 3.2%', '🥛', 'MILLILITERS'),
('2e9f7a3b-5c8d-4967-8f2e-9a3b5c8d4967', 'Butter', 'Salted butter', '🧈', 'GRAMS'),
('d6b9e4f7-1a2c-4358-9d6b-e4f71a2c5893', 'Sugar', 'White granulated sugar', '🍯', 'GRAMS'),
('7c2a5f8b-3e9d-4671-a7c2-5f8b3e9d6714', 'Salt', 'Table salt', '🧂', 'TEASPOONS'),
('b5e8a1d4-7f2c-4952-8b5e-a1d47f2c9528', 'Baking powder', 'Baking powder', '🧁', 'TEASPOONS'),
('9a4d7b2e-5f8c-4163-a9d7-b2e5f8c14639', 'Vanilla', 'Vanilla extract', '🌿', 'TEASPOONS'),
('e3f6a9c2-8b1d-4574-f3e6-a9c28b1d5748', 'Tomatoes', 'Fresh tomatoes', '🍅', 'PIECES'),
('c8b5f2a9-4e7d-4385-b8c5-f2a94e7d3856', 'Onion', 'Yellow onion', '🧅', 'PIECES'),
('6d9a3f7b-2c5e-4196-d9a3-f7b2c5e19647', 'Garlic', 'Fresh garlic', '🧄', 'PIECES'),
('a1e4b7c9-6f2d-4527-e4a1-b7c96f2d5283', 'Olive oil', 'Extra virgin olive oil', '🫒', 'TABLESPOONS'),
('f7c2a8d5-9e3b-4614-c2f7-a8d59e3b6179', 'Chicken breast', 'Chicken breast fillet', '🐔', 'GRAMS'),
('3b6f9a2d-7c4e-4825-6f3b-9a2d7c4e8254', 'Rice', 'Jasmine rice', '🍚', 'GRAMS'),
('d4a7c1f8-5b9e-4372-a7d4-c1f85b9e3721', 'Bell pepper', 'Red bell pepper', '🌶️', 'PIECES'),
('8e1b4f7a-3d6c-4549-1b8e-4f7a3d6c5498', 'Mozzarella cheese', 'Fresh mozzarella cheese', '🧀', 'GRAMS'),
('c5f8b2e9-6a3d-4736-f8c5-b2e96a3d7364', 'Basil', 'Fresh basil leaves', '🌿', 'GRAMS'),
('9d2f5a8c-4e7b-4127-2f9d-5a8c4e7b1275', 'Spaghetti', 'Spaghetti pasta', '🍝', 'GRAMS'),
('e6a9d3f7-8c1b-4514-a9e6-d3f78c1b5142', 'Bacon', 'Smoked bacon', '🥓', 'GRAMS'),
('b3c6f9a1-5d8e-4921-c6b3-f9a15d8e2918', 'Parmesan cheese', 'Grated parmesan cheese', '🧀', 'GRAMS'),
('7f1a4d8b-2e5c-4638-1a7f-4d8b2e5c6385', 'Heavy cream', 'Heavy cream 30%', '🥛', 'MILLILITERS'),
('a8e2b5f9-7d4c-4865-e2a8-b5f97d4c8651', 'Potatoes', 'Young potatoes', '🥔', 'GRAMS'),
('f2d5a8e1-9c6b-4192-d5f2-a8e19c6b4129', 'Carrots', 'Fresh carrots', '🥕', 'PIECES'),
('5c8f2a6d-3e9b-4417-8f5c-2a6d3e9b4174', 'Broccoli', 'Fresh broccoli', '🥦', 'GRAMS'),
('d9b3f6a2-8c5e-4724-b3d9-f6a28c5e7241', 'Salmon', 'Salmon fillet', '🐟', 'GRAMS');

-- Insert test recipes with proper UUID v4
INSERT INTO recipe (id, title, description, difficulity, meal_type, instructions) VALUES
('4a7d2f8e-9c1b-4563-a7d2-f8e9c1b45638', 'Basic Pancakes', 'Classic pancakes for sweet or savory toppings', 'EASY', 'BREAKFAST',
'[
  {"stepNumber": 1, "instruction": "In a bowl, mix flour with salt"},
  {"stepNumber": 2, "instruction": "Add eggs and milk, whisk until smooth batter forms"},
  {"stepNumber": 3, "instruction": "Let batter rest in refrigerator for 30 minutes"},
  {"stepNumber": 4, "instruction": "Heat pan with a little butter"},
  {"stepNumber": 5, "instruction": "Pour thin layer of batter and fry on both sides until golden"}
]'),

('e3c8a5f2-6d9b-4174-c8e3-a5f26d9b4175', 'Spaghetti Carbonara', 'Classic Italian carbonara pasta', 'MEDIUM', 'DINNER',
'[
  {"stepNumber": 1, "instruction": "Cook spaghetti al dente according to package instructions"},
  {"stepNumber": 2, "instruction": "Cut bacon into cubes and fry in a pan"},
  {"stepNumber": 3, "instruction": "In a bowl, mix eggs with grated parmesan"},
  {"stepNumber": 4, "instruction": "Drain pasta, reserving cooking water"},
  {"stepNumber": 5, "instruction": "Mix hot pasta with egg mixture and bacon"},
  {"stepNumber": 6, "instruction": "Add a little pasta water if needed"},
  {"stepNumber": 7, "instruction": "Serve immediately with extra parmesan"}
]'),

('b6f9c2a5-8e3d-4627-f9b6-c2a58e3d4628', 'Chicken in Tomato Sauce', 'Juicy chicken braised in aromatic sauce', 'MEDIUM', 'DINNER',
'[
  {"stepNumber": 1, "instruction": "Cut chicken into cubes and season with salt"},
  {"stepNumber": 2, "instruction": "Fry chicken in olive oil until golden"},
  {"stepNumber": 3, "instruction": "Add chopped onion and garlic, cook for 2 minutes"},
  {"stepNumber": 4, "instruction": "Add chopped tomatoes and bell pepper"},
  {"stepNumber": 5, "instruction": "Simmer covered for 20 minutes"},
  {"stepNumber": 6, "instruction": "Serve with rice or potatoes"}
]'),

('8a4e7b1f-5c9d-4382-4e8a-7b1f5c9d3829', 'Baked Salmon with Vegetables', 'Healthy dinner with baked salmon', 'EASY', 'DINNER',
'[
  {"stepNumber": 1, "instruction": "Preheat oven to 200°C"},
  {"stepNumber": 2, "instruction": "Cut potatoes and carrots into pieces"},
  {"stepNumber": 3, "instruction": "Mix vegetables with olive oil, salt and seasonings"},
  {"stepNumber": 4, "instruction": "Bake vegetables for 25 minutes"},
  {"stepNumber": 5, "instruction": "Add salmon and broccoli, bake for another 15 minutes"},
  {"stepNumber": 6, "instruction": "Serve with lemon"}
]'),

('f1d8b4c7-2a6e-4593-d8f1-b4c72a6e5931', 'Mozzarella with Tomato', 'Quick caprese-style snack', 'EASY', 'SNACK',
'[
  {"stepNumber": 1, "instruction": "Slice tomatoes and mozzarella"},
  {"stepNumber": 2, "instruction": "Arrange cheese and tomato slices alternately"},
  {"stepNumber": 3, "instruction": "Drizzle with olive oil"},
  {"stepNumber": 4, "instruction": "Sprinkle with fresh basil and salt"},
  {"stepNumber": 5, "instruction": "Serve immediately"}
]');

-- Insert recipe ingredients relationships with proper UUID v4
-- Basic Pancakes
INSERT INTO recipe_ingredient (id, recipe_id, ingredient_id, quantity, measurement_unit) VALUES
('7e2a5d8c-3f6b-4194-2a7e-5d8c3f6b9147', '4a7d2f8e-9c1b-4563-a7d2-f8e9c1b45638', '8f7e6d5c-4b3a-4829-9e8d-7c6b5a493827', 200, 'GRAMS'),     -- wheat flour
('a5c8f1d4-7b2e-4658-c8a5-f1d47b2e5869', '4a7d2f8e-9c1b-4563-a7d2-f8e9c1b45638', 'a3b7c9e1-2f4d-4856-b7c9-e1a3b7c9e1a3', 3, 'PIECES'),      -- eggs
('d2f5a8c1-6e9b-4375-f5d2-a8c16e9b3752', '4a7d2f8e-9c1b-4563-a7d2-f8e9c1b45638', 'f4a8b2c6-9d7e-4123-a5f8-b2c6d9e7f4a8', 500, 'MILLILITERS'), -- milk
('b8e1f4a7-3d6c-4529-e1b8-f4a73d6c2594', '4a7d2f8e-9c1b-4563-a7d2-f8e9c1b45638', '2e9f7a3b-5c8d-4967-8f2e-9a3b5c8d4967', 30, 'GRAMS'),      -- butter
('c6a9d2f5-8e3b-4716-a9c6-d2f58e3b7164', '4a7d2f8e-9c1b-4563-a7d2-f8e9c1b45638', '7c2a5f8b-3e9d-4671-a7c2-5f8b3e9d6714', 0.5, 'TEASPOONS'); -- salt

-- Spaghetti Carbonara
INSERT INTO recipe_ingredient (id, recipe_id, ingredient_id, quantity, measurement_unit) VALUES
('f3b6c9a2-5d8e-4417-b6f3-c9a25d8e1742', 'e3c8a5f2-6d9b-4174-c8e3-a5f26d9b4175', '9d2f5a8c-4e7b-4127-2f9d-5a8c4e7b1275', 400, 'GRAMS'),    -- spaghetti
('e9a4d7b1-8c5f-4362-a4e9-d7b18c5f6329', 'e3c8a5f2-6d9b-4174-c8e3-a5f26d9b4175', 'e6a9d3f7-8c1b-4514-a9e6-d3f78c1b5142', 150, 'GRAMS'),    -- bacon
('a7f2d5c8-3e6b-4591-f2a7-d5c83e6b9517', 'e3c8a5f2-6d9b-4174-c8e3-a5f26d9b4175', 'a3b7c9e1-2f4d-4856-b7c9-e1a3b7c9e1a3', 3, 'PIECES'),      -- eggs
('d4c7f1a8-6b9e-4285-c7d4-f1a86b9e5283', 'e3c8a5f2-6d9b-4174-c8e3-a5f26d9b4175', 'b3c6f9a1-5d8e-4921-c6b3-f9a15d8e2918', 100, 'GRAMS'),    -- parmesan
('b1e8a5d2-7f4c-4638-e8b1-a5d27f4c9636', 'e3c8a5f2-6d9b-4174-c8e3-a5f26d9b4175', '7c2a5f8b-3e9d-4671-a7c2-5f8b3e9d6714', 1, 'TEASPOONS');   -- salt

-- Chicken in Tomato Sauce
INSERT INTO recipe_ingredient (id, recipe_id, ingredient_id, quantity, measurement_unit) VALUES
('c5a8f2d9-4e7b-4163-a8c5-f2d94e7b1639', 'b6f9c2a5-8e3d-4627-f9b6-c2a58e3d4628', 'f7c2a8d5-9e3b-4614-c2f7-a8d59e3b6179', 500, 'GRAMS'),    -- chicken breast
('f8d1a4c7-2e5b-4596-d1f8-a4c72e5b9564', 'b6f9c2a5-8e3d-4627-f9b6-c2a58e3d4628', 'e3f6a9c2-8b1d-4574-f3e6-a9c28b1d5748', 4, 'PIECES'),      -- tomatoes
('a2e5b8d1-6f9c-4374-e5a2-b8d16f9c7347', 'b6f9c2a5-8e3d-4627-f9b6-c2a58e3d4628', 'c8b5f2a9-4e7d-4385-b8c5-f2a94e7d3856', 1, 'PIECES'),     -- onion
('d7c4f9a6-3e8b-4521-c4d7-f9a63e8b2519', 'b6f9c2a5-8e3d-4627-f9b6-c2a58e3d4628', '6d9a3f7b-2c5e-4196-d9a3-f7b2c5e19647', 3, 'PIECES'),     -- garlic
('b9f6c3a2-8d5e-4187-f6b9-c3a28d5e4185', 'b6f9c2a5-8e3d-4627-f9b6-c2a58e3d4628', 'a1e4b7c9-6f2d-4527-e4a1-b7c96f2d5283', 2, 'TABLESPOONS'), -- olive oil
('e4a7d1f8-5c2b-4396-a7e4-d1f85c2b6394', 'b6f9c2a5-8e3d-4627-f9b6-c2a58e3d4628', 'd4a7c1f8-5b9e-4372-a7d4-c1f85b9e3721', 1, 'PIECES'),     -- bell pepper
('c1f8b5a2-9e6d-4573-f8c1-b5a29e6d7534', 'b6f9c2a5-8e3d-4627-f9b6-c2a58e3d4628', '3b6f9a2d-7c4e-4825-6f3b-9a2d7c4e8254', 200, 'GRAMS'),    -- rice
('a6d9f2c5-4b7e-4218-d9a6-f2c54b7e8216', 'b6f9c2a5-8e3d-4627-f9b6-c2a58e3d4628', '7c2a5f8b-3e9d-4671-a7c2-5f8b3e9d6714', 1, 'TEASPOONS');   -- salt

-- Baked Salmon with Vegetables
INSERT INTO recipe_ingredient (id, recipe_id, ingredient_id, quantity, measurement_unit) VALUES
('f9c2e5a8-7d4b-4361-c2f9-e5a87d4b6319', '8a4e7b1f-5c9d-4382-4e8a-7b1f5c9d3829', 'd9b3f6a2-8c5e-4724-b3d9-f6a28c5e7241', 500, 'GRAMS'),    -- salmon
('e5b8d1f4-3a6c-4597-b8e5-d1f43a6c9575', '8a4e7b1f-5c9d-4382-4e8a-7b1f5c9d3829', 'a8e2b5f9-7d4c-4865-e2a8-b5f97d4c8651', 400, 'GRAMS'),    -- potatoes
('c8f1a4d7-2e5b-4126-f1c8-a4d72e5b6124', '8a4e7b1f-5c9d-4382-4e8a-7b1f5c9d3829', 'f2d5a8e1-9c6b-4192-d5f2-a8e19c6b4129', 2, 'PIECES'),     -- carrots
('a4d7c1f8-6b9e-4352-d7a4-c1f86b9e5328', '8a4e7b1f-5c9d-4382-4e8a-7b1f5c9d3829', '5c8f2a6d-3e9b-4417-8f5c-2a6d3e9b4174', 300, 'GRAMS'),    -- broccoli
('d1f8a5c2-9e6b-4583-f8d1-a5c29e6b8537', '8a4e7b1f-5c9d-4382-4e8a-7b1f5c9d3829', 'a1e4b7c9-6f2d-4527-e4a1-b7c96f2d5283', 3, 'TABLESPOONS'), -- olive oil
('b7e4a1d8-5c2f-4619-e4b7-a1d85c2f9617', '8a4e7b1f-5c9d-4382-4e8a-7b1f5c9d3829', '7c2a5f8b-3e9d-4671-a7c2-5f8b3e9d6714', 1, 'TEASPOONS');   -- salt

-- Mozzarella with Tomato
INSERT INTO recipe_ingredient (id, recipe_id, ingredient_id, quantity, measurement_unit) VALUES
('c9a6f3d2-8e5b-4174-a6c9-f3d28e5b4179', 'f1d8b4c7-2a6e-4593-d8f1-b4c72a6e5931', '8e1b4f7a-3d6c-4549-1b8e-4f7a3d6c5498', 200, 'GRAMS'),    -- mozzarella
('f6d3a9c2-5b8e-4417-d3f6-a9c25b8e1742', 'f1d8b4c7-2a6e-4593-d8f1-b4c72a6e5931', 'e3f6a9c2-8b1d-4574-f3e6-a9c28b1d5748', 2, 'PIECES'),      -- tomatoes
('a3c6f9d2-7e4b-4528-c6a3-f9d27e4b8526', 'f1d8b4c7-2a6e-4593-d8f1-b4c72a6e5931', 'c5f8b2e9-6a3d-4736-f8c5-b2e96a3d7364', 10, 'GRAMS'),     -- basil
('e8b5f2a9-4d7c-4365-b5e8-f2a94d7c6359', 'f1d8b4c7-2a6e-4593-d8f1-b4c72a6e5931', 'a1e4b7c9-6f2d-4527-e4a1-b7c96f2d5283', 2, 'TABLESPOONS'), -- olive oil
('d2a5c8f1-6e9b-4731-a5d2-c8f16e9b4738', 'f1d8b4c7-2a6e-4593-d8f1-b4c72a6e5931', '7c2a5f8b-3e9d-4671-a7c2-5f8b3e9d6714', 0.5, 'TEASPOONS'); -- salt
