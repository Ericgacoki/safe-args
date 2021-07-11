This command should fetch all objects from the JSON file that was imported as below:
```json
db.students.find()
{ "_id" : ObjectId("60db758c4a433597bcae61c0"), "student_number" : 1, "name" : "John Doe", "age" : 17, "Course" : "Computer Science" }
{ "_id" : ObjectId("60db758c4a433597bcae61c1"), "student_number" : 4, "name" : "John Dohn", "age" : 37, "Course" : "Political Science" }
{ "_id" : ObjectId("60db758c4a433597bcae61c2"), "student_number" : 2, "name" : "Joan Dee", "age" : 23, "Course" : "Computer Animation" }
{ "_id" : ObjectId("60db758c4a433597bcae61c3"), "student_number" : 3, "name" : "Jim Doeh", "age" : 19, "Course" : "Industrial Science" }
```
### Save JSON data to MongoDB Database
Now that we have imported a JSON file into MongoDB, we will add two records to the database then export the data to a new JSON file.
Use the command below to add records to the database:
```bash
db.students.insert({"student_number":5, "name":"Last student added", "age":22, "Course":"Engineering"})
```
You should get the response below in the terminal:
```bash
WriteResult({ "nInserted" : 1 })
```
Now if we run the command, we find an extra record in the database:
```bash
db.students.find()
```
```json
{ "_id" : ObjectId("60db758c4a433597bcae61c0"), "student_number" : 1, "name" : "John Doe", "age" : 17, "Course" : "Computer Science" }
{ "_id" : ObjectId("60db758c4a433597bcae61c1"), "student_number" : 4, "name" : "John Dohn", "age" : 37, "Course" : "Political Science" }
{ "_id" : ObjectId("60db758c4a433597bcae61c2"), "student_number" : 2, "name" : "Joan Dee", "age" : 23, "Course" : "Computer Animation" }
{ "_id" : ObjectId("60db758c4a433597bcae61c3"), "student_number" : 3, "name" : "Jim Doeh", "age" : 19, "Course" : "Industrial Science" }
{ "_id" : ObjectId("60db7a59ee65088f9b51677e"), "student_number" : 5, "name" : "Last student added", "age" : 22, "Course" : "Engineering" }
```
### Export JSON to MongoDB Database
Now let us export the new file to JSON using the following command:
```bash
mongoexport --db studentinfo --collection student --out d:\out.json --pretty
```
You should have the response below in your terminal:
