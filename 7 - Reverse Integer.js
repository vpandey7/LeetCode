/**
 * @param {number} x
 * @return {number}
 */
var reverse = function (x) {
    var max = Math.pow(2, 31);
    var newNum = x;
    if (x < 0) {
        x = x * -1;
    }
    var reversed = 0;
    while (x > 0) {
        var remainder = x % 10;
        x = Math.floor(x / 10);
        reversed = reversed * 10 + remainder
    }
    if (reversed > max || reversed < -max) {
        return 0;
    }

    if (newNum < 0)
        return reversed * -1;
    else {
        return reversed;
    }
};