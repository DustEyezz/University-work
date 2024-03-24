function fibonacci(num) {
    if (fibonacci.cache[num] !== null) {
        return fibonacci.cache[num];
    }
    
    if (num <= 1) {
        fibonacci.cache[num] = 1;
        return 1;
    }

    fibonacci.cache[num] = fibonacci(num - 1) + fibonacci(num - 2);
    
    return fibonacci(num - 1) + fibonacci(num - 2);
    
}
fibonacci.cache = {};

console.log(fibonacci(5));