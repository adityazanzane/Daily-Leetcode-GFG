# Absolute Difference of 1
## Easy
<div class="problems_problem_content__Xm_eO"><p><span style="font-size:18px">Given an array <strong>arr</strong> of size <strong>n</strong>. Print all the numbers less than <strong>k&nbsp;</strong>and should be such that the difference between every adjacent digit should be <strong>1&nbsp;</strong>in the array.</span></p>

<p><span style="font-size:18px"><strong>Note: </strong>Return empty list if no such number present, driver code will automatically print -1.</span></p>

<p><span style="font-size:18px"><strong>Example 1:</strong></span></p>

<pre><span style="font-size:18px"><strong>Input:
</strong>n = 8, k = 54
arr[] = {7, 98, 56, 43, 45, 23, 12, 8}
<strong>Output:</strong> 43 45 23 12
<strong>Explanation:</strong> 43 45 23 12 all these numbers have adjacent 
digits diff as 1 and they areless than 54.</span></pre>

<p><span style="font-size:18px"><strong>Example 2:</strong></span></p>

<pre><span style="font-size:18px"><strong>Input:
</strong>n = 10, k = 1000
arr[] = {87, 89, 45, 235, 465, 765, 123, 987, 499, 655}
<strong>Output:</strong> 87 89 45 765 123 987
<strong>Explanation:</strong> 87 89 45 765 123 987 all these numbers have adjacent
digits diff as 1 and they areless than 1000.</span>
</pre>

<p><span style="font-size:18px"><strong>Your Task:</strong><br>
You don't need to read input or print anything. Your task is to complete the function&nbsp;<strong>getDigitDiff1AndLessK()&nbsp;</strong>which takes the array of integers&nbsp;<strong>arr, n&nbsp;</strong>and&nbsp;<strong>k&nbsp;</strong>as parameters and returns a list of integer denoting the answer.</span></p>

<p><span style="font-size:18px"><strong>Expected Time Complexity:</strong>O(n)<br>
<strong>Expected Auxiliary Space:</strong>O(1)</span></p>

<p><span style="font-size:18px"><strong>Constraints:</strong><br>
1 &lt;= n &lt;= 10<sup>7</sup><br>
1 &lt;= k, arr[i] &lt;= 10<sup>18</sup></span></p>

<p>&nbsp;</p>
</div>