function solution(n, m, section) {
  const area = new Array(n).fill(1);
  section.forEach((e) => (area[e - 1] = 0));

  let answer = 0;
  for (let i = section[0] - 1; i <= n - m; i++) {
    if (area[i] === 0) {
      answer++;
      area.splice(i, m, ...new Array(m).fill(1));
    }
  }

  if (area.includes(0)) answer++;
  
  return answer;
}