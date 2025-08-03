export default function IngredientsPage() {
  return (
    <div className="p-6">
      <h1 className="text-2xl font-bold text-gray-900 mb-4">Ingredient base</h1>
      <p className="text-gray-600 mb-6">
        Manage your ingredient database, check availability and prices.
      </p>
      
      <div className="grid grid-cols-1 md:grid-cols-2 lg:grid-cols-4 gap-4">
        {/* Przykładowe karty składników */}
        <div className="bg-white border border-gray-200 rounded-lg p-4 shadow-sm">
          <h3 className="font-semibold text-gray-900 mb-2">Tomatoes</h3>
          <p className="text-gray-600 text-sm mb-3">Fresh tomatoes</p>
          <div className="flex justify-between items-center">
            <span className="text-teal-600 font-medium">~$0.85/kg</span>
            <span className="px-2 py-1 bg-green-100 text-green-800 text-xs rounded">Available</span>
          </div>
        </div>
        
        <div className="bg-white border border-gray-200 rounded-lg p-4 shadow-sm">
          <h3 className="font-semibold text-gray-900 mb-2">Flour</h3>
          <p className="text-gray-600 text-sm mb-3">Wheat flour type 500</p>
          <div className="flex justify-between items-center">
            <span className="text-teal-600 font-medium">~$0.55/kg</span>
            <span className="px-2 py-1 bg-green-100 text-green-800 text-xs rounded">Available</span>
          </div>
        </div>
        
        <div className="bg-white border border-gray-200 rounded-lg p-4 shadow-sm">
          <h3 className="font-semibold text-gray-900 mb-2">Chicken</h3>
          <p className="text-gray-600 text-sm mb-3">Chicken breast fillet</p>
          <div className="flex justify-between items-center">
            <span className="text-teal-600 font-medium">~$4.60/kg</span>
            <span className="px-2 py-1 bg-yellow-100 text-yellow-800 text-xs rounded">Limited</span>
          </div>
        </div>
        
        <div className="bg-white border border-gray-200 rounded-lg p-4 shadow-sm">
          <h3 className="font-semibold text-gray-900 mb-2">Cheese</h3>
          <p className="text-gray-600 text-sm mb-3">Yellow gouda cheese</p>
          <div className="flex justify-between items-center">
            <span className="text-teal-600 font-medium">~$6.30/kg</span>
            <span className="px-2 py-1 bg-green-100 text-green-800 text-xs rounded">Available</span>
          </div>
        </div>
      </div>
      
      <button className="mt-6 bg-teal-600 text-white px-4 py-2 rounded-lg hover:bg-teal-700 transition-colors">
        Add new ingredient
      </button>
    </div>
  );
}
