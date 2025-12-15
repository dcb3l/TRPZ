This directory holds Maven Wrapper configuration.

Next steps to activate the wrapper on Windows:
1. Ensure Java (JDK 21) is installed and `JAVA_HOME` is set or `java` is accessible on PATH.
2. Run the wrapper script to bootstrap the wrapper jar and Maven distribution:

   mvnw.cmd -v

If the wrapper bootstrapping fails to download `maven-wrapper.jar`, download it manually from:
https://repo1.maven.org/maven2/io/takari/maven-wrapper/0.5.6/maven-wrapper-0.5.6.jar

Place the file at `.mvn/wrapper/maven-wrapper.jar` and re-run `mvnw.cmd`.
