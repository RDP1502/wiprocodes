let loginBtn = document.getElementById("login");
let logoutBtn = document.getElementById("logout");

loginBtn.addEventListener("click", function () {
    let userId = document.getElementById("userId").value.trim();
    let password = document.getElementById("password").value.trim();

    if (userId && password) {
        localStorage.setItem("userId", userId);
        console.log("User Id stored:", userId);
        alert("Login successful!");
    } else {
        console.error("User ID or Password is empty.");
        alert("Please enter both User ID and Password.");
    }
    updateStatus();
});

logoutBtn.addEventListener("click", function () {
    localStorage.removeItem("userId");
    alert("Logged out successfully!");
    updateStatus();
});


