function start(userInput) {
    let splitArray = userInput.split(',');

    let intArray = [];

    for (let i = 0; i < splitArray.length; i++) {
        let value = parseInt(splitArray[i]);

        if (isNaN(value)) {
            return "INVALID INPUT: only input numbers with a comma (,) de-limiter";
        }

        intArray[i] = value;
    }

    if (intArray.length < 4) {
        return "INVALID INPUT: You need to input more than 3 numbers"
    }

    intArray = bubblesortNumbers(intArray);

    let outputString = "The third largest number is: " + intArray[2];

    return outputString;
}

function bubblesortNumbers(array) {
    let listSize = array.length;
    let temp = 0;

    for (let i = 0 ; i < listSize ; i++) {
        for (let j = 1 ; j < (listSize - i) ; j++) {
            if (array[j - 1] < array[j]) {
                temp = array[j - 1];
                array[j - 1] = array[j];
                array[j] = temp;
            }
        }
    }

    return array;
}

module.exports.start = start;