const solution = (sides) => {
  let cnt = 0;
  //가장 긴 변이 sides에 있을 경우
  let max = Math.max(...sides);
  for (let i = 1; i < max; i++) {
    if (isTriangle([...sides, i])) cnt++;
  }

  //나머지 한 변이 가장 긴 경우
  let sum = sides[0] + sides[1];
  for (let i = max; i < sum; i++) {
    if (isTriangle([...sides, i])) cnt++;
  }

  return cnt;
};

const isTriangle = (arr) => {
  for (let i = 0; i < 2; i++) {
    for (let j = i + 1; j < 3; j++) {
      let other = [0, 1, 2];
      other = other.filter((element) => {
        return element !== i && element !== j;
      });
      if (arr[other[0]] >= arr[i] + arr[j]) {
        return false;
      }
    }
  }
  return true;
};