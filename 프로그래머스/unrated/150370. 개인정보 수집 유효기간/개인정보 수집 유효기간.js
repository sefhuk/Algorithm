const solution = (today, terms, privacies) => {
  const todayArr = today.split('.').map((element) => Number(element));

  const termsObj = {};
  terms
    .map((element) => element.split(' '))
    .forEach((element) => {
      termsObj[element[0]] = Number(element[1]);
    });

  privacies = privacies.map((element) => {
    return element.split(' ');
  });

  privacies.forEach((element) => {
    element[0] = element[0].split('.').map((element) => {
      return Number(element);
    });
  });

  const lapseDate = [];
  console.log(privacies);
  privacies.forEach((element) => {
    let year = element[0][0];
    let month = element[0][1] + termsObj[element[1]];
    if (month > 12) {
      if (month % 12 === 0) {
        year += parseInt(month / 12) - 1;
        month = 12;
      } else {
        year += parseInt(month / 12);
        month = month % 12;
      }
    }
    lapseDate.push([year, month, element[0][2]]);
  });

  let result = [];
  for (let i = 0; i < lapseDate.length; i++) {
    if (isDestroy(lapseDate[i], todayArr)) result.push(i + 1);
  }

  return result;
};

const isDestroy = (date, today) => {
  if (date[0] < today[0]) return true;
  if (date[0] > today[0]) return false;

  if (date[1] < today[1]) return true;
  if (date[1] > today[1]) return false;

  if (date[2] <= today[2]) return true;
  if (date[2] > today[2]) return false;
};