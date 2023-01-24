# -FileCopier
In this File Copier program we can copy our files exactly like Windows file copy mechanism.

<h3>Description</h3>
here is some description of the code,

firstly we import java.io for File Input / output process.

java use the concept of stream to make I/O fast. The reason to use Stream is for the good flow of data.

java have in-built feture to input / output files.

we use FileInputStream to input file and FileOutputStream to output the file or data.]

here we use throws IOException keyword because it gives an information to the programmer that there may occur an exception.

Then we create two new objects for Input and Output and we gave the path form where we input that file and where we want that file as an output.

then we create one int c for storing data.

then we take while loop till the end. till -1. using .read().
parallelly we use .Write() to write the data.

after this we simply print "File Copied" to conferm that our data is printed successfully.



in above code we opened the file so the space is occupied so we have to empty that space for that we have to close all the files.

we use finally key-word to automatically execute the code all the time.

we use if contadtion if file is not null then close that file because if the file is null then they doesn't occupied any space and also if the output file is not null then close that file.


<h3> Output</h3>

![Screenshot (4)](https://user-images.githubusercontent.com/84063889/214263111-d1523499-6f8a-42d5-b7e6-1a121ecf4949.png)

![Screenshot (6)](https://user-images.githubusercontent.com/84063889/214263245-7a851bce-f7a6-419d-bc44-d7edffdc2ab6.png)

<br>
<br>

<h1> Another Approach I Tried Is Jav2 </h1>
