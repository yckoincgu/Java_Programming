#include <stdio.h>
#include <math.h>

// Function to calculate the number of digits in the given number
int count_digits(int n) {
    int count = 0;
    while (n != 0) {
        count++;
        n /= 10;
    }
    return count;
}

int main() {
    int x, temp, y = 0;
    printf("Input an integer x: ");
    scanf("%d", &x);

    // Get the number of digits in x
    int num_digits = count_digits(x);

    // Copy the value of x to temp to extract its digits
    temp = x;

    // Calculate the summation value y by adding each digit raised to the power of num_digits
    while (temp != 0) {
        int digit = temp % 10;
        y += pow(digit, num_digits);
        temp /= 10;
    }

    // Check if x equals y
    if (x == y) {
        printf("yes\n");
    } else {
        printf("no\n");
    }

    return 0;
}

