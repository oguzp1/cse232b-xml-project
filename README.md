# cse232b-xml-project
Project for the UCSD graduate level course CSE 232B.
## Run Instructions
```java -jar cse232b-xml-project.jar path/to/input.txt```

The program will output the result to stdout.
## Optimizations
If the program detects a join that it can optimize, it will write the optimized query in a file and then will evaluate
the optimized query. If the input query is at `a/b/c.txt`, the optimized query will be in `a/b/c_optimized.txt`.
