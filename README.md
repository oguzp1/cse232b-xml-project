# cse232b-xml-project
Project for the UCSD graduate level course CSE 232B.

## Run Instructions
```java -jar cse232b-xml-project.jar path/to/input.txt```

The program will output the result to stdout.

## Optimizations
If the program detects a join that it can optimize, it will write the optimized query in a file and then will evaluate
the optimized query. If the input query is at `a/b/c.txt`, the optimized query will be in `a/b/c_optimized.txt`.

### Joins and Cartesian Products
Joins in the grammar are of the form:

```join ( xq , xq , [ name (, name)* ] , [ name (, name)* ] ) ```

Cartesian products in the grammar are of the form:

```join ( xq , xq , [ ] , [ ] ) ```

These are parsed using the same rule. If there exists two or more transitive closures of variables without a join
condition in between in an optimizable query, the program will introduce cartesian products in the rewritten query.

### Join Order Heuristic
Roughly, the program will join certain sub-queries before others based on the following (in the order of importance):

- the sub-query has 1+ join condition mentioning one of its variables, i.e. no cartesian product needed.
- the sub-query has 1+ where condition(s) that concern(s) its variables.
- the sub-query has a low number of join conditions mentioning one of its variables, i.e. it directly joins with fewer
  sub-queries than other sub-queries.

## Grammar
The main grammar can be found in `src/main/antlr/XGrammar.g4`.

`src/main/antlr/XSimpleGrammar.g4` is used in order to filter implicit joins we can optimize, but is otherwwise not used
by the program for any parsing.