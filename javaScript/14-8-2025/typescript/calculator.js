var Operation = /** @class */ (function () {
    function Operation() {
    }
    Operation.prototype.add = function (a, b) {
        return a + b;
    };
    Operation.prototype.substract = function (a, b) {
        return a - b;
    };
    return Operation;
}());
var op = new Operation();
console.log(op.add(5, 4));
console.log(op.substract(10, 2));
