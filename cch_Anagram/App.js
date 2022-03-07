const anagramCheck = require('./Anagram');

// const readline = require('readline');

// const scanner = readline.createInterface({
//     input: process.stdin,
//     output: process.stdout
// });

const scanner = require('readline').createInterface({
    input: process.stdin,
    output: process.stdout
});

function app() {
    let inputString = "";

    scanner.question("Enter the two words separated by a space(\" \"): ", function(input) {
        inputString = input;
        
        anagramCheck.start(inputString);
        
        scanner.close();
    });
}

app();