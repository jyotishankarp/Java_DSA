let n = 5;
function Fact(n) {
    if (n == 0)
        return 1;
    return n * Fact(n - 1);
}
console.log(Fact(n));