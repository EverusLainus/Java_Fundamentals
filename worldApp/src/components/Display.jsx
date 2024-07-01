import { useEffect, useState } from "react";
import axios from "axios";
import { Cards } from "./Cards";

export const Display = (props) => {
  console.log(typeof props.data);
  props.data.forEach((elt, i) => {
    console.log(elt);
    console.log(elt.name.official);
    console.log(elt.languages);
  });
  /*
  setTimeout(() => {
    console.log("Delayed for 1 second.");
  }, "1000");
*/
  return (
    <div className="cardGrid">
      <h6>Enter a Currency Code</h6>
      {props.data.map((elt, i) => {
        <div key={i} className="card">
          <p>{elt.capital[0]}</p>
          <p>{elt.name.official}</p>
          <Cards elt={elt} />
        </div>;
      })}
    </div>
  );
};
