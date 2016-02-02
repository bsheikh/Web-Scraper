# WebStats

The application is a statistical web crawler. Given an initial URL as a command line argument, visit connecting pages and gather statistics on the pages. The program will maximize the use of cores(via threads).

### How to run program

```java
javac *.java
java WebStats -pages 20 -path 2 someURL
```
