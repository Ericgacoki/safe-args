This command should fetch all objects from the JSON file that was imported as below:
```bash
{ "_id" : ObjectId("60db758c4a433597bcae61c0"), "student_number" : 1, "name" : "John Doe", "age" : 17, "Course" : "Computer Science" }
{ "_id" : ObjectId("60db758c4a433597bcae61c1"), "student_number" : 4, "name" : "John Dohn", "age" : 37, "Course" : "Political Science" }
{ "_id" : ObjectId("60db758c4a433597bcae61c2"), "student_number" : 2, "name" : "Joan Dee", "age" : 23, "Course" : "Computer Animation" }
{ "_id" : ObjectId("60db758c4a433597bcae61c3"), "student_number" : 3, "name" : "Jim Doeh", "age" : 19, "Course" : "Industrial Science" }
```
### Save JSON data to MongoDB Database
Now that we have imported a JSON file into MongoDB, we will add two records to the database then export the data to a new JSON file.
Use the command below to add records to the database:
```shell
db.students.insert({"student_number":5, "name":"Last student added", "age":22, "Course":"Engineering"})
```
You should get the response below in the terminal:
```shell
WriteResult({ "nInserted" : 1 })
```
