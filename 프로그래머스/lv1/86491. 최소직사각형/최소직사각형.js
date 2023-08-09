function solution(sizes) {
  const arr = sizes.map((e) => e.sort((a, b) => a - b));

  let max = [0, 0];
  for (let i = 0; i < arr.length; i++) {
    if (max[0] < arr[i][0]) max[0] = arr[i][0];
    if (max[1] < arr[i][1]) max[1] = arr[i][1];
  }

  return max[0] * max[1];
}