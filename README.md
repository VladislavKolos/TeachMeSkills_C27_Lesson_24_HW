# TeachMeSkills_C27_Lesson_24_HW
Homework for lesson #24

1. **Task #1**

The program parses XML files. When user enters 1 - parses using SAX, when user enters 2 - parses using DOM. A new file is created and the contents of the **"line"** tags are written to this file. The file name for the entry consists of tag values ​​and has the form: **"<firstName>_<lastName>_<title>.txt"**.
The program contains:
- Service classes:
- **"SaxParsing"** for parsing XML file using SAX with **"parseWithSax"** method which contains **"startElement"**, **"characters"** and **"endElement"** methods.
- **"DomParsing"** for parsing XML file using DOM with **"parseWithDom"** method.
- **"GettingFileName"** to get the file name to write with **"getFileName"** method.
- **"FileWriting"** to write the contents of a line tag to a file with **"writeToFile"** method;
- Class **"Runner"** with method **"main"** to run the program, if the user enters 1 from the console, the **"parseWithSax"** method is called and parsed using SAX if the user enters 2 from the console, the **"parseWithDom"** method is called and parsed using DOM.

Parsing file: **"initial_data.xml"**

Final file for recording: **"William_Shakespeare_Sonnet_130.txt"**
