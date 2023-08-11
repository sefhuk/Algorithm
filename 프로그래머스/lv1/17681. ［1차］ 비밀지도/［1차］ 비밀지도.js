function solution(n, arr1, arr2) {
  return arr1
    .reduce((acc, cur, idx) => {
      acc[idx] = (cur | arr2[idx]).toString(2);
      return acc;
    }, [])
    .map((e) => (e.length < n ? '0'.repeat(n - e.length) + e : e))
    .map((e) => {
      return e
        .split('')
        .map((e) => (e === '1' ? '#' : ' '))
        .join('');
    });
}