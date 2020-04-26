/*
Developer: Van Nhat Khong
Date: April 25, 2020

Below are solutions for lab 5 - question 1-13
*/

//1
const max = function(a, b) {
    if (a > b) return a;
    else return b;
}

//2
const maxOfThree = function(a, b, c) {
    return max(a, max (b,c));
}

//3
const isVowel = function(c) {
    if ("aeiouAEIOU".indexOf(c)>-1) return true;
    else return false;
}

//4
const sum = function(a) {
    let sum = 0;
    for (let i in a) {
        sum += a[i];
    }
    return sum;
}

const multiply = function(a) {
    let mul = 1;
    for (let i in a) {
        mul *= a[i];
    }
    return mul;
}

//5
const reverse = function(s) {
    r = "";
    for (let i = s.length-1; i >= 0; i--) {
        r += s[i];
    }
    return r;
}

//6
const findLongestWord = function(a) {
    let longest = 0;
    let longestWord = "";
    for (let str of a) {
        if (str.length > longest) {
            longest = str.length;
            longestWord = str;
        }
    }
    return longestWord;
}

//7
const filterLongWords = function(a, i) {
    let longWords = [];
    for (let str of a) {
        if (str.length > i) {
            longWords.push(str);
        }
    }
    return longWords;
}

//8
const numbers = [1,2,3,4];
const computeSumOfSquares = numbers.map(a => a**2).reduce((a, b) => a + b);

//9
const printOddNumbersOnly = numbers.filter(a => a % 2 != 0);

//10
const computeSumOfSquaresOfEvensOnly = numbers.filter(a => a % 2 == 0).map(a => a**2).reduce((a, b) => a + b);

//11
const sum = numbers.reduce((a,b) => a + b);
const multiply = numbers.reduce((a,b) => a * b);

//12
const findSecondBiggest = function (a) {
    let biggest = 0;
    let second = 0;
    for (let i of a) {
        if (i > biggest) {
            second = biggest;
            biggest = i;
        }
        else if (i > second) {
            second = i;
        }
    }
    return second;
}

//13
const printFibo = function (n, a, b) {
    if (n == 1) {
        console.log(a);
        return;
    }
    else if (n == 2) {
        console.log(a + ", " + b);
        return;
    }
    let fibo = a + ", " + b;
    for (let i = 2; i < n; i++) {
        let c = a + b;
        fibo += (", " + c);
        a = b;
        b = c;
    }
    console.log(fibo);
}
