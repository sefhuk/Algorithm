const solution = (bin1, bin2) => {
  let dec1 = parseInt(bin1, 2);
  let dec2 = parseInt(bin2, 2);
  return (dec1 + dec2).toString(2);
};