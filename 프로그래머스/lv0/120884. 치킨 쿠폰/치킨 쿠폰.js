const solution = (chicken) => {
  return getService(chicken);
};

const getService = (coupon) => {
  let chicken = parseInt(coupon / 10);
  let remainder = coupon % 10;
  if (chicken + remainder < 10) return chicken;
  return chicken + getService(chicken + remainder);
};