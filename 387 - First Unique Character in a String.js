/**
 * @param {string} s
 * @return {number}
 */
var firstUniqChar = function (s) {
    var map = new Map();
    for (var i = 0; i < s.length; i++) {
        if (!map.has(s[i])) {
            map.set(s[i], i);
        } else {
            map.set(s[i], -1);
        }
    }
    var min = Number.MAX_SAFE_INTEGER;
    for (let c of map.keys()) {
        if (map.get(c) > -1 && map.get(c) < min) {
            min = map.get(c);
        }
    }
    return min === Number.MAX_SAFE_INTEGER ? -1 : min;
};