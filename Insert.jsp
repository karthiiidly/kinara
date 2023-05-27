<!DOCTYPE html>
<html lang="en">
<head>
    <meta charset="UTF-8">
    <meta http-equiv="X-UA-Compatible" content="IE=edge">
    <meta name="viewport" content="width=device-width, initial-scale=1.0">
    <title>Student managment</title>
    <style>
        form{
            line-height: 40px;
            text-align: center;
            margin-top: 200px;
            background-color: blue;
        }
        input{
            border: none;
        }
        button{
            border: none;
        }
    </style>
    
    
</head>
<body>
    <form action="inserted">
        <h1>Enter student Details</h1>
        <label for="">Enter student name:</label>
        <input type="text" name="name" placeholder="student name"><br>
        <label for="">Enter studnet class:</label>
        <input type="text" name="std" placeholder="class"><br>
        <label for="">Enter student marks:</label>
        <input type="text" name="marks" placeholder="marks"><br>
        <label for="">Enter student gender:</label>
        <input type="text" name="gender" placeholder="gender"><br>
        <label for="">Enter student age:</label>
        <input type="text" name="age" placeholder="age"><br>
        <label for="">Enter student phone number:</label>
        <input type="text" name="phno" placeholder="phone number"><br>
        <label for="">Enter student address:</label>
        <input type="text" name="address" placeholder="address"><br>
        <button>Submit</button>
    </form>
    <h1>${inserted}</h1>
</body>
</html>