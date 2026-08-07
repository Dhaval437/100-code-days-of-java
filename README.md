# 100 Days of Java

A simple learning repository tracking exercises for "100 Days of Java." Each day contains a small Java program or exercise to practice core language features, algorithms, and API usage.

## Prerequisites
- Java Development Kit (JDK) 17 or newer installed. (JDK 25 LTS recommended)
- `java` and `javac` available on your `PATH`.

## Running examples
From the repository root you can compile and run individual day files.

- Compile then run:

  ```bash
  javac day1.java
  java day1
  ```

- Or run a single-file source directly (Java 11+):

  ```bash
  java day1.java
  ```

If your source files declare packages, compile/run using the package-aware layout or your IDE.

## Project layout
- `day1.java` — Day 1 example
- `README.md` — this file

Add new days following the existing pattern: create `dayN.java` (or `DayN.java`) containing a `public static void main(String[] args)` entry so it can be run directly.

## Contributing
- Add small, focused examples per day.
- Keep each file self-contained and runnable.
- Add a short comment at the top describing the exercise.

## Tools & Tips
- Use an IDE (IntelliJ IDEA, VS Code with Java extensions) for easier editing and running.
- Run `java -version` to confirm the active JDK.

## License
MIT License — feel free to reuse and learn from these examples.
