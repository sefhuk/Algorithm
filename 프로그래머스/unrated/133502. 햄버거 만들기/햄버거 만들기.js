const solution = (ingredient) => {
  const burger = [];
  const stack = [];
  let result = 0;
  for (let i = 0; i < ingredient.length; i++) {
    stack.push(ingredient[i]);
    if (stack.slice(stack.length - 4).join('') === '1231') {
      result++;
      stack.splice(stack.length - 4);
    }
  }
  return result;
};