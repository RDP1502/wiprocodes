var Stack = /** @class */ (function () {
    function Stack(value) {
        this.value = [];
        this.value = value;
    }
    Stack.prototype.push = function (item) {
        this.value.push(item);
    };
    Stack.prototype.pop = function () {
        return this.value.pop();
    };
    Stack.prototype.peek = function () {
        return this.value[this.value.length - 1];
    };
    return Stack;
}());
var stack = new Stack(["hello", "welcome"]);
stack.pop();
stack.push("help")
console.log(stack.peek());
console.log(stack);
