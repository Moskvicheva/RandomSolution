(Tasks from hyperskill.org)

Task 1:

For the given numbers K, N, and M find the first seed that is greater than or equal to K where each of N Gaussian numbers is less than or equal to M.

The input contains numbers K, N, M in a single line.

You should output the seed.

Task 2:

Your job is to find the seed between A and B (both inclusive) that produces N pseudorandom numbers from 0 (inclusive) to K (exclusive). It should also have the maximum of these N numbers to be the minimum among all maximums of other seeds in this range.

Sounds complicated? Take a look at the example.

Here we have A = 7, B = 9, N = 4, K = 100. Let's suppose:

For the seed 7, we get the sequence 45, 99, 23, 67 – the maximum is 99.
For the seed 8, we get 64, 34, 23, 9 – the maximum is 64.
For the seed 9, we get 78, 34, 0, 11 – the maximum is 78.
Then the minimum among these maximums is 64. That means, in this example, the seed we are looking for is 8.

The input contains numbers A, B, N, K in a single line and in this order.

Your task is to output 2 numbers: a seed and its maximum. If there are some seeds with equal minimal maximums, you should output the seed that is smaller than all other seeds.
