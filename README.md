# TDD Example - FizzBuzz

## You've been asked to develop a fizz buzz application

* When given a number that is a multiple of 3 it should print fizz
* When given a number that is a multiple of 5 it should print buzz
* When given a number that is a multiple of 3 and 5 it should print fizzbuzz
* When given any other number it should print that number

## BadSolution
If you look at the BadSolution object you will see a bad solution that meets the
requirements. Can you see why it is a bad solution? This is a simple example, but
in general you can ensure a better and more testable design by 

## Now let's try some TDD to come up with a better solution...

### Step 1: Define a signature for our method
First we should come up with a signature for our method Solution.fizzbuzz

### Step 2: Write our test cases
Next write some tests in SolutionTest to test the Solution.fizzbuzz method - you have 2 possible approaches with TDD.

1. Write all tests before you start on implementation to cover every edge case
(my preferred approach)
2. Write a test, do the least amount you need to get it to pass, then write the next test

Once you have your tests check that they are failing. You can do this in IntelliJ, but
can also get sbt to automatically re-run your tests when the code changes:
```
sbt
~testOnly *SolutionTest
```

### Step 3: Implement solution
Now implement the solution in Solution.fizzbuzz and get all of your tests to pass!
