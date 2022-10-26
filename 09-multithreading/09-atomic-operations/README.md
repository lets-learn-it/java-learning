# Atomic Operations

- All assignments to primitive types are safe except long & double.

  `volatile` can be used.

  ```java
  volatile double x = 1.0;
  volatile double y = 9.0;

  x = y; // atomic
  ```
- classes `java.util.concurrent.atomic` can be used for atomic operations.

## References

- [[1] https://www.baeldung.com/java-atomic-variables](https://www.baeldung.com/java-atomic-variables)


## Getting Started

Welcome to the VS Code Java world. Here is a guideline to help you get started to write Java code in Visual Studio Code.

## Folder Structure

The workspace contains two folders by default, where:

- `src`: the folder to maintain sources
- `lib`: the folder to maintain dependencies

Meanwhile, the compiled output files will be generated in the `bin` folder by default.

> If you want to customize the folder structure, open `.vscode/settings.json` and update the related settings there.

## Dependency Management

The `JAVA PROJECTS` view allows you to manage your dependencies. More details can be found [here](https://github.com/microsoft/vscode-java-dependency#manage-dependencies).
