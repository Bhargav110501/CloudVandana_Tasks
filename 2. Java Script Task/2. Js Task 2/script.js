function sorting(arr) {
    if (arr.length <= 1) {
        return arr;
    } else {
        let pivot = arr[0];
        let left = [];
        let right = [];
        
        for (let i = 1; i < arr.length; i++) {
            if (arr[i] > pivot) {
                left.push(arr[i]);
            } else {
                right.push(arr[i]);
            }
        }
        return [...sorting(left), pivot, ...sorting(right)];
    }
}
let numbers = [5, 2, 9, 1, 5, 6];

let sortedArray = sorting(numbers);

document.write(sortedArray);
