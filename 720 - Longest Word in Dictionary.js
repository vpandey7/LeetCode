/**
 * @param {string[]} words
 * @return {string}
 */
var longestWord = function(words) {
  words.sort();
  var result = "";
  var wordsBuilt = new Set();
  for (var s of words) {
    if (s.length === 1 || wordsBuilt.has(s.substring(0, s.length - 1))) {
      if (s.length > result.length) result = s;
      wordsBuilt.add(s);
    }
  }
  return result;
};