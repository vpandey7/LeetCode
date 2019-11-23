/**
 * @param {number} x
 * @return {boolean}
 */
var isPalindrome = function (x) {
    var copyNum = x;
    var reversed = 0;
    while (x > 0) {
        var remainder = x % 10;
        x = Math.floor(x / 10);
        reversed = reversed * 10 + remainder;
    }

    return copyNum === reversed;
};