/**
 * @param {number[]} A
 * @return {number}
 */
var peakIndexInMountainArray = function (A) {
    var left = 0;
    var right = A.length - 1;
    while (left < right) {
        var mid = Math.floor(left + (right - left) / 2);
        if (A[mid] < A[mid + 1]) {
            left = mid + 1;
        } else if (A[mid - 1] > A[mid]) {
            right = mid;
        } else {
            return mid;
        }
    }
};