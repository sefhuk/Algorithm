const solution = (id_list, report, k) => {
  let idObj = {};
  let result = {};
  for (let i = 0; i < id_list.length; i++) {
    idObj[id_list[i]] = [];
    result[id_list[i]] = 0;
  }

  report = report.map((element) => {
    return element.split(' ');
  });

  for (let i = 0; i < report.length; i++) {
    if (idObj[report[i][1]].includes(report[i][0])) continue;
    idObj[report[i][1]].push(report[i][0]);
  }

  for (let i = 0; i < id_list.length; i++) {
    if (idObj[id_list[i]].length >= k) {
      for (let j = 0; j < idObj[id_list[i]].length; j++) {
        result[idObj[id_list[i]][j]]++;
      }
    }
  }
  return Object.values(result);
};