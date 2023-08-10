function solution(s, n) {
  return s
    .split('')
    .map((e) => {
      if (e === ' ') return ' ';
      return String.fromCharCode(getNext(e.charCodeAt(0), n));
    })
    .join('');
}

function getNext(now, n) {
  const isUpperCase = 65 <= now && now <= 90 ? true : false;
  if (isUpperCase) {
    if (65 <= now + n && now + n <= 90) {
      return now + n;
    } else {
      return now + n - 26;
    }
  } else {
    if (97 <= now + n && now + n <= 122) {
      return now + n;
    } else {
      return now + n - 26;
    }
  }
}