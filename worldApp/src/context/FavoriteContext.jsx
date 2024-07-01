import { createContext, useState } from "react";

export const FavoriteProvider = createContext();

export const FavoriteContext = ({ children }) => {
  const [favorites, setFavorites] = useState([]);
  function AddToFavorites(value) {
    setFavorites(value);
  }

  return (
    <FavoriteContext.Provider value={(setFavorites, AddToFavorites)}>
      {children}
    </FavoriteContext.Provider>
  );
};
