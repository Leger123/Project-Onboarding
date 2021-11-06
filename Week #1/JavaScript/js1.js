/* 1) Write a function that moves all the zeroes to the end of an array. 
    Do this without returning a copy of the input array.
    Examples
        zeroesToEnd([1, 2, 0, 0, 4, 0, 5]) --> [1, 2, 4, 5, 0, 0, 0]
        zeroesToEnd([0, 0, 2, 0, 5]) --> [2, 5, 0, 0, 0]
        zeroesToEnd([4, 4, 5]) --> [4, 4, 5]
        zeroesToEnd([0, 0]) --> [0, 0]
    Notes:
    -You must mutate the original array.
    -Keep the relative order of the non-zero elements the same.
*/

/* function zeroesToEnd(array){
    let string = "";
    for(let i = 0; i<array.length; i++){
        if(array[i] == 0){
            array.splice(i,1);
            array.push(0); 
        }

        string += array[i]+","
    }
}  */

function zeroesToEnd(arr) {
    let q = 0;
    for (let p=0; p<arr.length; p++) 
        if (arr[p] != 0) arr[q++] = arr[p];
    for (; q<arr.length; q++) arr[q] = 0;
    return arr;
}

console.log(zeroesToEnd([1, 2, 0, 0, 4, 0, 5]));
console.log(zeroesToEnd([0, 0, 2, 0, 5]));
console.log(zeroesToEnd([4, 4, 5]));
console.log(zeroesToEnd([0, 0]));


