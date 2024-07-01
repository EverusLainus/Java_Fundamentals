import { useEffect, useState } from "react";

import axios from "axios";
import { Display } from "./Display";

export const SearchBar = () => {
  const [code, setCode] = useState("");
  const [data, setData] = useState([]);
  const [input, setInput] = useState("");

  const handleChange = (e) => {
    console.log(e.target.value);
    setCode(input);
  };
  useEffect(() => {
    console.log(`https://restcountries.com/v3.1/currency/${code}`);
    axios
      .get(`https://restcountries.com/v3.1/currency/${code}`)
      .then(function (response) {
        // handle success
        console.log(response.data);
        setData(response.data);
      })
      .catch(function (error) {
        // handle error
        console.log(error);
      })
      .finally(function () {
        // always executed
      });
  }, [code]);

  useEffect(() => {
    //console.log(input);
    document.querySelector("input").focus();
  }, []);
  return (
    <>
      <input
        className="searchBar"
        type="text"
        onChange={(val) => {
          setCode(val);
        }}
        placeholder="Enter currency code"
      />
      <button onClick={handleChange}>Submit</button>
      <Display data={data} />
    </>
  );
};
