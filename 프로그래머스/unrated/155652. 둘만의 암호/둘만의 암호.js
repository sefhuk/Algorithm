function solution(s, skip, index) {
  return s
    .split('')
    .map((element) => {
      let idx = 0;
      let code = element.charCodeAt();
      while (idx < index) {
        code === 122 ? (code = 97) : code++;
        if (!skip.includes(String.fromCharCode(code))) {
          idx++;
        }
      }
      return String.fromCharCode(code);
    })
    .join('');
}