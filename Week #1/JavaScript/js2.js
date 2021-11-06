/* 
Write a function that mimics (without the use of >>) the right shift operator and returns the result from the two given integers.

Examples
shiftToRight(80, 3) --> 10

shiftToRight(-24, 2) --> -6

shiftToRight(-5, 1) --> -3

shiftToRight(4666, 6) --> 72

shiftToRight(3777, 6) --> 59

shiftToRight(-512, 10) --> -1

Notes
-There will be no negative values for the second parameter y.
-This challenge is more like recreating of the right shift operation, thus, the use of the operator directly is prohibited.
*/

function rightShift(number, shift){
    return Math.floor(number/Math.pow(2,shift));
} 

console.log(rightShift(80,3));
console.log(rightShift(-24, 2));
console.log(rightShift(-5, 1));
console.log(rightShift(4666, 6));
console.log(rightShift(3777, 6));
console.log(rightShift(-512, 10));