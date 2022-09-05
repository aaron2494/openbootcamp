let factorial =1;
for (let i = 10; i > 0; i--){
    factorial *=i;
}
console.log(factorial)

let fact=1;
let num=10;
while(num>1){
    fact*=num
    num--
}
console.log(fact)

let fac = 1
let nums = 10
while (true) {
    fac *= nums
    nums--
    if (nums === 1) break
}
console.log(fac)