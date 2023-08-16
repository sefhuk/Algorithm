function solution(n) {
  let arr = new Array(n).fill(0).reduce((acc, _, idx) => {
    acc[idx] = idx + 1;
    return acc;
  }, []);
  arr[0] = 0;

  for (let i = 1; i < Math.sqrt(n) - 1; i++) {
    if (arr[i] === 0) continue;
    for (let j = arr[i] * 2 - 1; j < arr.length; j += arr[i]) {
      arr[j] = 0;
    }
  }

  return arr.filter((val) => val !== 0).length;
}