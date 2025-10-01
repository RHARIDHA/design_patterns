# Astronaut Daily Schedule Organizer

A console-based Java application to help astronauts organize their daily schedules efficiently. This project demonstrates best practices in coding, including design patterns, SOLID principles, and robust error handling.

## Project Overview

This application allows users to add, remove, and view daily astronaut tasks with scheduled start and end times. It validates tasks to ensure no time overlaps and notifies users of conflicts. The main design patterns used are:

- **Singleton Pattern:** Ensures a single instance of the schedule manager.
- **Factory Pattern:** Creates Task objects.
- **Observer Pattern:** Notifies users of scheduling conflicts and updates.

## Features

- Add tasks with descriptions, start time, end time, and task type.
- Remove tasks by name.
- View all scheduled tasks sorted by start time.
- Validation to prevent overlapping tasks.
- Console notifications on task conflicts.
- Exception handling and input validation.
- Modular design with clear separation of concerns.

