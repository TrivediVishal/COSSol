# Use an official OpenJDK image with the latest version
FROM openjdk:latest

# Set the working directory to /app
WORKDIR /app

# Copy the current directory contents into the container at /app
COPY . /app

# Compile the Java program
RUN javac Main.java

# Run the Java program when the container launches
CMD ["java", "Main"]