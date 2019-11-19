/**
 * @param {number} n
 * @return {boolean}
 */
var isPowerOfThree = function (n) {
    var i = 1;
    while (i < n) {
        i = i * 3;
    }
    if (i === n) return true;
    return false;
};