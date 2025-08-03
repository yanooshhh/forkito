export default function RecipeBaseLayout({
  children,
}: {
  children: React.ReactNode;
}) {
  return (
    <div>
      <div className="border-b border-gray-200 bg-gray-50 px-4 py-3">
        <nav className="flex gap-6">
          <a 
            href="/recipe-base" 
            className="px-3 py-2 text-sm font-medium text-gray-700 hover:text-teal-600 border-b-2 border-transparent hover:border-teal-600 transition-colors"
          >
            Recipe base
          </a>
          <a 
            href="/recipe-base/ingredients" 
            className="px-3 py-2 text-sm font-medium text-gray-700 hover:text-teal-600 border-b-2 border-transparent hover:border-teal-600 transition-colors"
          >
            Ingredient base
          </a>
        </nav>
      </div>
      <div>{children}</div>
    </div>
  );
}
