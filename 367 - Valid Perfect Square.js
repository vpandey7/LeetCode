/**
 * @param {number} num
 * @return {boolean}
 */
var isPerfectSquare = function (num) {
    if (num === 1) return 1;
    if (num < 1) return false;

    var left = 1;
    var right = num;

    while (left <= right) {
        var mid = Math.floor(left + (right - left) / 2);
        if (mid * mid === num) {
            return true;
        } else if (mid * mid > num) {
            right = mid - 1;
        } else {
            left = mid + 1;
        }
    }
    return false;

};