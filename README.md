
## The Oldest Book by the Author with the Most Books

### Program Overview
Have you ever wondered which author writes the most books? Have you
wondered, as a child, your favorite author's earliest-published book? 
In this program, you might be able to find the answer.

#### Program components
This program contains four Java files (one class per file). 
The `Author` class contains
the information about an author. The `Book` class includes the information
about a given book. The `Library` class builds the connection between
an author and his/her books. The `Main` class is the drive class in this
program. It accpets user inputs and output the result.


#### Built With
This program is coded entirely with Java SE on the integrated
development environment, IntelliJ.

### Getting Started
To run this program, you can use any code editors, IDEs, or
terminal (Mac). In this section, I will explain how to compile
and run this program with Mac terminal and IntelliJ.

### Prerequisites
To run this program with Mac terminal, you don't need to
install any software. To run this program with IntelliJ,
you need to download it from the [website](https://www.jetbrains.com/idea/) and install
it on your computer.

### Compiling the Program
To compile this program with terminal
- First, use `cd` linux command to set the current directory
to be the folder where it contains the program.
- Second, type the following commands (in order) to compile
all the necessary classes of this program.
    - `javac Author.java`
    - `javac Book.java`
    - `javac Library.java`
    - `javac Main.java`

To compile this program with IntelliJ, copy all the
Java classes into the working directory and you are all
set.

### Running the Program
#### Input Requirements
In the `Main` class, it allows two different ways
to input the data. The first one is manually typing all
the input strings, and the second one is to input the data
through a CSV file. By default, the program uses the second way to
take input. The input data is stored in the file, `input.csv`. If you
want to change the way to input the data, simply comment out the current
main method, and uncomment the first main method.

Each input string must be in the following format, "TITLE, DATE OF PUBLICATION,
AUTHOR, LENGTH". The TITLE field should contain no punctuation of any kind.
The DATE OF PUBLICATION should be formatted as "mm/dd/yyyy". Each input
string should start on a new line.

#### Output format
This program outputs the result in the following format, "TITLE, written 
by GENRE writer AUTHOR on DATE OF PUBLICATION is LENGTH pages long."

#### Operate the Program
To run this program using Mac terminal
- In the working directory, type `java Main`

To run this program using IntelliJ
- Go to the `Main` class
- Click the green icon in the gutter near the class declaration 
and select `Run Main.main()`

### Contact
I would love to welcome any advice and comments to further improve my
project. You could contact me in one of the following ways.

Yi Ding -[My LinkedIn Page](https://www.linkedin.com/in/yi-kevin-ding-1ba281213/)

Email - kevinryiding@gmail.com