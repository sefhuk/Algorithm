const solution = (id_pw, db) => {
  let id = id_pw[0];
  let pw = id_pw[1];
  let id_db = db.map((element) => element[0]);

  if (!id_db.includes(id)) {
    return 'fail';
  } else {
    let pwDb = db.filter((element) => element[0] === id);
    for (let i = 0; i < pwDb.length; i++) {
      if (pw === pwDb[i][1]) {
        return 'login';
      } else {
        return 'wrong pw';
      }
    }
  }
};