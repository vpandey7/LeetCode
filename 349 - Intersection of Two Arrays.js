/**
 * @param {number[]} nums1
 * @param {number[]} nums2
 * @return {number[]}
 */
var intersection = function (nums1, nums2) {
    var map1 = new Set();
    var returnArr = [];
    for (var i = 0; i < nums1.length; i++) {
        map1.add(nums1[i]);
    }
    var intersection = new Set();
    for (var i = 0; i < nums2.length; i++) {
        if (map1.has(nums2[i])) {
            intersection.add(nums2[i]);
        }
    }
    for (var i of intersection) {
        returnArr.push(i);
    }
    return returnArr;
};