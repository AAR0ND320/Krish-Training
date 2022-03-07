const anagramCheck = require('./Anagram');

function app() {
    if(anagramCheck.checkAnagram("listen", "silent")) {
        console.log("The two words are anagrams of each other!");
    } else {
        console.log("The two words are NOT anagrams of each other!");
    }
}

app();