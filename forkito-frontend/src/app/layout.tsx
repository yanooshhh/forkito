import './globals.css'; // <- ważne! to ładuje Tailwinda
import type { Metadata } from 'next';
import { Inter } from 'next/font/google';

const inter = Inter({ subsets: ['latin'] });

export const metadata: Metadata = {
  title: 'Forkito',
  description: 'Your meal planner',
};

export default function RootLayout({
  children,
}: {
  children: React.ReactNode;
}) {
  return (
    <html lang="en">
      <body className={`${inter.className} bg-white text-gray-900`}>
        <header className="bg-teal-600 text-white p-4">
          <nav className="flex justify-between items-center">
            <div className="flex gap-6">
              <a href="/" className="hover:text-teal-200 transition-colors">Dashboard</a>
              <a href="/calendar" className="hover:text-teal-200 transition-colors">Calendar</a>
              <a href="/shopping-list" className="hover:text-teal-200 transition-colors">Shopping list</a>
              <a href="/recipe-base" className="hover:text-teal-200 transition-colors">Recipe base</a>
            </div>
            <div>
              <a href="/login" className="hover:text-teal-200 transition-colors">Log in</a>
            </div>
          </nav>
        </header>
        <main className="p-4">{children}</main>
      </body>
    </html>
  );
}
