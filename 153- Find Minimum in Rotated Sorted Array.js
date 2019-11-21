/**
 * @param {number[]} nums
 * @return {number}
 */
var findMin = function (nums) {
    var left = 0;
    var right = nums.length - 1;
    while (left < right) {
        var mid = Math.floor(left + (right - left) / 2);

        if (nums[mid] < nums[mid - 1]) {
            return nums[mid];
        } else if (nums[left] <= nums[mid] && nums[mid] >= nums[right]) {
            left = mid + 1;
        } else {
            right = mid - 1;
        }
    }
    return nums[left];

};