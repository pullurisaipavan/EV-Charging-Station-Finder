# EV-Charging-Station-Finder

This is a simple Java project that helps users find electric vehicle (EV) charging stations based on various filters (e.g., location, availability). It also allows booking charging slots in advance.

Project Structure
The project contains multiple Java classes, all located in the src folder:


EV-Charging-Station-Finder/
│
├── src/
│   ├── ChargingStation.java   # Defines charging station properties
│   ├── User.java              # Defines user properties
│   ├── Booking.java           # Manages booking-related functionalities
│   ├── Filters.java           # Implements filtering logic (by location, availability)
│   ├── Database.java          # Provides dummy data for charging stations
│   └── Main.java              # Entry point of the application
└── README.md
Features
Search Charging Stations: Allows users to search for charging stations based on location and filter those with available charging slots.
Book Charging Slots: Enables users to book charging slots in advance (the basic logic for this is set up and can be extended).
Simple Filtering: Provides filtering functionality for location and charging slot availability.
Getting Started
Prerequisites
Ensure you have the following installed:

Java Development Kit (JDK) (Version 8 or higher)
Visual Studio Code (VSCode) with the Java Extension Pack installed.
Running the Project
Clone the repository or download the source files.


git clone https://github.com/your-username/EV-Charging-Station-Finder.git
cd EV-Charging-Station-Finder
Open the folder in VSCode.

Ensure all Java files are located inside the src folder.

Compile and run the Main.java file using VSCode or the terminal:

Via VSCode: Open Main.java, right-click, and select Run Java.

Via terminal:

bash
Copy code
cd src
javac *.java  # Compiles all Java files
java Main     # Runs the Main class
Sample Input/Output
When prompted, enter a location to search for charging stations (e.g., New York).
The program will display available stations in that location and whether they have vacant slots.
Sample output:


Enter location to find charging stations:
New York
Charging stations available in New York:
ID: 1, Vacant Slots: true
