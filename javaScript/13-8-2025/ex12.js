function palindrome(str){
    str = str.toLowerCase();
    let reversedStr = str.split('').reverse().join('');
    if (reversedStr === str){
        return true;
    } 
    else {
        return false;
    }
}

console.log(palindrome("madam"));