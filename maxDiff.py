def maxDiff(arr){
    n = len(arr)

    ans = -1

    for i in range(n):
        for j in range (i + 1, n):
            if arr[j] > arr[i]:

                ans = max(ans, arr[j] - arr[i])
}

#     return ans


