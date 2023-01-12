const solution = (common) => {
  const ratio = [common[1] - common[0], common[2] - common[1]];

  if (ratio[0] === ratio[1]) {
    return common[common.length - 1] + ratio[0];
  }
  return (common[common.length - 1] * common[1]) / common[0];
};