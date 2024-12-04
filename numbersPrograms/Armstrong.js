function numPow(n) {
  console.log("n", n);
  let res = 0;
  console.log("res ", res);
  while (n > 0) {
    n = Math.floor(n / 10);
    console.log("n  pp ", n);
    res = res + 1;
  }
  console.log("res ", res);
  return res;
}

function isArmstrong(n) {
  let p = numPow(n);
  console.log("this is p ", p);
  let temp = n;
  let arm = 0;
  let r;
  while (temp > 0) {
    r = temp % 10;
    temp = Math.floor(temp / 10);
    arm += Math.pow(r, p);
  }

  if (arm === n) {
    console.log(`Armstrong numbers arm= ${arm} and n =  ${n}`);
  } else {
    console.log(`Not the arm stromg number  arm= ${arm} and n =  ${n}`);
  }
}

isArmstrong(153);
