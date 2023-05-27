<!DOCTYPE html>
<html lang="en">
<head>
    <meta charset="UTF-8">
    <meta http-equiv="X-UA-Compatible" content="IE=edge">
    <meta name="viewport" content="width=device-width, initial-scale=1.0">
    <title>Document</title>
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
    <form action="details">
        <h1>Student Details</h1>
        <label for="">Enter student name:</label>
        <input type="text" name="name" placeholder="name"><br>
        <button>Fetch</button>
    </form>
    <h1>${name}</h1>
    <h1>${std}</h1>
    <h1>${gender}</h1>
    <h1>${age}</h1>
    <h1>${phno}</h1>
    <h1>${marks}</h1>
    <h1>${address}</h1>
</body>
</html>