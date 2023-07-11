<html lang="en">
<head>
    <meta charset="UTF-8">
    <meta http-equiv="X-UA-Compatible" content="IE=edge">
    <meta name="viewport" content="width=device-width, initial-scale=1.0">
    <link rel="stylesheet" href="style.css">
    <title>Document</title>
</head>
<body>
<header>
    <h1>Resultado do processamento</h1>
    </header>
<main>
   <?php 
    $num1 = $_POST['NUM1'];
    $num2 = $_POST['NUM2'];
    $num3 = $_POST['NUM3'];
    $num4 =  pow($num1, 2) + pow($num2, 2)+ pow($num3, 2); 
    echo "A soma dos três números ao quadrado é: " . $num4;
    ?>
</body>
</html>