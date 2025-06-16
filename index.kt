Question 1: Maximum Difference in Increasing Elements

 Initialization
 1. Initialize a variable maxDiff to -1. This varoiabl will store the maximum difference encountered so far
 2. Initialize another variable minElement. This variable will store the minimum element encountered so far
 
 Iteration

 1. Iterate through the array from the second element
 2. For each element: nums[i]
 3. If nums[i] is greater than minElement ;
    Update the maxDiff to the max of its current value  and the calculated difference

4. Update minElement to the minimum of its current value and nums[i]
5. return maxDiff


fun main(){
val nums1 = intArrayOf(2,56,3,4,29,890)
    println(maximumDifference(nums1))
}

fun maximumDifference(nums: IntArray): Int{
    var maxDiff = -1
    var minElement = nums[0]