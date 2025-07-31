import Image from "next/image";

export default function HomePage() {
  return (
    <main className="flex min-h-screen flex-col items-center justify-center bg-gray-100 p-4">
      <h1 className="text-4xl font-bold text-gray-800">Welcome to Forkito 🍴</h1>
      <p className="mt-4 text-lg text-gray-600">Your personal meal planning assistant.</p>
    </main>
  );
}