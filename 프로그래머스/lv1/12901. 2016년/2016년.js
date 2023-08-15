function solution(a, b) {
  const week = ['FRI', 'SAT', 'SUN', 'MON', 'TUE', 'WED', 'THU'];
  let days = 0;

  if (a !== 1)
    for (let i = 2; i <= a; i++) {
      if ([1, 3, 5, 7, 8, 10].includes(i - 1)) {
        days += 31;
      } else if ([4, 6, 9, 11].includes(i - 1)) {
        days += 30;
      } else {
        days += 29;
      }
    }

  days += b - 1;

  return week[days % 7];
}