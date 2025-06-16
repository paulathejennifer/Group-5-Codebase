function maximumDifference(arr){
    let n = arr.length;


    let ans = -1;
    for (let i =0; i < n; i++){
        for (let j = i + 1; j< n; j++){
            if (arr[j] > arr[i]){
                ans = Math.max(ans, arr[j] - arr[i]);

            }
        }
    }

    return ans;
}

let arr = [2,6,1,8,9,35,8,2];
console.log(maximumDifference(arr));
