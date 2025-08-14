

function addCitiesToDropdown() {
      // Array of city names (unordered)
      const cities = ["pune", "mumbai", "delhi", "bangalore", "chennai"];

      // Sort the array alphabetically
      cities.sort(); 

      // Get the dropdown element
      const dropdown = document.getElementById("cityDropdown");

      // Clear existing options (optional, to avoid duplicates on multiple button clicks)
      dropdown.innerHTML = '<option value="">Select a City</option>';

      // Add sorted cities to the dropdown
      cities.forEach(city => {
        const option = document.createElement("option"); // Create an option element
        option.value = city; // Set the value of the option
        option.textContent = city; // Set the visible text of the option
        dropdown.appendChild(option); // Add the option to the dropdown
      });
    }