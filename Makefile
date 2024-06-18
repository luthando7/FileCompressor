# Target to clean the project (optional)
clean:
	mvn clean

# Target to compile the project (optional)
compile:
	mvn compile

# Target to run the program with arguments
install:
	mvn clean compile exec:java -DfilePath="readFile.txt"

run:
	mvn exec:java -DfilePath="readFile.txt"

# Define the main class name (replace with your actual main class)
MAIN_CLASS := # Replace with your main class name (e.g., org.yourpackage.Main)
