function factorial(n) {
  let f = 1;
  for (let i = 1; i <= n; i++) {
    f = f * i;
  }

  return f;
}

let z = factorial(5);
console.log("this i sthe factorial ", z);
