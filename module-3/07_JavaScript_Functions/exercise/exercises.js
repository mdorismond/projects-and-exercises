/**
 * Write a function called isAdmitted. It will check entrance
 * scores and return true if the student is admitted and
 * false if rejected. It takes three parameters:
 *
 *     * gpa
 *     * satScore (optional)
 *     * recommendation (optional)
 *
 * Admit them--return true--if:
 * gpa is above 4.0 OR
 * SAT score is above 1300 OR
 * gpa is above 3.0 and they have a recommendation OR
 * SAT score is above 1200 and they have a recommendation
 * OTHERWISE reject it
 *
 * @param {number} gpa the GPA of the student, between 4.2 and 1.0
 * @param {number} [satScore=0] the student's SAT score
 * @param {boolean} [recommendation=false] does the student have a recommendation
 * @returns {boolean} true if they are admitted
 */
 function isAdmitted(gpa, satScore=0, recommendation=false){
    if(gpa>4 || satScore>1300 || (gpa>3 && recommendation) || (satScore>1200 && recommendation)){
        return true;
    }
    return false;
}

/**
 * Write a function called useParameterToFilterArray that accepts a filter function
 * as a parameter. Use this function to filter unfilteredArray and return the result.
 *
 * @param {function} filterFunction the function to filter with
 * @returns {number[]} the filtered array
 */
 const useParameterToFilterArray = function(number){
    return number > 5;
   }
   

   const filtered = numbers.filter(useParameterToFilterArray)
   
  
   console.log(filtered)>   [6,8,32,100]
   
let unfilteredArray = [1, 2, 3, 4, 5, 6];

   
/**
 * Write a function called makeNumber that takes two strings
 * of digits, concatenates them together, and returns
 * the value as a number.
 *
 * So if two strings are passed in "42293" and "443", then this function
 * returns the number 42293443.
 *
 * @param {string} first the first string of digits to concatenate
 * @param {string} [second=''] the second string of digits to concatenate
 * @returns {number} the resultant number
 */
 function makeNumber(str1, str2){
    return +(str1+str2)
}

console.log(makeNumber("123", "456"))


/**
 * Write a function called addAll that takes an unknown number of parameters
 * and adds all of them together. Return the sum.
 *
 * @param {...number} num a series of numbers to add together
 * @returns {number} the sum of all the parameters (or arguments)
 */

 function addAll(...nums) {
    let sum = 0;
    for (let i=0; i<nums.length; i++) sum += +(nums[i])
    
    return sum
}

console.log(addAll(1, 2, 3))

/*
 * Write and document a function called makeHappy that takes
 * an array and prepends 'Happy ' to the beginning of all the
 * words and returns them as a new array. Use the `map` function.
 */
function makeHappy(words) {
    newArr = [];
    words.forEach((word)=>{
        newArr.push("Happy "+word);
    })
    
    return newArr;
}

console.log(makeHappy(["apple", "ball"]))

/*
 * Write and document a function called getFullAddressesOfProperties
 * that takes an array of JavaScript objects. Each object contains the
 * following keys:
 *     * streetNumber
 *     * streetName
 *     * streetType
 *     * city
 *     * state
 *     * zip
 *
 * getFullAddressesOfProperties returns an array of strings. 
 * Each string is a mailing address generated from the data of a single JavaScript object. 
 * 
 * Each mailing address should have the following format:
 *    
 *  streetNumber streetName streetType city state zip
 *
 * Use `map` and an anonymous function.
 */
function getFullAddressesOfProperties(objects) {
    newArr = [];
    objects.forEach((object)=>{
        newArr.push(`${object.streetNumber} ${object.streetName} ${object.streetType} ${object.city} ${object.state} ${object.zip}`);
    })
    
    return newArr;
}

objects = [{
    "streetNumber": "abc",
    "streetName": "def",
    "streetType": "ghi",
    "city": "jkl",
    "state": "mno",
    "zip": 123,
},
{
    "streetNumber": "abc",
    "streetName": "def",
    "streetType": "ghi",
    "city": "jkl",
    "state": "mno",
    "zip": 123,
},

]
console.log(getFullAddressesOfProperties(objects))

/** 
 * Write and document a function called findLargest that uses `forEach`
 * to find the largest element in an array.
 * The function must work for strings and numbers.
 * 
 * For strings, "largest" means the word coming last in lexographical order.
 * Lexographic is similar to alphabetical order except that 
 * capital letters come before lowercase letters: 
 * 
 * "cat" < "dog" but "Dog" < "cat"
 *
 * @param {number[]|string[]} searchArray the array to search
 * @returns {number|string} the number or string that is largest
 **/
 function findLargest(arr) {
    let largest = arr[0];
    
    arr.forEach((e)=>{
        largest = e>largest?e:largest;
    })
    
    return largest;
}

console.log(findLargest([1, 2, 3, 4, 5]))


/*
 * CHALLENGE
 * Write and document a function called getSumOfSubArrayValues.
 *
 * Take an array of arrays, adds up all sub values, and returns
 * the sum. For example, if you got this array as a parameter:
 * [
 *   [1, 2, 3],
 *   [2, 4, 6],
 *   [5, 10, 15]
 * ];
 *
 * The function returns 48. To do this, you will use two nested `reduce`
 * calls with two anonymous functions.
 *
 * Read the tests to verify you have the correct behavior.
 */
function getSumOfSubArrayValues(arrOfArrays) {
    let sum = 0;
    
    arrOfArrays.forEach((arr)=>{
        sum += arr.reduce((a, b) => a + b, 0);
    })
    
    return sum;
}

console.log(getSumOfSubArrayValues([[1, 2, 3],[2, 4, 6],[5, 10, 15]]))

