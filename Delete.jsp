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
    <form action="deleted">
        <h1>Student Details Delete</h1>
        <label for="">Enter student id:</label>
        <input type="text" name="sid" placeholder="id"><br>
        <button>Delete</button>
    </form>
    <h1>${deleted}</h1>
</body>
</html>