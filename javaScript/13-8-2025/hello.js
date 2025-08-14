// x = document.getElementById("demo").innerHTML;
// console.log(x);

// document.getElementById("demo").innerHTML = "Hello, JavaScript!";


input2 = document.getElementById("input2");
input2.addEventListener("input2", remaining);
function fn(){
    let length = document.getElementById("input1").value.length;
    console.log(length);
}

function remaining(){
    let lenght = document.getElementById("input2").addEventListener.value.lenght;

    let maxlenght = document.getElementById("input2").maxLength;
    let remaining = maxlenght - lenght;
    document.getElementById("left").innerHTML = "Remaining characters: " + remaining;
}



