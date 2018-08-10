# Kotlin practice

This a demo repo for Kotlin practice.

# Build setup

 - Generating the gradlew by gradle command line:
 
 
  ```bash
  $ gradle wrapper --gradle-version 4.9 --distribution-type bin
  ```
 
 
 - Creating a *build.gradle* file manually for this project and unit testing.

 - Run UT
 
 
   ```bash
   $ ./gradlew test
   ```
   
 - Build java
 
 
   ```bash
   $ ./gradlew java
   ```
   
 - Gen Doc
 
   > The default dir is *"build\javadoc"*
 
   ```bash
   $ ./gradlew dokka
   ```
   