/**
 * @param {string} text
 * @return {number}
 */
var maxNumberOfBalloons = function (text) {
    var char_counts = new Array(26).fill(0);
    var aCharCode = 'a'.charCodeAt();
    for (var i = 0; i < text.length; i++) {
        char_counts[text.charCodeAt(i) - aCharCode]++;
    }
    var min = char_counts[1]; // b
    min = Math.min(min, char_counts[0]); // a
    min = Math.min(min, Math.floor(char_counts[11] / 2));
    min = Math.min(min, Math.floor(char_counts[14] / 2));
    min = Math.min(min, char_counts[13]); // n
    return min;

};