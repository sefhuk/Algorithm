function solution(arr) {
  const result = [];

  arr.reduce((acc, cur, idx) => {
    if (acc !== cur) result.push(cur);
    return cur;
  }, []);

  return result;
}