function start(input) {
    let words = input.split(' ');

    if(checkAnagram(words[0], words[1])) {
        console.log("The two words are anagrams of each other!");
    } else {
        console.log("The two words are NOT anagrams of each other!");
    }
}

function checkAnagram(word1, word2) {
    let first = word1.toUpperCase();
    let second = word2.toUpperCase();

    if(first.length !== second.length) {
        return false;
    }

    let word1Map = mapWordLetters(first);
    let word2Map = mapWordLetters(second);

    for(let letter in word1Map) {
        if(word1Map[letter] !== word2Map[letter]) {
            return false;
        }
    }

    return true;
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

module.exports.start = start;