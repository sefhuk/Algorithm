function solution(nums) {
  const tmp = [...new Set(nums)];
  return tmp.length < nums.length / 2 ? tmp.length : nums.length / 2;
}