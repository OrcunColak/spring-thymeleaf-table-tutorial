# Iteration Status Variable

The original idea is from  
https://medium.com/@benweidig/templating-with-thymeleaf-from-basics-to-custom-dialects-3b33525f7c8d

There’s an optional status variable available that gives us additional information about the current iteration.

For example, if we need an index, we can access it via a special variable called iterState:

```
<ul>
  <li th:each="item, iterStat : ${items}" th:text="${iterStat.index} + ' - ' + ${item.name}">
      Item
  </li>
</ul>
```

As expected, the index starts at 0 (zero).

There are other properties available as well:

- count: Current iteration index, starting a 1 (one)
- size: Total amount of elements
- current: Current iteration variable
- even/odd: Indicates if the current iteration is even or odd (useful for alternating renders, like striped tables)
- first/last: Helps with rendering the first or last element differently

These properties cover many common use-cases encountered when trying to layout nice-looking HTML, as we often need to
treat the edges of repeating elements differently.