# Read me

The original idea is from  
https://medium.com/@benweidig/templating-with-thymeleaf-from-basics-to-custom-dialects-3b33525f7c8d

# Simple Conditions:  th:if and th:unless

The th:if and th:unless attributes render their content their expressions. Unlike Java, there’s no explicit concept of
else, so the two attributes often complement each other:

```
<p th:if="${isLoggedIn}">Welcome back, <span th:text="${username}">johndoe0815</span>!</p>

<p th:unless="${isLoggedIn}">Please log in to continue.</p>
There are also and/or operators available to improve the conditional’s expression:

<div th:if="${user.isAdmin()} and ${user.lastLogin != null}">
  <p>Welcome back, Admin!</p>
</div>
```

# Switch Statements

If more than just a simple true or false is required for making a rendering decision based on a value,
there’s also a th:switch attribute, which is accompanied by th:case:

```
<div th:switch="${user.role}">
  <p th:case="'admin'">User is an administrator</p>
  <p th:case="'editor'">User is an editor</p>
  <p th:case="*">User is something else</p>
</div>
```

The * (asterisk) acts as the default cause.

# Iteration Status Variable

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