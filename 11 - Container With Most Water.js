/**
 * @param {number[]} height
 * @return {number}
 */
var maxArea = function (height) {
    var left = 0;
    var right = height.length - 1;
    var maxArea = 0;
    while (left < right) {
        if (height[left] < height[right]) {
            maxArea = Math.max(maxArea, height[left] * (right - left));
            left++;
        } else {
            maxArea = Math.max(maxArea, height[right] * (right - left));
            right--;

        }
    }
    return maxArea;


};