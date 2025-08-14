let num1 = document.getElementById("num1");
let num2 = document.getElementById("num2");
let result = document.getElementById("result");
let buttons = document.querySelectorAll(".operations button");

buttons.forEach(button => {
    button.addEventListener("click", function() {
        let value1 = parseFloat(num1.value);
        let value2 = parseFloat(num2.value);
        let op = button.getAttribute("data-op");

        if (isNaN(value1) || isNaN(value2)) {
            result.textContent = "Please enter valid numbers.";
            return;
        }

        switch(op) {
            case "add":
                result.textContent = "Result: " + (value1 + value2);
                break;
            case "subtract":
                result.textContent = "Result: " + (value1 - value2);
                break;
            case "multiply":
                result.textContent = "Result: " + (value1 * value2);
                break;
            case "divide":
                if (value2 === 0) {
                    result.textContent = "Cannot divide by zero.";
                } else {
                    result.textContent = "Result: " + (value1 / value2);
                }
                break;
        }
    });
});
