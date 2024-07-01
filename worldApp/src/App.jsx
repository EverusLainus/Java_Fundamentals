import { useState } from "react";

import "./App.css";
import { SearchBar } from "./components/SearchBar";
import { Routes, Route, Link } from "react-router-dom";
import { BrowserRouter } from "react-router-dom";
import { Favorites } from "./pages/Favorites";

function App() {
  return (
    <div>
      <SearchBar />
    </div>
  );
}

/*

function App() {
  return (
    <div>
      <nav>
        <Link to="./">Home</Link>
        <Link to="./Favorites">Favorites</Link>
      </nav>
      <Routes>
        <Route path="./" element={<SearchBar />} />
        <Route path="./Favorites" element={<Favorites />} />
      </Routes>
    </div>
  );
}
  */

export default App;
