# Lotto Application

This is a simple lottery ticket machine designed to simulate purchasing tickets, entering winning numbers, and calculating winnings. It validates inputs carefully and provides detailed results and statistics based on the purchased tickets.

## Features to Implement

1. **Lottery Ticket Generation**
    - Validate purchase amount (must be positive and divisible by 1,000)
    - Generate tickets (6 unique random numbers between 1-45)
    - Display purchased tickets in sorted order

2. **Winning Numbers Processing**
    - Accept and validate 6 winning numbers (comma-separated, between 1-45, unique)
    - Accept and validate bonus number (between 1-45, not in winning numbers)

3. **Result Calculation**
    - Compare tickets with winning numbers to find matches
    - Determine prize rank for each matching ticket
    - Calculate statistics for each prize rank
    - Calculate overall return rate (rounded to the nearest tenth)

4. **User Interface**
    - Clear input prompts and output formatting
    - Display winning statistics in required format
    - Handle errors gracefully with descriptive messages

## Prize Structure
- 1st Prize: 6 matches → 2,000,000,000 KRW
- 2nd Prize: 5 matches + bonus → 30,000,000 KRW
- 3rd Prize: 5 matches → 1,500,000 KRW
- 4th Prize: 4 matches → 50,000 KRW
- 5th Prize: 3 matches → 5,000 KRW

## Exception Handling

The program will throw IllegalArgumentException for:
- Invalid purchase amount (not numeric, not positive, not divisible by 1,000)
- Invalid lottery numbers (not 6 numbers, out of range 1-45, duplicates)
- Invalid winning numbers format (not comma-separated, not parseable as integers)
- Invalid bonus number (not numeric, out of range, included in winning numbers)

All error messages will begin with "[ERROR]" and the program will re-prompt for input.

## Testing Strategy
- Test validation logic for all inputs
- Test number matching and ranking logic
- Test statistics and return rate calculations
- Ensure proper error messages are displayed