function solution(arr) {
  let counts = Array(arr.length).fill(0);
  arr.forEach(num => counts[num]++);
  counts = counts.filter(count => count > 1);
  if (counts.length === 0) {
    return [-1];
  }
  return counts;
}

console.log(solution([1, 2, 3, 4]));