function solution(array, commands) {
  return commands.reduce((acc, cur, idx) => {
    acc[idx] = array.slice(cur[0] - 1, cur[1]).sort((a, b) => a - b)[
      cur[2] - 1
    ];
    return acc;
  }, []);
}