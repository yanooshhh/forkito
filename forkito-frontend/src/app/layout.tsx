import './globals.css';
import { ReactNode } from 'react';

export default function RootLayout({ children }: { children: ReactNode }) {
  return (
    <html lang="en">
      <body className="bg-white text-gray-900 font-sans">
        <header className="bg-teal-600 text-white p-4">
          <h1 className="text-2xl font-semibold">Forkito</h1>
        </header>
        <main className="p-4">{children}</main>
      </body>
    </html>
  );
}
