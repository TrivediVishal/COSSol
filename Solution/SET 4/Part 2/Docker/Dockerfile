# Use an official OpenJDK image with JDK
FROM openjdk:11

# Set the working directory to /app
WORKDIR /app

# Copy the Java source code into the container
COPY SumOfDigits.java /app/

# Compile the Java code
RUN javac SumOfDigits.java

# Command to run the Java program
CMD ["java", "SumOfDigits"]
