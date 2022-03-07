const thirdLargest = require('./ThirdLargest');

const scanner = require('readline').createInterface({
    input: process.stdin,
    output: process.stdout
});

function app() {
    let inputString = "";
    let questionString = "Enter a series of numbers separated by a comma (,) de-limiter: ";

    scanner.question(questionString, function(input) {
        inputString = input;
        
        console.log(thirdLargest.start(inputString));
        
        scanner.close();
    });
}

app();