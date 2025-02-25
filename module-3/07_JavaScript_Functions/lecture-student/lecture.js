/**
 * All named functions will have the function keyword and
 * a name followed by parentheses.
 * 
 * @returns {number} 1
 */
function returnOne() {
  return 1;
}

/**
 * Functions can also take parameters. These are just variables that are filled
 * in by whoever is calling the function.
 *
 * Also, we don't *have* to return anything from the actual function.
 *
 * @param {any} value the value to print to the console
 */
function printToConsole(value) {
  console.log(value);
}

/**
 * Write a function called multiplyTogether that multiplies two numbers together. But 
 * what happens if we don't pass a value in? What happens if the value is not a number?
 *
 * @param {number} firstParameter the first parameter to multiply
 * @param {number} secondParameter the second parameter to multiply
 */
function printToConsole(firstParameter, secondParameter){
  return firstParameter* secondParameter;
}

/**
 * This version makes sure that no parameters are ever missing. If
 * someone calls this function without parameters, we default the
 * values to 0. However, it is impossible in JavaScript to prevent
 * someone from calling this function with data that is not a number.
 * Call this function multiplyNoUndefined
 *
 * @param {number} [firstParameter=0] the first parameter to multiply
 * @param {number} [secondParameter=0] the second parameter to multiply
 */
function multiplyNoUndefined(firstParameter= 0, secondParameter= 0){
  return firstParameter* secondParameter;
}

 
/**
 * Functions can return earlier before the end of the function. This could be useful
 * in circumstances where you may not need to perform additional instructions or have to
 * handle a particular situation.
 * In this example, if the firstParameter is equal to 0, we return secondParameter times 2.
 * Observe what's printed to the console in both situations.
 * 
 * @param {number} firstParameter the first parameter
 * @param {number} secondParameter the second parameter
 */
function returnBeforeEnd(firstParameter, secondParameter) {
  console.log("This will always fire.");

  if (firstParameter == 0) {
    console.log("Returning secondParameter times two.");
    return secondParameter * 2;
  }

  //this only runs if firstParameter is NOT 0
  console.log("Returning firstParameter + secondParameter.");
  return firstParameter + secondParameter;
}

/**
 * Scope is defined as where a variable is available to be used.
 *
 * If a variable is declare inside of a block, it will only exist in
 * that block and any block underneath it. Once the block that the
 * variable was defined in ends, the variable disappears.
 */
function scopeTest() {
  // This variable will always be in scope in this function
  let inScopeInScopeTest = true;

  {
    // this variable lives inside this block and doesn't
    // exist outside of the block
    let scopedToBlock = inScopeInScopeTest;
  }

  // scopedToBlock doesn't exist here so an error will be thrown
  if (inScopeInScopeTest && scopedToBlock) {
    console.log("This won't print!");
  }
}
/**
 * 
 * @param {string} name the name of the person we're describing 
 * @param {number} age the age of the person 
 * @param {string[]} listOfQuirks [listofQuirks] is a list of funny quirks
 * @param {string} separator the string to separate the quirks by (,default) 
 * @returns {string} a funny senntance about the person
 */
function createSentenceFromUser(name, age, listOfQuirks = [], separator = ', ') {
  let description = `${name} is currently ${age} years old. Their quirks are: `;
  return description + listOfQuirks.join(separator);
}

/**
 * Takes an array and, using the power of anonymous functions, generates
 * their sum.
 *
 * @param {number[]} numbersToSum numbers to add up
 * @returns {number} sum of all the numbers
 */
function sumAllNumbers(numbersToSum) {
  return numbersToSum.reduce( (acc, current)=> acc+current,0);
}

/**
 * Takes an array and returns a new array of only numbers that are
 * multiples of 3
 *
 * @param {number[]} numbersToFilter numbers to filter through
 * @returns {number[]} a new array with only those numbers that are
 *   multiples of 3
 */
function allDivisibleByThree(numbersToFilter) {
return numbersToFilter.filter((number)=> number % 3 ==0);

}

//foreach element in the array, print a new line
/**
 * 
 * @param {[] generic array} array 
 */
function demoForEachWithIndex(array){
array.forEach((item, index)=> {
  console.log('Item at index ' + index+ ' is ' + item);
})
}
/**
 * return new array with all values double
 * @param {number[]} nums 
 * @returns {numbers[]} a new array with all of the element in nums doubled
 */
function doubleAllArrayValues(nums){
  return nums.map((num)=> num * 2);
}

/**
 * return new array with even indexes double
 * @param {number[]} nums 
 * @returns {numbers[]} a new array elements at even indexes are doubled, odd indexes are not 
 */
 function doubleEvenIndexArrayValues(nums){
  return nums.map((num, index)=> {
    if(index % 2 ==0){
    return num * 2;
  }
  return num;
  });
}
/**
 * find student named dan and return it
 * @param {string[]} students 
 * @return {string} find dan
 */
function findDan(students){
  return students.find((student) => student == 'Dan');
}