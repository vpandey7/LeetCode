/**
 * @param {character[]} letters
 * @param {character} target
 * @return {character}
 */
var nextGreatestLetter = function (letters, target) {
    var left = 0;
    var right = letters.length;

    while (left < right) {
        var mid = Math.floor(left + (right - left) / 2);
        if (letters[mid] <= target) {
            left = mid + 1;
        } else {
            right = mid;
        }
    }
    return letters[left % letters.length];

};