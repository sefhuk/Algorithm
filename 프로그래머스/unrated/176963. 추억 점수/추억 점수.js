function solution(name, yearning, photo) {
  const answer = [];

  photo.forEach((e) => {
    const sum = e.reduce((acc, cur) => {
      return name.includes(cur) ? acc + yearning[name.indexOf(cur)] : acc;
    }, 0);

    answer.push(sum);
  });

  return answer;
}