const solution = (lines) => {
  let result = [];
  for (let i = 0; i <= 1; i++) {
    for (let j = i + 1; j <= 2; j++) {
      let one = lines[i];
      let two = lines[j];
      let arr = one[0] === two[0] ? [0] : [-1];
      for (let k = one[0]; k <= one[1]; k++) {
        if (k >= two[0] && two[1] >= k) {
          if (arr.length === 1) {
            arr = [k, k];
          } else {
            arr[1]++;
          }
        }
      }
      result.push(arr);
    }
  }

  result = result
    .sort((a, b) => {
      return a[0] - b[0];
    })
    .sort((a, b) => {
      return a[1] - b[1];
    })
    .filter((element) => {
      return element[0] !== -1 && element[0] !== element[1];
    });

  switch (result.length) {
    case 0:
      return 0;
    case 1:
      return result[0][1] - result[0][0];
    default:
      let overlap = 0;
      for (let i = 0; i <= result.length - 2; i++) {
        if (result[i][1] > result[i + 1][0]) {
          overlap += result[i][1] - result[i + 1][0];
        }
      }

      let sum = 0;
      for (let i = 0; i < result.length; i++) {
        sum += result[i][1] - result[i][0];
      }
      return sum - overlap;
  }
};