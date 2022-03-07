function checkAnagram(word1, word2) {
    let first = word1.toUppercase();
    let second = word2.toUppercase();

    if(first.length != second.length) {
        return false;
    }

    

}

function mapWordLetters(word) {
    let letterMap = {};

    for(let letter of word) {
        if(letterMap.hasOwnProperty(letter)) {
            // Increment the value in the existing element
            letterMap[letter] = letterMap[letter] + 1;
        } else {
            // Create the new element for the letter
            letterMap[letter] = 1;
        }
    }

    return letterMap;
}

module.exports.checkAnagram = checkAnagram;