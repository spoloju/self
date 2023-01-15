async function f() {

  let promise = new Promise((resolve, reject) => {
    setTimeout(() => resolve("After 1000ms result to be displayed!"), 1000)
  });

  let result = await promise; // wait until the promise resolves (*)

  console.log(result); 
}

f();