/**
 * @param {string} moves
 * @return {boolean}
 */
var judgeCircle = function (moves) {

    var x = 0;
    var y = 0;

    for (var move of moves) {
        if (move === 'U') {
            y = y - 1;
        } else if (move === 'D') {
            y = y + 1;
        } else if (move === 'R') {
            x = x + 1;
        } else if (move === 'L') {
            x = x - 1;
        }
    }
    return (x === 0 && y === 0);

};