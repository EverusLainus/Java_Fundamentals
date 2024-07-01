# Core Features:

## Initial Page Guidance:

- When no search has been performed, the page should display a welcoming message or image encouraging the user to start searching.
- The "History" section on the Homepage will also indicate that no data is available, prompting the user to initiate a search.

## Country Details Display:

- Dynamically render details of countries, such as name, currency, capital, languages, and flag, based on the user's currency code search.

  Debounced Search: Incorporate a debounced search to efficiently query countries by currency code, reducing unnecessary API calls.
  Sorting Functionality: Allow users to sort displayed countries alphabetically in both ascending and descending order.
  Favorites Feature & Route:
  Enable users to mark countries as favorites, changing the visual appearance of the country card to reflect its status.
  Include a "Favorites" route/page that exclusively displays countries marked as favorites.
  Search History Tracking:
  Implement a context to record the last five unique searches and display these in a "History" section on the Homepage, ensuring no duplicates.
  Focus on Search Input: Automatically focus the search input field using useRef when the Homepage component is rendered, enhancing user experience by facilitating immediate interaction.
