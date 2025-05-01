import Image from "next/image";

export default function Home() {
  return (
    <main className="flex min-h-screen items-center justify-center bg-gray-100">
      <div className="flex flex-col justify-center items-center w-[70%] min-h-[500px] p-4 bg-white rounded-xl shadow-md">
        <h1 className="text-2xl font-semibold text-gray-800">
          Hello, this is a frontend app built for our DevOps project.
        </h1>
        <p className="mt-2 text-lg text-gray-600">
          Made by <span className="text-blue-500">Oussama Ben Slama and Ahmed Ben Lazreg</span>
        </p> <br/>
        <p className="mt-2 text-lg text-gray-600">
          Supervised By Lazher Hamel
        </p>
      </div>
    </main>
  );
}

